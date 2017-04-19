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
 * 员工岗位对应关系
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/ABF-mysql.erm
 * 业务域：om
 * 模型：OM_EMP_POSITION 员工岗位对应关系
 *
 * 定义人员和岗位的对应关系，需要注明，一个人员可以设定一个基本岗位
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class OmEmpPosition implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidEmp ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidPosition ;
	
	/** 字段类型：char<br/>字段名：是否主岗位<br/>描述：取值来自业务菜单：DICT_YON 只能有一个主岗位 */
	private String ismain ;
	
	
	/**
	 * Set the 数据主键.
	 * 
	 * @param guidEmp
	 *            数据主键
	 */
	public void setGuidEmp(String guidEmp) {
 		this.guidEmp = guidEmp == null ? null : guidEmp.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuidEmp(){
		return this.guidEmp ;
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
	
	/**
	 * Set the 是否主岗位.
	 * 
	 * @param ismain
	 *            是否主岗位
	 */
	public void setIsmain(String ismain) {
 		this.ismain = ismain == null ? null : ismain.trim() ;
    }
    
    /**
	 * Get the 是否主岗位.
	 * 
	 * @return 是否主岗位
	 */
	public String getIsmain(){
		return this.ismain ;
    }
	
	public String toString(){
		return StringUtils.toString(this) ; 
	}
}