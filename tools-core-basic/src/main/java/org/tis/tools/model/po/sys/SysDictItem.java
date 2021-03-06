/**
 * auto generated
 * Copyright (C) 2017 bronsp.com, All rights reserved.
 */
package org.tis.tools.model.po.sys;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Time;
import java.util.Date;

import org.tis.tools.common.utils.StringUtil;

/**
 * 
 * <pre>
 * 业务字典项
 * 模型文件 ： E:\tools\tistools\tools-core-basic\model\ABF-mysql.erm
 * 业务域：sys
 * 模型：SYS_DICT_ITEM 业务字典项
 *
 * 业务字典内容项， 展示下拉菜单结构时，一般需要： 字典项，字典项名称，实际值
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class SysDictItem implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** 对应的数据库表名称 */
	public static final String TABLE_NAME = "SYS_DICT_ITEM" ; 
	/* SYS_DICT_ITEM table's columns definition */
	/** GUID ：数据主键<br/><br/>全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	public static final String COLUMN_GUID = "guid" ; 
	/** GUID_DICT ：隶属业务字典<br/><br/> */
	public static final String COLUMN_GUID_DICT = "guid_dict" ; 
	/** ITEM_NAME ：字典项名称<br/><br/> */
	public static final String COLUMN_ITEM_NAME = "item_name" ; 
	/** ITEM_VALUE ：字典项<br/><br/> */
	public static final String COLUMN_ITEM_VALUE = "item_value" ; 
	/** SEND_VALUE ：实际值<br/><br/>实际值，及选中字典项后，实际发送值给系统的数值。 */
	public static final String COLUMN_SEND_VALUE = "send_value" ; 
	/** SEQNO ：顺序号<br/><br/>顺序号，从0开始排，按小到大排序 */
	public static final String COLUMN_SEQNO = "seqno" ; 
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	private String guid ;
	
	/** 字段类型：varchar<br/>字段名：隶属业务字典<br/>描述： */
	private String guidDict ;
	
	/** 字段类型：varchar<br/>字段名：字典项名称<br/>描述： */
	private String itemName ;
	
	/** 字段类型：varchar<br/>字段名：字典项<br/>描述： */
	private String itemValue ;
	
	/** 字段类型：varchar<br/>字段名：实际值<br/>描述：实际值，及选中字典项后，实际发送值给系统的数值。 */
	private String sendValue ;
	
	/** 字段类型：decimal<br/>字段名：顺序号<br/>描述：顺序号，从0开始排，按小到大排序 */
	private BigDecimal seqno ;

	/**
	* Default Constructor
	*/
	public SysDictItem() {
	}

	
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
	 * Set the 隶属业务字典.
	 * 
	 * @param guidDict
	 *            隶属业务字典
	 */
	public void setGuidDict(String guidDict) {
 		this.guidDict = guidDict == null ? null : guidDict.trim() ;
    }
    
    /**
	 * Get the 隶属业务字典.
	 * 
	 * @return 隶属业务字典
	 */
	public String getGuidDict(){
		return this.guidDict ;
    }
	
	/**
	 * Set the 字典项名称.
	 * 
	 * @param itemName
	 *            字典项名称
	 */
	public void setItemName(String itemName) {
 		this.itemName = itemName == null ? null : itemName.trim() ;
    }
    
    /**
	 * Get the 字典项名称.
	 * 
	 * @return 字典项名称
	 */
	public String getItemName(){
		return this.itemName ;
    }
	
	/**
	 * Set the 字典项.
	 * 
	 * @param itemValue
	 *            字典项
	 */
	public void setItemValue(String itemValue) {
 		this.itemValue = itemValue == null ? null : itemValue.trim() ;
    }
    
    /**
	 * Get the 字典项.
	 * 
	 * @return 字典项
	 */
	public String getItemValue(){
		return this.itemValue ;
    }
	
	/**
	 * Set the 实际值.
	 * 
	 * @param sendValue
	 *            实际值
	 */
	public void setSendValue(String sendValue) {
 		this.sendValue = sendValue == null ? null : sendValue.trim() ;
    }
    
    /**
	 * Get the 实际值.
	 * 
	 * @return 实际值
	 */
	public String getSendValue(){
		return this.sendValue ;
    }
	
	/**
	 * Set the 顺序号.
	 * 
	 * @param seqno
	 *            顺序号
	 */
	public void setSeqno(BigDecimal seqno) {
 		this.seqno = seqno ;
    }
    
    /**
	 * Get the 顺序号.
	 * 
	 * @return 顺序号，如果setSeqno时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getSeqno(){
		if(seqno==null){
			return new BigDecimal(0d);
		}
		return seqno;
    }
	
	public String toString(){
		return StringUtil.toString(this) ; 
	}
}