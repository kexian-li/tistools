/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.model.po.log;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Time;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 
 * <pre>
 * 操作日志
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/ABForacle.erm
 * 业务域：log
 * 模型：SYS_OPERATOR_LOG 操作日志
 *
 * 记录操作员使用系统的操作日志（交易操作日志另见： LOG_TX_TRACE）
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class SysOperatorLog implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：全局唯一标识符（GUID，Globally Unique Identifier） */
	private String guid ;
	
	/** 字段类型：varchar<br/>字段名：操作类型<br/>描述：见业务字典：DICT_OPERATOR_TYPE */
	private String operatorType ;
	
	/** 字段类型：timestamp<br/>字段名：操作时间<br/>描述： */
	private Date operatorTime ;
	
	/** 字段类型：varchar<br/>字段名：操作结果<br/>描述：见业务字典：DICT_OPERATOR_RESULT */
	private String operatorResult ;
	
	/** 字段类型：varchar<br/>字段名：操作员姓名<br/>描述：记录当前操作员姓名（只记录当前值，不随之改变） */
	private String operatorName ;
	
	/** 字段类型：varchar<br/>字段名：操作员<br/>描述：登陆用户id */
	private String userId ;
	
	/** 字段类型：varchar<br/>字段名：应用代码<br/>描述： */
	private String appCode ;
	
	/** 字段类型：varchar<br/>字段名：应用名称<br/>描述： */
	private String appName ;
	
	/** 字段类型：varchar<br/>字段名：功能编号<br/>描述：业务上对功能的编码 */
	private String funcCode ;
	
	/** 字段类型：varchar<br/>字段名：功能名称<br/>描述： */
	private String funcName ;
	
	/** 字段类型：varchar<br/>字段名：服务地址<br/>描述：功能对应的RESTFul服务地址 */
	private String restfulRul ;
	
	/** 字段类型：varchar<br/>字段名：异常堆栈<br/>描述：记录异常堆栈信息，超过4000的部分被自动丢弃 */
	private String stackTrace ;
	
	/** 字段类型：varchar<br/>字段名：处理描述<br/>描述：记录功能执行时的业务处理信息 */
	private String procssDesc ;
	
	
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
	 * Set the 操作类型.
	 * 
	 * @param operatorType
	 *            操作类型
	 */
	public void setOperatorType(String operatorType) {
 		this.operatorType = operatorType == null ? null : operatorType.trim() ;
    }
    
    /**
	 * Get the 操作类型.
	 * 
	 * @return 操作类型
	 */
	public String getOperatorType(){
		return this.operatorType ;
    }
	
	/**
	 * Set the 操作时间.
	 * 
	 * @param operatorTime
	 *            操作时间
	 */
	public void setOperatorTime(Date operatorTime) {
 		this.operatorTime = operatorTime ;
    }
    
    /**
	 * Get the 操作时间.
	 * 
	 * @return 操作时间
	 */
	public Date getOperatorTime(){
		return this.operatorTime ;
    }
	
	/**
	 * Set the 操作结果.
	 * 
	 * @param operatorResult
	 *            操作结果
	 */
	public void setOperatorResult(String operatorResult) {
 		this.operatorResult = operatorResult == null ? null : operatorResult.trim() ;
    }
    
    /**
	 * Get the 操作结果.
	 * 
	 * @return 操作结果
	 */
	public String getOperatorResult(){
		return this.operatorResult ;
    }
	
	/**
	 * Set the 操作员姓名.
	 * 
	 * @param operatorName
	 *            操作员姓名
	 */
	public void setOperatorName(String operatorName) {
 		this.operatorName = operatorName == null ? null : operatorName.trim() ;
    }
    
    /**
	 * Get the 操作员姓名.
	 * 
	 * @return 操作员姓名
	 */
	public String getOperatorName(){
		return this.operatorName ;
    }
	
	/**
	 * Set the 操作员.
	 * 
	 * @param userId
	 *            操作员
	 */
	public void setUserId(String userId) {
 		this.userId = userId == null ? null : userId.trim() ;
    }
    
    /**
	 * Get the 操作员.
	 * 
	 * @return 操作员
	 */
	public String getUserId(){
		return this.userId ;
    }
	
	/**
	 * Set the 应用代码.
	 * 
	 * @param appCode
	 *            应用代码
	 */
	public void setAppCode(String appCode) {
 		this.appCode = appCode == null ? null : appCode.trim() ;
    }
    
    /**
	 * Get the 应用代码.
	 * 
	 * @return 应用代码
	 */
	public String getAppCode(){
		return this.appCode ;
    }
	
	/**
	 * Set the 应用名称.
	 * 
	 * @param appName
	 *            应用名称
	 */
	public void setAppName(String appName) {
 		this.appName = appName == null ? null : appName.trim() ;
    }
    
    /**
	 * Get the 应用名称.
	 * 
	 * @return 应用名称
	 */
	public String getAppName(){
		return this.appName ;
    }
	
	/**
	 * Set the 功能编号.
	 * 
	 * @param funcCode
	 *            功能编号
	 */
	public void setFuncCode(String funcCode) {
 		this.funcCode = funcCode == null ? null : funcCode.trim() ;
    }
    
    /**
	 * Get the 功能编号.
	 * 
	 * @return 功能编号
	 */
	public String getFuncCode(){
		return this.funcCode ;
    }
	
	/**
	 * Set the 功能名称.
	 * 
	 * @param funcName
	 *            功能名称
	 */
	public void setFuncName(String funcName) {
 		this.funcName = funcName == null ? null : funcName.trim() ;
    }
    
    /**
	 * Get the 功能名称.
	 * 
	 * @return 功能名称
	 */
	public String getFuncName(){
		return this.funcName ;
    }
	
	/**
	 * Set the 服务地址.
	 * 
	 * @param restfulRul
	 *            服务地址
	 */
	public void setRestfulRul(String restfulRul) {
 		this.restfulRul = restfulRul == null ? null : restfulRul.trim() ;
    }
    
    /**
	 * Get the 服务地址.
	 * 
	 * @return 服务地址
	 */
	public String getRestfulRul(){
		return this.restfulRul ;
    }
	
	/**
	 * Set the 异常堆栈.
	 * 
	 * @param stackTrace
	 *            异常堆栈
	 */
	public void setStackTrace(String stackTrace) {
 		this.stackTrace = stackTrace == null ? null : stackTrace.trim() ;
    }
    
    /**
	 * Get the 异常堆栈.
	 * 
	 * @return 异常堆栈
	 */
	public String getStackTrace(){
		return this.stackTrace ;
    }
	
	/**
	 * Set the 处理描述.
	 * 
	 * @param procssDesc
	 *            处理描述
	 */
	public void setProcssDesc(String procssDesc) {
 		this.procssDesc = procssDesc == null ? null : procssDesc.trim() ;
    }
    
    /**
	 * Get the 处理描述.
	 * 
	 * @return 处理描述
	 */
	public String getProcssDesc(){
		return this.procssDesc ;
    }
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this) ; 
	}
}