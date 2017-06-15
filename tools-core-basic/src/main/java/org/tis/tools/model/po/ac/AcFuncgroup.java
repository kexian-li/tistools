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
 * 功能组
 * 模型文件 ： E:\github\soft\tistools\tistools\tools-core-basic\model\ABF-mysql.erm
 * 业务域：ac
 * 模型：AC_FUNCGROUP 功能组
 *
 * 功能组可以理解为功能模块或者构件包，是指一类相关功能的集合。定义功能组主要是为了对系统的功能进行归类管理
功能组隶属于某个应用

功能组支持层次
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class AcFuncgroup implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** 对应的数据库表名称 */
	public static final String TABLE_NAME = "AC_FUNCGROUP" ; 
	/* AC_FUNCGROUP table's columns definition */
	/** GUID ：数据主键<br/><br/>全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	public static final String COLUMN_GUID = "guid" ; 
	/** GUID_APP ：隶属应用GUID<br/><br/> */
	public static final String COLUMN_GUID_APP = "guid_app" ; 
	/** FUNCGROUP_NAME ：功能组名称<br/><br/> */
	public static final String COLUMN_FUNCGROUP_NAME = "funcgroup_name" ; 
	/** GUID_PARENTS ：父功能组GUID<br/><br/> */
	public static final String COLUMN_GUID_PARENTS = "guid_parents" ; 
	/** GROUP_LEVEL ：节点层次<br/><br/> */
	public static final String COLUMN_GROUP_LEVEL = "group_level" ; 
	/** FUNCGROUP_SEQ ：功能组路径序列<br/><br/> */
	public static final String COLUMN_FUNCGROUP_SEQ = "funcgroup_seq" ; 
	/** ISLEAF ：是否叶子节点<br/><br/>取值来自业务菜单： DICT_YON */
	public static final String COLUMN_ISLEAF = "isleaf" ; 
	/** SUB_COUNT ：子节点数<br/><br/>对功能组进行子节点的增加、删除时需要同步维护 */
	public static final String COLUMN_SUB_COUNT = "sub_count" ; 
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	private String guid ;
	
	/** 字段类型：varchar<br/>字段名：隶属应用GUID<br/>描述： */
	private String guidApp ;
	
	/** 字段类型：varchar<br/>字段名：功能组名称<br/>描述： */
	private String funcgroupName ;
	
	/** 字段类型：varchar<br/>字段名：父功能组GUID<br/>描述： */
	private String guidParents ;
	
	/** 字段类型：decimal<br/>字段名：节点层次<br/>描述： */
	private BigDecimal groupLevel ;
	
	/** 字段类型：varchar<br/>字段名：功能组路径序列<br/>描述： */
	private String funcgroupSeq ;
	
	/** 字段类型：char<br/>字段名：是否叶子节点<br/>描述：取值来自业务菜单： DICT_YON */
	private String isleaf ;
	
	/** 字段类型：decimal<br/>字段名：子节点数<br/>描述：对功能组进行子节点的增加、删除时需要同步维护 */
	private BigDecimal subCount ;
	
	
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
	 * Set the 隶属应用GUID.
	 * 
	 * @param guidApp
	 *            隶属应用GUID
	 */
	public void setGuidApp(String guidApp) {
 		this.guidApp = guidApp == null ? null : guidApp.trim() ;
    }
    
    /**
	 * Get the 隶属应用GUID.
	 * 
	 * @return 隶属应用GUID
	 */
	public String getGuidApp(){
		return this.guidApp ;
    }
	
	/**
	 * Set the 功能组名称.
	 * 
	 * @param funcgroupName
	 *            功能组名称
	 */
	public void setFuncgroupName(String funcgroupName) {
 		this.funcgroupName = funcgroupName == null ? null : funcgroupName.trim() ;
    }
    
    /**
	 * Get the 功能组名称.
	 * 
	 * @return 功能组名称
	 */
	public String getFuncgroupName(){
		return this.funcgroupName ;
    }
	
	/**
	 * Set the 父功能组GUID.
	 * 
	 * @param guidParents
	 *            父功能组GUID
	 */
	public void setGuidParents(String guidParents) {
 		this.guidParents = guidParents == null ? null : guidParents.trim() ;
    }
    
    /**
	 * Get the 父功能组GUID.
	 * 
	 * @return 父功能组GUID
	 */
	public String getGuidParents(){
		return this.guidParents ;
    }
	
	/**
	 * Set the 节点层次.
	 * 
	 * @param groupLevel
	 *            节点层次
	 */
	public void setGroupLevel(BigDecimal groupLevel) {
 		this.groupLevel = groupLevel ;
    }
    
    /**
	 * Get the 节点层次.
	 * 
	 * @return 节点层次，如果setGroupLevel时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getGroupLevel(){
		if(groupLevel==null){
			return new BigDecimal(0d);
		}
		return groupLevel;
    }
	
	/**
	 * Set the 功能组路径序列.
	 * 
	 * @param funcgroupSeq
	 *            功能组路径序列
	 */
	public void setFuncgroupSeq(String funcgroupSeq) {
 		this.funcgroupSeq = funcgroupSeq == null ? null : funcgroupSeq.trim() ;
    }
    
    /**
	 * Get the 功能组路径序列.
	 * 
	 * @return 功能组路径序列
	 */
	public String getFuncgroupSeq(){
		return this.funcgroupSeq ;
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
	
	public String toString(){
		return StringUtil.toString(this) ; 
	}
}