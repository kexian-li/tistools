/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
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
 * 序号资源表
 * 模型文件 ： E:\github\soft\tistools\tistools\tools-core-basic\model\ABF-mysql.erm
 * 业务域：sys
 * 模型：SYS_SEQNO 序号资源表
 *
 * 每个SEQ_KEY表示一个序号资源，顺序增加使用序号。
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class SysSeqno implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** 对应的数据库表名称 */
	public static final String TABLE_NAME = "SYS_SEQNO" ; 
	/* SYS_SEQNO table's columns definition */
	/** SEQ_KEY ：序号键值<br/><br/> */
	public static final String COLUMN_SEQ_KEY = "seq_key" ; 
	/** SEQ_NO ：序号数<br/><br/>顺序增加的数字 */
	public static final String COLUMN_SEQ_NO = "seq_no" ; 
	/** RESET ：重置方式<br/><br/>来自业务字典： DICT_SYS_RESET 如： 不重置（默认） 按天重置 按周重置 自定义重置周期（按指定时间间隔重置） ... */
	public static final String COLUMN_RESET = "reset" ; 
	/** RESET_PARAMS ：重置处理参数<br/><br/>重置程序执行时的输入参数，通过本参数指定六重置周期，重置执行时间，重置起始数字等 */
	public static final String COLUMN_RESET_PARAMS = "reset_params" ; 
	
	
	/** 字段类型：varchar<br/>字段名：序号键值<br/>描述： */
	private String seqKey ;
	
	/** 字段类型：decimal<br/>字段名：序号数<br/>描述：顺序增加的数字 */
	private BigDecimal seqNo ;
	
	/** 字段类型：varchar<br/>字段名：重置方式<br/>描述：来自业务字典： DICT_SYS_RESET 如： 不重置（默认） 按天重置 按周重置 自定义重置周期（按指定时间间隔重置） ... */
	private String reset ;
	
	/** 字段类型：varchar<br/>字段名：重置处理参数<br/>描述：重置程序执行时的输入参数，通过本参数指定六重置周期，重置执行时间，重置起始数字等 */
	private String resetParams ;
	
	
	/**
	 * Set the 序号键值.
	 * 
	 * @param seqKey
	 *            序号键值
	 */
	public void setSeqKey(String seqKey) {
 		this.seqKey = seqKey == null ? null : seqKey.trim() ;
    }
    
    /**
	 * Get the 序号键值.
	 * 
	 * @return 序号键值
	 */
	public String getSeqKey(){
		return this.seqKey ;
    }
	
	/**
	 * Set the 序号数.
	 * 
	 * @param seqNo
	 *            序号数
	 */
	public void setSeqNo(BigDecimal seqNo) {
 		this.seqNo = seqNo ;
    }
    
    /**
	 * Get the 序号数.
	 * 
	 * @return 序号数，如果setSeqNo时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getSeqNo(){
		if(seqNo==null){
			return new BigDecimal(0d);
		}
		return seqNo;
    }
	
	/**
	 * Set the 重置方式.
	 * 
	 * @param reset
	 *            重置方式
	 */
	public void setReset(String reset) {
 		this.reset = reset == null ? null : reset.trim() ;
    }
    
    /**
	 * Get the 重置方式.
	 * 
	 * @return 重置方式
	 */
	public String getReset(){
		return this.reset ;
    }
	
	/**
	 * Set the 重置处理参数.
	 * 
	 * @param resetParams
	 *            重置处理参数
	 */
	public void setResetParams(String resetParams) {
 		this.resetParams = resetParams == null ? null : resetParams.trim() ;
    }
    
    /**
	 * Get the 重置处理参数.
	 * 
	 * @return 重置处理参数
	 */
	public String getResetParams(){
		return this.resetParams ;
    }
	
	public String toString(){
		return StringUtil.toString(this) ; 
	}
}