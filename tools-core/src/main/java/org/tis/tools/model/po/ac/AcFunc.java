/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.model.po.ac;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Time;
import java.util.Date;

import org.tis.tools.common.utils.StringUtils;

/**
 * 
 * <pre>
 * 功能
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/ABF-mysql.erm
 * 业务域：ac
 * 模型：AC_FUNC 功能
 *
 * 功能定义表，每个功能属于一个功能点，隶属于某个应用系统，同时也隶属于某个功能组。
应用系统中的某个功能，如：柜面系统中的一个交易，柜面系统上软叫号功能组的‘呼号’功能。
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class AcFunc implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	private String guid ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidFuncgroup ;
	
	/** 字段类型：varchar<br/>字段名：功能编号<br/>描述：业务上对功能的编码 */
	private String funcCode ;
	
	/** 字段类型：varchar<br/>字段名：功能名称<br/>描述： */
	private String funcName ;
	
	/** 字段类型：varchar<br/>字段名：功能描述<br/>描述： */
	private String funcDesc ;
	
	/** 字段类型：varchar<br/>字段名：功能调用入口<br/>描述： */
	private String funcAction ;
	
	/** 字段类型：varchar<br/>字段名：输入参数<br/>描述：需要定义参数规范 */
	private String paraInfo ;
	
	/** 字段类型：varchar<br/>字段名：功能类型<br/>描述：取值来自业务菜单：DICT_AC_FUNCTYPE 如：页面流、交易流、渠道服务、柜面交易... */
	private String funcType ;
	
	/** 字段类型：char<br/>字段名：是否验证权限<br/>描述：取值来自业务菜单： DICT_YON */
	private String ischeck ;
	
	/** 字段类型：char<br/>字段名：可否定义为菜单<br/>描述：取值来自业务菜单：DICT_YON。 该功能是否可以作为菜单入口，如果作为菜单入口，则会展示在菜单树（有些接口服务功能无需挂在菜单上） */
	private String ismenu ;
	
	
	/**
	 * Set the 数据主键.
	 * 
	 * @param guid
	 *            数据主键
	 */
	public void setGuid(String guid) {
 		this.guid = guid == null ? null : guid.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuid(){
		return this.guid ;
    }
	
	/**
	 * Set the 数据主键.
	 * 
	 * @param guidFuncgroup
	 *            数据主键
	 */
	public void setGuidFuncgroup(String guidFuncgroup) {
 		this.guidFuncgroup = guidFuncgroup == null ? null : guidFuncgroup.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuidFuncgroup(){
		return this.guidFuncgroup ;
    }
	
	/**
	 * Set the 功能编号.
	 * 
	 * @param funcCode
	 *            功能编号
	 */
	public void setFuncCode(String funcCode) {
 		this.funcCode = funcCode == null ? null : funcCode.trim() ;
    }
    
    /**
	 * Get the 功能编号.
	 * 
	 * @return 功能编号
	 */
	public String getFuncCode(){
		return this.funcCode ;
    }
	
	/**
	 * Set the 功能名称.
	 * 
	 * @param funcName
	 *            功能名称
	 */
	public void setFuncName(String funcName) {
 		this.funcName = funcName == null ? null : funcName.trim() ;
    }
    
    /**
	 * Get the 功能名称.
	 * 
	 * @return 功能名称
	 */
	public String getFuncName(){
		return this.funcName ;
    }
	
	/**
	 * Set the 功能描述.
	 * 
	 * @param funcDesc
	 *            功能描述
	 */
	public void setFuncDesc(String funcDesc) {
 		this.funcDesc = funcDesc == null ? null : funcDesc.trim() ;
    }
    
    /**
	 * Get the 功能描述.
	 * 
	 * @return 功能描述
	 */
	public String getFuncDesc(){
		return this.funcDesc ;
    }
	
	/**
	 * Set the 功能调用入口.
	 * 
	 * @param funcAction
	 *            功能调用入口
	 */
	public void setFuncAction(String funcAction) {
 		this.funcAction = funcAction == null ? null : funcAction.trim() ;
    }
    
    /**
	 * Get the 功能调用入口.
	 * 
	 * @return 功能调用入口
	 */
	public String getFuncAction(){
		return this.funcAction ;
    }
	
	/**
	 * Set the 输入参数.
	 * 
	 * @param paraInfo
	 *            输入参数
	 */
	public void setParaInfo(String paraInfo) {
 		this.paraInfo = paraInfo == null ? null : paraInfo.trim() ;
    }
    
    /**
	 * Get the 输入参数.
	 * 
	 * @return 输入参数
	 */
	public String getParaInfo(){
		return this.paraInfo ;
    }
	
	/**
	 * Set the 功能类型.
	 * 
	 * @param funcType
	 *            功能类型
	 */
	public void setFuncType(String funcType) {
 		this.funcType = funcType == null ? null : funcType.trim() ;
    }
    
    /**
	 * Get the 功能类型.
	 * 
	 * @return 功能类型
	 */
	public String getFuncType(){
		return this.funcType ;
    }
	
	/**
	 * Set the 是否验证权限.
	 * 
	 * @param ischeck
	 *            是否验证权限
	 */
	public void setIscheck(String ischeck) {
 		this.ischeck = ischeck == null ? null : ischeck.trim() ;
    }
    
    /**
	 * Get the 是否验证权限.
	 * 
	 * @return 是否验证权限
	 */
	public String getIscheck(){
		return this.ischeck ;
    }
	
	/**
	 * Set the 可否定义为菜单.
	 * 
	 * @param ismenu
	 *            可否定义为菜单
	 */
	public void setIsmenu(String ismenu) {
 		this.ismenu = ismenu == null ? null : ismenu.trim() ;
    }
    
    /**
	 * Get the 可否定义为菜单.
	 * 
	 * @return 可否定义为菜单
	 */
	public String getIsmenu(){
		return this.ismenu ;
    }
	
	public String toString(){
		return StringUtils.toString(this) ; 
	}
}