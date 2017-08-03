/**
 * auto generated
 * Copyright (C) 2017 bronsp.com, All rights reserved.
 */
package org.tis.tools.model.po.om;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Time;
import java.util.Date;

import org.tis.tools.common.utils.StringUtil;

/**
 * 
 * <pre>
 * 工作组应用列表
 * 模型文件 ： E:\tools\tistools\tools-core-basic\model\ABF-mysql.erm
 * 业务域：om
 * 模型：OM_GROUP_APP 工作组应用列表
 *
 * 工作组所拥有（允许操作）的应用列表
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class OmGroupApp implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** 对应的数据库表名称 */
	public static final String TABLE_NAME = "OM_GROUP_APP" ; 
	/* OM_GROUP_APP table's columns definition */
	/** GUID_GROUP ：工作组GUID<br/><br/> */
	public static final String COLUMN_GUID_GROUP = "guid_group" ; 
	/** GUID_APP ：应用GUID<br/><br/> */
	public static final String COLUMN_GUID_APP = "guid_app" ; 
	
	
	/** 字段类型：varchar<br/>字段名：工作组GUID<br/>描述： */
	private String guidGroup ;
	
	/** 字段类型：varchar<br/>字段名：应用GUID<br/>描述： */
	private String guidApp ;

	/**
	* Default Constructor
	*/
	public OmGroupApp() {
	}

	
	/**
	 * Set the 工作组GUID.
	 * 
	 * @param guidGroup
	 *            工作组GUID
	 */
	public void setGuidGroup(String guidGroup) {
 		this.guidGroup = guidGroup == null ? null : guidGroup.trim() ;
    }
    
    /**
	 * Get the 工作组GUID.
	 * 
	 * @return 工作组GUID
	 */
	public String getGuidGroup(){
		return this.guidGroup ;
    }
	
	/**
	 * Set the 应用GUID.
	 * 
	 * @param guidApp
	 *            应用GUID
	 */
	public void setGuidApp(String guidApp) {
 		this.guidApp = guidApp == null ? null : guidApp.trim() ;
    }
    
    /**
	 * Get the 应用GUID.
	 * 
	 * @return 应用GUID
	 */
	public String getGuidApp(){
		return this.guidApp ;
    }
	
	public String toString(){
		return StringUtil.toString(this) ; 
	}
}