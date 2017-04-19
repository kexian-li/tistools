/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.model.po.om;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Time;
import java.util.Date;

import org.tis.tools.common.utils.StringUtils;

/**
 * 
 * <pre>
 * 应用岗位列表
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/ABF-mysql.erm
 * 业务域：om
 * 模型：OM_APP_POSITION 应用岗位列表
 *
 * 应用包含的岗位列表信息
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class OmAppPosition implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	
	/** 字段类型：varchar<br/>字段名：应用GUID<br/>描述： */
	private String guidApp ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidPosition ;
	
	
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
	
	/**
	 * Set the 数据主键.
	 * 
	 * @param guidPosition
	 *            数据主键
	 */
	public void setGuidPosition(String guidPosition) {
 		this.guidPosition = guidPosition == null ? null : guidPosition.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuidPosition(){
		return this.guidPosition ;
    }
	
	public String toString(){
		return StringUtils.toString(this) ; 
	}
}