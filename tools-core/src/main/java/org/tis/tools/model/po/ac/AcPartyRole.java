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

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 
 * <pre>
 * 组织对象与角色对应关系
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/abf.erm
 * 业务域：ac
 * 模型：AC_PARTY_ROLE 组织对象与角色对应关系
 *
 * 设置机构、工作组、岗位、职务等组织对象与角色之间的对应关系
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class AcPartyRole implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	
	/** 字段类型：varchar<br/>字段名：组织对象类型<br/>描述：取值范围，见业务字典 DICT_OM_PARTYTYPE 如：机构、工作组、岗位、职务 */
	private String partytype ;
	
	/** 字段类型：varchar<br/>字段名：组织对象GUID<br/>描述：根据组织类型存储对应组织的GUID */
	private String guidParty ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidRole ;
	
	
	/**
	 * Set the 组织对象类型.
	 * 
	 * @param partytype
	 *            组织对象类型
	 */
	public void setPartytype(String partytype) {
 		this.partytype = partytype == null ? null : partytype.trim() ;
    }
    
    /**
	 * Get the 组织对象类型.
	 * 
	 * @return 组织对象类型
	 */
	public String getPartytype(){
		return this.partytype ;
    }
	
	/**
	 * Set the 组织对象GUID.
	 * 
	 * @param guidParty
	 *            组织对象GUID
	 */
	public void setGuidParty(String guidParty) {
 		this.guidParty = guidParty == null ? null : guidParty.trim() ;
    }
    
    /**
	 * Get the 组织对象GUID.
	 * 
	 * @return 组织对象GUID
	 */
	public String getGuidParty(){
		return this.guidParty ;
    }
	
	/**
	 * Set the 数据主键.
	 * 
	 * @param guidRole
	 *            数据主键
	 */
	public void setGuidRole(String guidRole) {
 		this.guidRole = guidRole == null ? null : guidRole.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuidRole(){
		return this.guidRole ;
    }
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this) ; 
	}
}