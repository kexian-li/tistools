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
 * 职务定义表
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/ABF-mysql.erm
 * 业务域：om
 * 模型：OM_DUTY 职务定义表
 *
 * 职务及responsiblity。定义职务及上下级关系（可以把“职务”理解为岗位的岗位类型，岗位是在机构、部门中实例化后的职务，如：A机构设有‘总经理’这个岗位，其职务为‘总经理’）
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class OmDuty implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	private String guid ;
	
	/** 字段类型：varchar<br/>字段名：职务代码<br/>描述： */
	private String dutyCode ;
	
	/** 字段类型：varchar<br/>字段名：职务名称<br/>描述： */
	private String dutyName ;
	
	/** 字段类型：varchar<br/>字段名：职务套别<br/>描述：见业务字典： DICT_OM_DUTYTYPE 例如科技类，审计类等 */
	private String dutyType ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidParents ;
	
	/** 字段类型：char<br/>字段名：是否叶子节点<br/>描述：取值来自业务菜单：DICT_YON */
	private String isleaf ;
	
	/** 字段类型：decimal<br/>字段名：子节点数<br/>描述： */
	private BigDecimal subCount ;
	
	/** 字段类型：decimal<br/>字段名：职务层次<br/>描述： */
	private BigDecimal dutyLevel ;
	
	/** 字段类型：varchar<br/>字段名：职务序列号<br/>描述：职务的面包屑定位信息 */
	private String dutySeq ;
	
	/** 字段类型：varchar<br/>字段名：备注<br/>描述： */
	private String remark ;
	
	
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
	 * Set the 职务代码.
	 * 
	 * @param dutyCode
	 *            职务代码
	 */
	public void setDutyCode(String dutyCode) {
 		this.dutyCode = dutyCode == null ? null : dutyCode.trim() ;
    }
    
    /**
	 * Get the 职务代码.
	 * 
	 * @return 职务代码
	 */
	public String getDutyCode(){
		return this.dutyCode ;
    }
	
	/**
	 * Set the 职务名称.
	 * 
	 * @param dutyName
	 *            职务名称
	 */
	public void setDutyName(String dutyName) {
 		this.dutyName = dutyName == null ? null : dutyName.trim() ;
    }
    
    /**
	 * Get the 职务名称.
	 * 
	 * @return 职务名称
	 */
	public String getDutyName(){
		return this.dutyName ;
    }
	
	/**
	 * Set the 职务套别.
	 * 
	 * @param dutyType
	 *            职务套别
	 */
	public void setDutyType(String dutyType) {
 		this.dutyType = dutyType == null ? null : dutyType.trim() ;
    }
    
    /**
	 * Get the 职务套别.
	 * 
	 * @return 职务套别
	 */
	public String getDutyType(){
		return this.dutyType ;
    }
	
	/**
	 * Set the 数据主键.
	 * 
	 * @param guidParents
	 *            数据主键
	 */
	public void setGuidParents(String guidParents) {
 		this.guidParents = guidParents == null ? null : guidParents.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuidParents(){
		return this.guidParents ;
    }
	
	/**
	 * Set the 是否叶子节点.
	 * 
	 * @param isleaf
	 *            是否叶子节点
	 */
	public void setIsleaf(String isleaf) {
 		this.isleaf = isleaf == null ? null : isleaf.trim() ;
    }
    
    /**
	 * Get the 是否叶子节点.
	 * 
	 * @return 是否叶子节点
	 */
	public String getIsleaf(){
		return this.isleaf ;
    }
	
	/**
	 * Set the 子节点数.
	 * 
	 * @param subCount
	 *            子节点数
	 */
	public void setSubCount(BigDecimal subCount) {
 		this.subCount = subCount ;
    }
    
    /**
	 * Get the 子节点数.
	 * 
	 * @return 子节点数，如果setSubCount时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getSubCount(){
		if(subCount==null){
			return new BigDecimal(0d);
		}
		return subCount;
    }
	
	/**
	 * Set the 职务层次.
	 * 
	 * @param dutyLevel
	 *            职务层次
	 */
	public void setDutyLevel(BigDecimal dutyLevel) {
 		this.dutyLevel = dutyLevel ;
    }
    
    /**
	 * Get the 职务层次.
	 * 
	 * @return 职务层次，如果setDutyLevel时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getDutyLevel(){
		if(dutyLevel==null){
			return new BigDecimal(0d);
		}
		return dutyLevel;
    }
	
	/**
	 * Set the 职务序列号.
	 * 
	 * @param dutySeq
	 *            职务序列号
	 */
	public void setDutySeq(String dutySeq) {
 		this.dutySeq = dutySeq == null ? null : dutySeq.trim() ;
    }
    
    /**
	 * Get the 职务序列号.
	 * 
	 * @return 职务序列号
	 */
	public String getDutySeq(){
		return this.dutySeq ;
    }
	
	/**
	 * Set the 备注.
	 * 
	 * @param remark
	 *            备注
	 */
	public void setRemark(String remark) {
 		this.remark = remark == null ? null : remark.trim() ;
    }
    
    /**
	 * Get the 备注.
	 * 
	 * @return 备注
	 */
	public String getRemark(){
		return this.remark ;
    }
	
	public String toString(){
		return StringUtils.toString(this) ; 
	}
}