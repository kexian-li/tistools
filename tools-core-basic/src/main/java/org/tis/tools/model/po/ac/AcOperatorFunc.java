/**
 * auto generated
 * Copyright (C) 2017 bronsp.com, All rights reserved.
 */
package org.tis.tools.model.po.ac;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Time;
import java.util.Date;

import org.tis.tools.common.utils.StringUtil;

/**
 * 
 * <pre>
 * 操作员特殊权限配置
 * 模型文件 ： E:\tools\tistools\tools-core-basic\model\ABF-mysql.erm
 * 业务域：ac
 * 模型：AC_OPERATOR_FUNC 操作员特殊权限配置
 *
 * 针对人员配置的特殊权限，如特别开通的功能，或者特别禁止的功能
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class AcOperatorFunc implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** 对应的数据库表名称 */
	public static final String TABLE_NAME = "AC_OPERATOR_FUNC" ; 
	/* AC_OPERATOR_FUNC table's columns definition */
	/** GUID_OPERATOR ：操作员GUID<br/><br/> */
	public static final String COLUMN_GUID_OPERATOR = "guid_operator" ; 
	/** GUID_FUNC ：功能GUID<br/><br/> */
	public static final String COLUMN_GUID_FUNC = "guid_func" ; 
	/** AUTH_TYPE ：授权标志<br/><br/>取值来自业务菜单：DICT_AC_AUTHTYPE 如：特别禁止、特别允许 */
	public static final String COLUMN_AUTH_TYPE = "auth_type" ; 
	/** START_DATE ：有效开始日期<br/><br/> */
	public static final String COLUMN_START_DATE = "start_date" ; 
	/** END_DATE ：有效截至日期<br/><br/> */
	public static final String COLUMN_END_DATE = "end_date" ; 
	/** GUID_APP ：应用GUID<br/><br/>冗余字段 */
	public static final String COLUMN_GUID_APP = "guid_app" ; 
	/** GUID_FUNCGROUP ：功能组GUID<br/><br/>冗余字段 */
	public static final String COLUMN_GUID_FUNCGROUP = "guid_funcgroup" ; 
	
	
	/** 字段类型：varchar<br/>字段名：操作员GUID<br/>描述： */
	private String guidOperator ;
	
	/** 字段类型：varchar<br/>字段名：功能GUID<br/>描述： */
	private String guidFunc ;
	
	/** 字段类型：varchar<br/>字段名：授权标志<br/>描述：取值来自业务菜单：DICT_AC_AUTHTYPE 如：特别禁止、特别允许 */
	private String authType ;
	
	/** 字段类型：date<br/>字段名：有效开始日期<br/>描述： */
	private Date startDate ;
	
	/** 字段类型：date<br/>字段名：有效截至日期<br/>描述： */
	private Date endDate ;
	
	/** 字段类型：varchar<br/>字段名：应用GUID<br/>描述：冗余字段 */
	private String guidApp ;
	
	/** 字段类型：varchar<br/>字段名：功能组GUID<br/>描述：冗余字段 */
	private String guidFuncgroup ;

	/**
	* Default Constructor
	*/
	public AcOperatorFunc() {
	}

	
	/**
	 * Set the 操作员GUID.
	 * 
	 * @param guidOperator
	 *            操作员GUID
	 */
	public void setGuidOperator(String guidOperator) {
 		this.guidOperator = guidOperator == null ? null : guidOperator.trim() ;
    }
    
    /**
	 * Get the 操作员GUID.
	 * 
	 * @return 操作员GUID
	 */
	public String getGuidOperator(){
		return this.guidOperator ;
    }
	
	/**
	 * Set the 功能GUID.
	 * 
	 * @param guidFunc
	 *            功能GUID
	 */
	public void setGuidFunc(String guidFunc) {
 		this.guidFunc = guidFunc == null ? null : guidFunc.trim() ;
    }
    
    /**
	 * Get the 功能GUID.
	 * 
	 * @return 功能GUID
	 */
	public String getGuidFunc(){
		return this.guidFunc ;
    }
	
	/**
	 * Set the 授权标志.
	 * 
	 * @param authType
	 *            授权标志
	 */
	public void setAuthType(String authType) {
 		this.authType = authType == null ? null : authType.trim() ;
    }
    
    /**
	 * Get the 授权标志.
	 * 
	 * @return 授权标志
	 */
	public String getAuthType(){
		return this.authType ;
    }
	
	/**
	 * Set the 有效开始日期.
	 * 
	 * @param startDate
	 *            有效开始日期
	 */
	public void setStartDate(Date startDate) {
 		this.startDate = startDate ;
    }
    
    /**
	 * Get the 有效开始日期.
	 * 
	 * @return 有效开始日期
	 */
	public Date getStartDate(){
		return this.startDate ;
    }
	
	/**
	 * Set the 有效截至日期.
	 * 
	 * @param endDate
	 *            有效截至日期
	 */
	public void setEndDate(Date endDate) {
 		this.endDate = endDate ;
    }
    
    /**
	 * Get the 有效截至日期.
	 * 
	 * @return 有效截至日期
	 */
	public Date getEndDate(){
		return this.endDate ;
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
	
	/**
	 * Set the 功能组GUID.
	 * 
	 * @param guidFuncgroup
	 *            功能组GUID
	 */
	public void setGuidFuncgroup(String guidFuncgroup) {
 		this.guidFuncgroup = guidFuncgroup == null ? null : guidFuncgroup.trim() ;
    }
    
    /**
	 * Get the 功能组GUID.
	 * 
	 * @return 功能组GUID
	 */
	public String getGuidFuncgroup(){
		return this.guidFuncgroup ;
    }
	
	public String toString(){
		return StringUtil.toString(this) ; 
	}
}