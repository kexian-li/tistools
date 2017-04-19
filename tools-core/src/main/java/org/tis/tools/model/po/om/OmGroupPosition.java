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
 * 工作组岗位列表
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/ABF-mysql.erm
 * 业务域：om
 * 模型：OM_GROUP_POSITION 工作组岗位列表
 *
 * 工作组岗位列表:一个工作组允许定义多个岗位，岗位之间允许存在层次关系
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class OmGroupPosition implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidGroup ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidPosition ;
	
	
	/**
	 * Set the 数据主键.
	 * 
	 * @param guidGroup
	 *            数据主键
	 */
	public void setGuidGroup(String guidGroup) {
 		this.guidGroup = guidGroup == null ? null : guidGroup.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuidGroup(){
		return this.guidGroup ;
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