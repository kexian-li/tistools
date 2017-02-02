/**
 * 
 */
package org.tis.tools.maven.plugin.gendao.ermaster;

import java.util.ArrayList;
import java.util.List;

import org.tis.tools.maven.plugin.exception.AssemblyERMaster2BIzmodelException;
import org.tis.tools.maven.plugin.gendao.BizModel;
import org.tis.tools.maven.plugin.gendao.Field;
import org.tis.tools.maven.plugin.gendao.Model;
import org.tis.tools.maven.plugin.gendao.ermaster.dom4j.ERMasterModel;
import org.tis.tools.maven.plugin.gendao.ermaster.dom4j.ModelPropertyEnum;
import org.tis.tools.maven.plugin.gendao.ermaster.dom4j.NormalColumn;
import org.tis.tools.maven.plugin.gendao.ermaster.dom4j.Table;
import org.tis.tools.maven.plugin.gendao.ermaster.dom4j.Word;

/**
 * 
 * ERMaster模型定义适配为BizModel<br/>
 * 
 * （为了用ERMaster定义出来的模型直接生成DAO代码）
 * 
 * @author megapro
 *
 */
public class ERMasterDefinition extends BizModel{
	
	private ERMasterModel ermm ; 
	private BizModel bizModel ; 
	
	public ERMasterDefinition(ERMasterModel ermm){
		
		this.ermm = ermm ; 
		
		//把ERMasterModel装配并适配为BizModel对象
		bizModel = assemble(ermm) ;
	}
	
	public ERMasterModel getERMasterModel(){
		return this.ermm ;
	}
	
	public BizModel getBizModel(){
		return this.bizModel ; 
	}
	
	
	
	/**
	 * 适配新的BizModel对象
	 * @param ermm2 ERMaster模型信息
	 * @return 适配后的BizModel对象
	 */
	private BizModel assemble(ERMasterModel ermm) {
		
		BizModel b = new BizModel() ;
		
		b.setDesc(ermm.getModelPropertyValue(ModelPropertyEnum.MP_PROJECT_NAME));

		b.setId(ermm.getModelPropertyValue(ModelPropertyEnum.MP_MODEL_NAME));
		
		b.setMainpackage(ermm.getSettings().getPackageName());
		
		b.setModelDefFile(ermm.getErmasetFileName());
		
		b.setModels(assembleModel(ermm));
		
		b.setName(ermm.getModelPropertyValue(ModelPropertyEnum.MP_MODEL_NAME));
		
		b.setPrjCore(ermm.getModelPropertyValue(ModelPropertyEnum.MP_PRJ_CODE));
		
		b.setPrjFacade(ermm.getModelPropertyValue(ModelPropertyEnum.MP_PRJ_FACADE));
		
		b.setPrjService(ermm.getModelPropertyValue(ModelPropertyEnum.MP_PRJ_SERVICE));
		
		b.setPrjWeb(ermm.getModelPropertyValue(ModelPropertyEnum.MP_PRJ_WEB));
		
		return b;
	}
	
	private List<Model> assembleModel(ERMasterModel ermm) {
		
		List<Model> mList = new ArrayList<Model>() ; 
		//每个ERMaster中的表定义为一个Model //TODO 还没有考虑Table之外的模型解析和映射
		for( Table t : ermm.getTables() ){
			
			Model m = new Model() ; 
			
			m.setDesc(t.getDescription());
			m.setExt("");//ERMaster定义时，不支持 ext:3:198 的方式定义扩展字段
			m.setFields(assembleField(ermm,t ));
			m.setId(t.getPhysicalName());
			m.setName(t.getLogicalName());
			m.setType("");
			
			mList.add(m) ; 
		}
		
		return mList;
	}

	private List<Field> assembleField(ERMasterModel ermm, Table t ) {
		
		List<Field> fList = new ArrayList<Field>() ; 
		
		for( NormalColumn c : t.getNormalColumns() ){
			
			// ERMaster中表的字段都对应到某个字典
			Word w = ermm.getWordById(c.getWordId());
			if (null == w) {
				throw new AssemblyERMaster2BIzmodelException(
						"找不到<" + c.getWordId() + ">对应的模型字典定义!" + "请检查ERMaster定义文件<" + ermm.getErmasetFileName() + ">!");
			}
			
			Field f = new Field() ;
			f.setDesc(w.getDescription());
			f.setForm("");
			f.setId(w.getPhysicalName());
			f.setKey(c.getPrimaryKey());
			f.setLength(w.getLength());
			f.setName(w.getLogicalName());
			f.setPhysical("true");//因为ERMaster中以Table方式定义，所有都要生成数据库字段
			f.setSearch("");
			f.setType(w.getType());
			
			fList.add(f) ;
		}
		
		return fList;
	}
	
}
