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

import org.tis.tools.common.utils.StringUtils;

/**
 * 
 * <pre>
 * 实体属性
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/ABF-mysql.erm
 * 业务域：ac
 * 模型：AC_ENTITYFIELD 实体属性
 *
 * 数据实体的字段（属性）定义表
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class AcEntityfield implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	private String guid ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidEntity ;
	
	/** 字段类型：varchar<br/>字段名：属性名称<br/>描述： */
	private String fieldName ;
	
	/** 字段类型：varchar<br/>字段名：属性描述<br/>描述： */
	private String fieldDesc ;
	
	/** 字段类型：varchar<br/>字段名：显示格式<br/>描述：如：属性为日期时，可以设置显示格式 yyyy/MM/dd； 当查询出数据，返回给调用着之前生效本显示格式（返回的数据已经被格式化）； */
	private String displayFormat ;
	
	/** 字段类型：varchar<br/>字段名：代码大类<br/>描述： */
	private String doclistCode ;
	
	/** 字段类型：varchar<br/>字段名：CHECKBOX_VALUE<br/>描述： */
	private String checkboxValue ;
	
	/** 字段类型：varchar<br/>字段名：外键录入URL<br/>描述： */
	private String fkInputurl ;
	
	/** 字段类型：varchar<br/>字段名：外键描述字段名<br/>描述： */
	private String fkFielddesc ;
	
	/** 字段类型：varchar<br/>字段名：外键列名<br/>描述： */
	private String fkColumnname ;
	
	/** 字段类型：varchar<br/>字段名：外键表名<br/>描述： */
	private String fkTablename ;
	
	/** 字段类型：varchar<br/>字段名：描述字段名<br/>描述： */
	private String descFieldname ;
	
	/** 字段类型：varchar<br/>字段名：引用类型<br/>描述：0 业务字典 1 其他表 */
	private String refType ;
	
	/** 字段类型：varchar<br/>字段名：字段类型<br/>描述：0 字符串 1 整数 2 小数 3 日期 4 日期时间 5 CHECKBOX 6 引用 */
	private String fieldType ;
	
	/** 字段类型：decimal<br/>字段名：顺序<br/>描述： */
	private BigDecimal displayOrder ;
	
	/** 字段类型：varchar<br/>字段名：数据库列名<br/>描述： */
	private String columnName ;
	
	/** 字段类型：decimal<br/>字段名：宽度<br/>描述： */
	private BigDecimal width ;
	
	/** 字段类型：varchar<br/>字段名：缺省值<br/>描述： */
	private String defaultValue ;
	
	/** 字段类型：varchar<br/>字段名：最小值<br/>描述： */
	private String minValue ;
	
	/** 字段类型：varchar<br/>字段名：最大值<br/>描述： */
	private String maxValue ;
	
	/** 字段类型：decimal<br/>字段名：长度<br/>描述： */
	private BigDecimal lengthValue ;
	
	/** 字段类型：decimal<br/>字段名：小数位<br/>描述： */
	private BigDecimal precisionValue ;
	
	/** 字段类型：varchar<br/>字段名：页面校验类型<br/>描述： */
	private String validateType ;
	
	/** 字段类型：char<br/>字段名：是否可修改<br/>描述：取值来自业务菜单： DICT_YON */
	private String ismodify ;
	
	/** 字段类型：char<br/>字段名：是否显示<br/>描述：取值来自业务菜单： DICT_YON */
	private String isdisplay ;
	
	/** 字段类型：char<br/>字段名：是否必须填写<br/>描述：取值来自业务菜单： DICT_YON */
	private String isinput ;
	
	/** 字段类型：char<br/>字段名：是否是主键<br/>描述：取值来自业务菜单： DICT_YON */
	private String ispk ;
	
	/** 字段类型：char<br/>字段名：是否自动产生主键<br/>描述：取值来自业务菜单： DICT_YON */
	private String isautokey ;
	
	
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
	 * Set the 数据主键.
	 * 
	 * @param guidEntity
	 *            数据主键
	 */
	public void setGuidEntity(String guidEntity) {
 		this.guidEntity = guidEntity == null ? null : guidEntity.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuidEntity(){
		return this.guidEntity ;
    }
	
	/**
	 * Set the 属性名称.
	 * 
	 * @param fieldName
	 *            属性名称
	 */
	public void setFieldName(String fieldName) {
 		this.fieldName = fieldName == null ? null : fieldName.trim() ;
    }
    
    /**
	 * Get the 属性名称.
	 * 
	 * @return 属性名称
	 */
	public String getFieldName(){
		return this.fieldName ;
    }
	
	/**
	 * Set the 属性描述.
	 * 
	 * @param fieldDesc
	 *            属性描述
	 */
	public void setFieldDesc(String fieldDesc) {
 		this.fieldDesc = fieldDesc == null ? null : fieldDesc.trim() ;
    }
    
    /**
	 * Get the 属性描述.
	 * 
	 * @return 属性描述
	 */
	public String getFieldDesc(){
		return this.fieldDesc ;
    }
	
	/**
	 * Set the 显示格式.
	 * 
	 * @param displayFormat
	 *            显示格式
	 */
	public void setDisplayFormat(String displayFormat) {
 		this.displayFormat = displayFormat == null ? null : displayFormat.trim() ;
    }
    
    /**
	 * Get the 显示格式.
	 * 
	 * @return 显示格式
	 */
	public String getDisplayFormat(){
		return this.displayFormat ;
    }
	
	/**
	 * Set the 代码大类.
	 * 
	 * @param doclistCode
	 *            代码大类
	 */
	public void setDoclistCode(String doclistCode) {
 		this.doclistCode = doclistCode == null ? null : doclistCode.trim() ;
    }
    
    /**
	 * Get the 代码大类.
	 * 
	 * @return 代码大类
	 */
	public String getDoclistCode(){
		return this.doclistCode ;
    }
	
	/**
	 * Set the CHECKBOX_VALUE.
	 * 
	 * @param checkboxValue
	 *            CHECKBOX_VALUE
	 */
	public void setCheckboxValue(String checkboxValue) {
 		this.checkboxValue = checkboxValue == null ? null : checkboxValue.trim() ;
    }
    
    /**
	 * Get the CHECKBOX_VALUE.
	 * 
	 * @return CHECKBOX_VALUE
	 */
	public String getCheckboxValue(){
		return this.checkboxValue ;
    }
	
	/**
	 * Set the 外键录入URL.
	 * 
	 * @param fkInputurl
	 *            外键录入URL
	 */
	public void setFkInputurl(String fkInputurl) {
 		this.fkInputurl = fkInputurl == null ? null : fkInputurl.trim() ;
    }
    
    /**
	 * Get the 外键录入URL.
	 * 
	 * @return 外键录入URL
	 */
	public String getFkInputurl(){
		return this.fkInputurl ;
    }
	
	/**
	 * Set the 外键描述字段名.
	 * 
	 * @param fkFielddesc
	 *            外键描述字段名
	 */
	public void setFkFielddesc(String fkFielddesc) {
 		this.fkFielddesc = fkFielddesc == null ? null : fkFielddesc.trim() ;
    }
    
    /**
	 * Get the 外键描述字段名.
	 * 
	 * @return 外键描述字段名
	 */
	public String getFkFielddesc(){
		return this.fkFielddesc ;
    }
	
	/**
	 * Set the 外键列名.
	 * 
	 * @param fkColumnname
	 *            外键列名
	 */
	public void setFkColumnname(String fkColumnname) {
 		this.fkColumnname = fkColumnname == null ? null : fkColumnname.trim() ;
    }
    
    /**
	 * Get the 外键列名.
	 * 
	 * @return 外键列名
	 */
	public String getFkColumnname(){
		return this.fkColumnname ;
    }
	
	/**
	 * Set the 外键表名.
	 * 
	 * @param fkTablename
	 *            外键表名
	 */
	public void setFkTablename(String fkTablename) {
 		this.fkTablename = fkTablename == null ? null : fkTablename.trim() ;
    }
    
    /**
	 * Get the 外键表名.
	 * 
	 * @return 外键表名
	 */
	public String getFkTablename(){
		return this.fkTablename ;
    }
	
	/**
	 * Set the 描述字段名.
	 * 
	 * @param descFieldname
	 *            描述字段名
	 */
	public void setDescFieldname(String descFieldname) {
 		this.descFieldname = descFieldname == null ? null : descFieldname.trim() ;
    }
    
    /**
	 * Get the 描述字段名.
	 * 
	 * @return 描述字段名
	 */
	public String getDescFieldname(){
		return this.descFieldname ;
    }
	
	/**
	 * Set the 引用类型.
	 * 
	 * @param refType
	 *            引用类型
	 */
	public void setRefType(String refType) {
 		this.refType = refType == null ? null : refType.trim() ;
    }
    
    /**
	 * Get the 引用类型.
	 * 
	 * @return 引用类型
	 */
	public String getRefType(){
		return this.refType ;
    }
	
	/**
	 * Set the 字段类型.
	 * 
	 * @param fieldType
	 *            字段类型
	 */
	public void setFieldType(String fieldType) {
 		this.fieldType = fieldType == null ? null : fieldType.trim() ;
    }
    
    /**
	 * Get the 字段类型.
	 * 
	 * @return 字段类型
	 */
	public String getFieldType(){
		return this.fieldType ;
    }
	
	/**
	 * Set the 顺序.
	 * 
	 * @param displayOrder
	 *            顺序
	 */
	public void setDisplayOrder(BigDecimal displayOrder) {
 		this.displayOrder = displayOrder ;
    }
    
    /**
	 * Get the 顺序.
	 * 
	 * @return 顺序，如果setDisplayOrder时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getDisplayOrder(){
		if(displayOrder==null){
			return new BigDecimal(0d);
		}
		return displayOrder;
    }
	
	/**
	 * Set the 数据库列名.
	 * 
	 * @param columnName
	 *            数据库列名
	 */
	public void setColumnName(String columnName) {
 		this.columnName = columnName == null ? null : columnName.trim() ;
    }
    
    /**
	 * Get the 数据库列名.
	 * 
	 * @return 数据库列名
	 */
	public String getColumnName(){
		return this.columnName ;
    }
	
	/**
	 * Set the 宽度.
	 * 
	 * @param width
	 *            宽度
	 */
	public void setWidth(BigDecimal width) {
 		this.width = width ;
    }
    
    /**
	 * Get the 宽度.
	 * 
	 * @return 宽度，如果setWidth时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getWidth(){
		if(width==null){
			return new BigDecimal(0d);
		}
		return width;
    }
	
	/**
	 * Set the 缺省值.
	 * 
	 * @param defaultValue
	 *            缺省值
	 */
	public void setDefaultValue(String defaultValue) {
 		this.defaultValue = defaultValue == null ? null : defaultValue.trim() ;
    }
    
    /**
	 * Get the 缺省值.
	 * 
	 * @return 缺省值
	 */
	public String getDefaultValue(){
		return this.defaultValue ;
    }
	
	/**
	 * Set the 最小值.
	 * 
	 * @param minValue
	 *            最小值
	 */
	public void setMinValue(String minValue) {
 		this.minValue = minValue == null ? null : minValue.trim() ;
    }
    
    /**
	 * Get the 最小值.
	 * 
	 * @return 最小值
	 */
	public String getMinValue(){
		return this.minValue ;
    }
	
	/**
	 * Set the 最大值.
	 * 
	 * @param maxValue
	 *            最大值
	 */
	public void setMaxValue(String maxValue) {
 		this.maxValue = maxValue == null ? null : maxValue.trim() ;
    }
    
    /**
	 * Get the 最大值.
	 * 
	 * @return 最大值
	 */
	public String getMaxValue(){
		return this.maxValue ;
    }
	
	/**
	 * Set the 长度.
	 * 
	 * @param lengthValue
	 *            长度
	 */
	public void setLengthValue(BigDecimal lengthValue) {
 		this.lengthValue = lengthValue ;
    }
    
    /**
	 * Get the 长度.
	 * 
	 * @return 长度，如果setLengthValue时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getLengthValue(){
		if(lengthValue==null){
			return new BigDecimal(0d);
		}
		return lengthValue;
    }
	
	/**
	 * Set the 小数位.
	 * 
	 * @param precisionValue
	 *            小数位
	 */
	public void setPrecisionValue(BigDecimal precisionValue) {
 		this.precisionValue = precisionValue ;
    }
    
    /**
	 * Get the 小数位.
	 * 
	 * @return 小数位，如果setPrecisionValue时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getPrecisionValue(){
		if(precisionValue==null){
			return new BigDecimal(0d);
		}
		return precisionValue;
    }
	
	/**
	 * Set the 页面校验类型.
	 * 
	 * @param validateType
	 *            页面校验类型
	 */
	public void setValidateType(String validateType) {
 		this.validateType = validateType == null ? null : validateType.trim() ;
    }
    
    /**
	 * Get the 页面校验类型.
	 * 
	 * @return 页面校验类型
	 */
	public String getValidateType(){
		return this.validateType ;
    }
	
	/**
	 * Set the 是否可修改.
	 * 
	 * @param ismodify
	 *            是否可修改
	 */
	public void setIsmodify(String ismodify) {
 		this.ismodify = ismodify == null ? null : ismodify.trim() ;
    }
    
    /**
	 * Get the 是否可修改.
	 * 
	 * @return 是否可修改
	 */
	public String getIsmodify(){
		return this.ismodify ;
    }
	
	/**
	 * Set the 是否显示.
	 * 
	 * @param isdisplay
	 *            是否显示
	 */
	public void setIsdisplay(String isdisplay) {
 		this.isdisplay = isdisplay == null ? null : isdisplay.trim() ;
    }
    
    /**
	 * Get the 是否显示.
	 * 
	 * @return 是否显示
	 */
	public String getIsdisplay(){
		return this.isdisplay ;
    }
	
	/**
	 * Set the 是否必须填写.
	 * 
	 * @param isinput
	 *            是否必须填写
	 */
	public void setIsinput(String isinput) {
 		this.isinput = isinput == null ? null : isinput.trim() ;
    }
    
    /**
	 * Get the 是否必须填写.
	 * 
	 * @return 是否必须填写
	 */
	public String getIsinput(){
		return this.isinput ;
    }
	
	/**
	 * Set the 是否是主键.
	 * 
	 * @param ispk
	 *            是否是主键
	 */
	public void setIspk(String ispk) {
 		this.ispk = ispk == null ? null : ispk.trim() ;
    }
    
    /**
	 * Get the 是否是主键.
	 * 
	 * @return 是否是主键
	 */
	public String getIspk(){
		return this.ispk ;
    }
	
	/**
	 * Set the 是否自动产生主键.
	 * 
	 * @param isautokey
	 *            是否自动产生主键
	 */
	public void setIsautokey(String isautokey) {
 		this.isautokey = isautokey == null ? null : isautokey.trim() ;
    }
    
    /**
	 * Get the 是否自动产生主键.
	 * 
	 * @return 是否自动产生主键
	 */
	public String getIsautokey(){
		return this.isautokey ;
    }
	
	public String toString(){
		return StringUtils.toString(this) ; 
	}
}