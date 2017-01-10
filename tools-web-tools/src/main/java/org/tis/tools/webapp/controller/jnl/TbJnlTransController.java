
/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.webapp.controller.jnl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.tis.tools.model.po.jnl.TbJnlTrans;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.webapp.controller.BaseController;
import com.alibaba.dubbo.config.annotation.Reference;
import org.tis.tools.rservice.jnl.ITbJnlTransRService;
import org.tis.tools.webapp.util.AjaxUtils;
import org.tis.tools.webapp.util.JSONUtils;
import org.tis.tools.base.Page;

 /**
 * <pre>
 * auto generated by mvn bronsp:gen-dao , don't change</br>
 * 业务域jnl中模型tb_jnl_trans的控制器
 * 定义文件：/Users/megapro/Develop/tis/tools/tools-core/model/model-jnl.xml
 * </pre>
 */
@Controller
@RequestMapping(value = "/jnl")
public class TbJnlTransController extends BaseController {

	@Reference(group="jnl",version="1.0",interfaceClass=ITbJnlTransRService.class)
	ITbJnlTransRService tbJnlTransRService;
	
	@RequestMapping(value = "/tbJnlTrans/edit")
	public String execute(ModelMap model, @RequestBody String content,
			String age, HttpServletRequest request, HttpServletResponse response) {
		try {
			JSONObject jsonObj = JSONObject.fromObject(content);
			JSONObject job = jsonObj.getJSONObject("item");
			TbJnlTrans p = new TbJnlTrans();
			JSONObject.toBean(job,p,jsonConfig);
			String id = sequenceService.generateId("TbJnlTrans");
			if (StringUtils.isNotEmpty(p.getId())) {
				tbJnlTransRService.update(p);
			} else {
				p.setId(id);
				//initCreate(p, request);
				tbJnlTransRService.insert(p);
			}
			AjaxUtils.ajaxJson(response, JSONObject.fromObject(p).toString());
		} catch (Exception e) {// TODO
			AjaxUtils.ajaxJsonErrorMessage(response, "添加失败!");
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/tbJnlTrans/delete")
	public String execute3(ModelMap model, @RequestBody String content,
			String age, HttpServletRequest request, HttpServletResponse response) {
		try {
			JSONArray jsonArray = JSONArray.fromObject(content);
			List<TbJnlTrans> list = new ArrayList<TbJnlTrans>();
			for (int i = 0; i < jsonArray.size(); i++) {
				TbJnlTrans p = new TbJnlTrans();
				JSONObject.toBean(JSONObject.fromObject(jsonArray.get(i)),p,jsonConfig);
				list.add(p);
			}
			List<String> ids = new ArrayList<String>();
			for (TbJnlTrans p : list) {
				ids.add(p.getId());
			}
			WhereCondition wc = new WhereCondition();
			wc.andIn("id", ids);
			tbJnlTransRService.deleteByCondition(wc);
			AjaxUtils.ajaxJson(response, "");
		} catch (Exception e) {// TODO
			AjaxUtils.ajaxJsonErrorMessage(response, "删除失败!");
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/tbJnlTrans/list")
	public String execute1(ModelMap model, @RequestBody String content,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			JSONObject jsonObj = JSONObject.fromObject(content);
			// 分页对象
			Page page = getPage(jsonObj);
			// 服务端排序规则
			String orderGuize = getOrderGuize(JSONUtils.getStr(jsonObj, "orderGuize"));
			// 组装查询条件
			WhereCondition wc = new WhereCondition();
			wc.setLength(page.getItemsperpage());
			wc.setOffset((page.getCurrentPage() - 1) * page.getItemsperpage());
			wc.setOrderBy(orderGuize);
			initWanNengChaXun(jsonObj, wc);// 万能查询
			List list = tbJnlTransRService.query(wc);
			JSONArray ja = JSONArray.fromObject(list,jsonConfig);
			page.setTotalItems(tbJnlTransRService.count(wc));
			Map map = new HashMap();
			map.put("page", page);
			map.put("list", ja);
			String s=JSONObject.fromObject(map,jsonConfig).toString();
			AjaxUtils.ajaxJson(response,s );
		} catch (Exception e) {// TODO
			AjaxUtils.ajaxJsonErrorMessage(response, "查询失败!");
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value = "/tbJnlTrans/list/id")
	public String executesd1(ModelMap model, @RequestBody String content,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			JSONObject jsonObj = JSONObject.fromObject(content);
			TbJnlTrans k =  tbJnlTransRService.loadById(JSONUtils.getStr(jsonObj, "id"));
			JSONObject jo = JSONObject.fromObject(k,jsonConfig);
			AjaxUtils.ajaxJson(response, jo.toString());
		} catch (Exception e) {// TODO
			AjaxUtils.ajaxJsonErrorMessage(response, "查询失败!");
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 每个controller定义自己的返回信息变量
	 */
	private Map<String, Object> responseMsg ;
	@Override
	public Map<String, Object> getResponseMessage() {
		if( null == responseMsg ){
			responseMsg = new HashMap<String, Object> () ;
		}
		return responseMsg ;
	}
}
