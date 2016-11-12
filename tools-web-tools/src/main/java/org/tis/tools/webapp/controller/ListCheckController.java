package org.tis.tools.webapp.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.tis.tools.base.web.controller.BaseController;
import org.tis.tools.base.web.util.AjaxUtils;

import bos.tis.biztrace.upload.FileUploadServiceI;
import bos.tis.biztrace.upload.FileUploadServiceImpl;
import bos.tis.lpctools.entity.CommitListContent;
import bos.tis.lpctools.handler.CompareHandler;
import bos.tis.lpctools.handler.PackageHandler;
import bos.tis.lpctools.util.HelperUtil;
import bos.tis.lpctools.util.ParamsConfig;
import bos.tis.lpctools.util.SvnUtil;

@Controller
@RequestMapping("/ListCheckController")
public class ListCheckController extends BaseController{
	@RequestMapping("/upload")
	public String upload(ModelMap model,@RequestParam MultipartFile file,
			HttpServletRequest request,HttpServletResponse response){
		try {			
			logger.info("ListCheckController upload request : " + file);
		
			InputStream data = file.getInputStream();			
			FileUploadServiceI uploader = new FileUploadServiceImpl();
			uploader.upload("ListCheck/"+file.getOriginalFilename(), data);		 
			
			logger.info("ListCheckController upload response : 文件上传成功!");
			AjaxUtils.ajaxJsonSuccessMessage(response, "success");
		} catch (Exception e) {
			AjaxUtils.ajaxJsonErrorMessage(response, e.getMessage());
			logger.error("ListCheckController upload exception : " ,e);
		}
		return null;		
	}
		
	@RequestMapping("/importFile")
	public String importFile(ModelMap model,@RequestBody String content,
			HttpServletRequest request,HttpServletResponse response){
		try {			
			logger.info("ListCheckController importFile request : " + content);
			
			//JSONObject jsonObj = JSONObject.fromObject(content);
			//String listPath =  jsonObj.getString("listPath");
			//String packagePath =  jsonObj.getString("packagePath");
			String packagePath = "E:/fileUpload/ListCheck";
			
			//List<File> listFiles = HelperUtil.listFiles(listPath,".xls");
			List<File> packageFiles = HelperUtil.listFiles(packagePath,".zip");
			
//			List<String> listFileNames = new ArrayList<String>();
//			for(File file : listFiles){
//				listFileNames.add(file.getName());
//				
//				List<Map<String,String>> contents = HelperUtil.readExcel(file.getAbsolutePath());
//				
//				ExcelHandler.instance.savaExcelContent(file.getName(), contents);
//			}
			
			List<String> packageFileNames = new ArrayList<String>();
			for(File file : packageFiles){
				String fileName = file.getName();
				packageFileNames.add(file.getName());
				
				PackageHandler.instance.dePackageHandle(file.getAbsolutePath(), 
						ParamsConfig.zipFileDecompassPath+File.separator+fileName.substring(0, fileName.lastIndexOf(".")));
			}
			
			Map<String,List<String>> result = new HashMap<String,List<String>>();
			//result.put("commit_list", listFileNames);
			result.put("package_list", packageFileNames);
			
			AjaxUtils.ajaxJson(response, JSONObject.fromObject(result, jsonConfig).toString());
			logger.info("ListCheckController importFile response : " + result);
		} catch (Exception e) {
			AjaxUtils.ajaxJsonErrorMessage(response, e.getMessage());
			logger.error("ListCheckController importFile exception : " ,e);
		}
		return null;		
	}
	
	@RequestMapping("/checkList")
	public String checkList(ModelMap model,@RequestBody String content,
			HttpServletRequest request,HttpServletResponse response){
		try {			
			logger.info("ListCheckController checkList request : " + content);
			
			JSONObject jsonObj = JSONObject.fromObject(content);
			JSONArray featureInfoList = jsonObj.getJSONArray("featureInfoList");
			String svnUserName = jsonObj.getString("svnUserName");
			String svnPassword = jsonObj.getString("svnPassword");
			Object[] jsonArry1 = jsonObj.getJSONArray("selectedCommitFiles").toArray();
			Object[] jsonArry2 = jsonObj.getJSONArray("selectedPackageFiles").toArray();
//			List<String> selectedCommitFiles =  (List<String>) jsonObj.get("selectedCommitFiles");
//			List<String> selectedPackageFiles =  (List<String>) jsonObj.get("selectedPackageFiles");
			
			final List<String> selectedPackageFileList = new ArrayList<String>();
			for(int j=0;j<jsonArry2.length;j++){
				String fileName = (String) jsonArry2[j];		
				selectedPackageFileList.add(fileName);
			}
			
			CompareHandler.results.clear();
			//Map<String,String> featureMap = CompareHandler.instance.getAllFeatures();
			Map<String,String> featureMap = new HashMap<String,String>();
			for(int i=0;i<featureInfoList.size();i++){
				JSONObject json = featureInfoList.getJSONObject(i);
				String listFileName = json.getString("listFileName");
				String branchId = json.getString("branchId");
				featureMap.put(listFileName, branchId);
			}
						
			//List<CommitListContent> commitListContents = new ArrayList<CommitListContent>();
			for(int i=0;i<jsonArry1.length;i++){
				String fileName = (String) jsonArry1[i];
				
				//List<CommitListContent> commitListContents = ExcelHandler.instance.getExcelConetent(fileName);
				ByteArrayOutputStream baos = SvnUtil.displayFile(svnUserName, svnPassword, fileName);
				List<Map<String,String>> rowcontents = HelperUtil.readListContent(baos);
				
				List<CommitListContent> commitListContents = new ArrayList<CommitListContent>();
				for(Map<String,String> map : rowcontents){
					//System.out.println(map);
					CommitListContent commitListContent = new CommitListContent(
							map.get("project_name"),
							map.get("import_type"),
							map.get("import_name"),
							map.get("deploy_position"),
							map.get("code_path"),
							map.get("version"),
							map.get("per_version"),
							map.get("submitter"));
					commitListContents.add(commitListContent);
				}
				CompareHandler.instance.checkPackageByList(fileName, commitListContents, selectedPackageFileList,svnUserName,svnPassword,featureMap);

			}
						 
			
			AjaxUtils.ajaxJson(response, JSONArray.fromObject(CompareHandler.results, jsonConfig).toString());
			logger.info("ListCheckController checkList response : " + CompareHandler.results);
		} catch (Exception e) {
			AjaxUtils.ajaxJsonErrorMessage(response, e.getMessage());
			logger.error("ListCheckController checkList exception : " ,e);
		}
		return null;		
	}
	
	
//	@RequestMapping("/getList")
//	public String getList(ModelMap model,@RequestBody String content,
//			HttpServletRequest request,HttpServletResponse response){
//		try {			
//			logger.info("ListCheckController getList request : " + content);
//			
//			JSONObject jsonObj = JSONObject.fromObject(content);
//			String svnUserName = jsonObj.getString("svnUserName");
//			String svnPassword = jsonObj.getString("svnPassword");
//			
//			List<String> lists = CompareHandler.instance.getAllList(svnUserName, svnPassword);			 
//			
//			AjaxUtils.ajaxJson(response, JSONArray.fromObject(lists, jsonConfig).toString());
//			logger.info("ListCheckController getList response : " + lists);
//		} catch (Exception e) {
//			AjaxUtils.ajaxJsonErrorMessage(response, e.getMessage());
//			logger.error("ListCheckController getList exception : " ,e);
//		}
//		return null;		
//	}
}
