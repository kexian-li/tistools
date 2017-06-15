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

import org.tis.tools.common.utils.StringUtil;

/**
 * 
 * <pre>
 * 操作员身份
 * 模型文件 ： E:\github\soft\tistools\tistools\tools-core-basic\model\ABF-mysql.erm
 * 业务域：ac
 * 模型：AC_OPERATOR_IDENTITY 操作员身份
 *
 * 操作员对自己的权限进行组合形成一个固定的登录身份；
供登录时选项，每一个登录身份是员工操作员的权限子集；
登陆应用系统时，可以在权限子集间选择，如果不指定，则采用默认身份登陆。
（可基于本表扩展支持：根据登陆渠道返回操作员的权限）
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class AcOperatorIdentity implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** 对应的数据库表名称 */
	public static final String TABLE_NAME = "AC_OPERATOR_IDENTITY" ; 
	/* AC_OPERATOR_IDENTITY table's columns definition */
	/** GUID ：数据主键<br/><br/>全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	public static final String COLUMN_GUID = "guid" ; 
	/** GUID_OPERATOR ：操作员GUID<br/><br/> */
	public static final String COLUMN_GUID_OPERATOR = "guid_operator" ; 
	/** IDENTITY_NAME ：身份名称<br/><br/> */
	public static final String COLUMN_IDENTITY_NAME = "identity_name" ; 
	/** IDENTITY_FLAG ：默认身份标志<br/><br/>见业务字典： DICT_YON 只能有一个默认身份 Y是默认身份 N不是默认身份 */
	public static final String COLUMN_IDENTITY_FLAG = "identity_flag" ; 
	/** SEQ_NO ：显示顺序<br/><br/> */
	public static final String COLUMN_SEQ_NO = "seq_no" ; 
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	private String guid ;
	
	/** 字段类型：varchar<br/>字段名：操作员GUID<br/>描述： */
	private String guidOperator ;
	
	/** 字段类型：varchar<br/>字段名：身份名称<br/>描述： */
	private String identityName ;
	
	/** 字段类型：char<br/>字段名：默认身份标志<br/>描述：见业务字典： DICT_YON 只能有一个默认身份 Y是默认身份 N不是默认身份 */
	private String identityFlag ;
	
	/** 字段类型：decimal<br/>字段名：显示顺序<br/>描述： */
	private BigDecimal seqNo ;
	
	
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
	 * Set the 身份名称.
	 * 
	 * @param identityName
	 *            身份名称
	 */
	public void setIdentityName(String identityName) {
 		this.identityName = identityName == null ? null : identityName.trim() ;
    }
    
    /**
	 * Get the 身份名称.
	 * 
	 * @return 身份名称
	 */
	public String getIdentityName(){
		return this.identityName ;
    }
	
	/**
	 * Set the 默认身份标志.
	 * 
	 * @param identityFlag
	 *            默认身份标志
	 */
	public void setIdentityFlag(String identityFlag) {
 		this.identityFlag = identityFlag == null ? null : identityFlag.trim() ;
    }
    
    /**
	 * Get the 默认身份标志.
	 * 
	 * @return 默认身份标志
	 */
	public String getIdentityFlag(){
		return this.identityFlag ;
    }
	
	/**
	 * Set the 显示顺序.
	 * 
	 * @param seqNo
	 *            显示顺序
	 */
	public void setSeqNo(BigDecimal seqNo) {
 		this.seqNo = seqNo ;
    }
    
    /**
	 * Get the 显示顺序.
	 * 
	 * @return 显示顺序，如果setSeqNo时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getSeqNo(){
		if(seqNo==null){
			return new BigDecimal(0d);
		}
		return seqNo;
    }
	
	public String toString(){
		return StringUtil.toString(this) ; 
	}
}