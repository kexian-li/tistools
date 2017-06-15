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
 * 测试
 * 模型文件 ： E:\github\soft\tistools\tistools\tools-core-basic\model\ABF-mysql.erm
 * 业务域：sys
 * 模型：SYS_TEST 测试
 *
 * 测试
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class SysTest implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** 对应的数据库表名称 */
	public static final String TABLE_NAME = "SYS_TEST" ; 
	/* SYS_TEST table's columns definition */
	/** TEST_BIGINT ：测试BIGINT<br/><br/> */
	public static final String COLUMN_TEST_BIGINT = "test_bigint" ; 
	/** TEST_GIBINTN ：测试GIBINT(8)<br/><br/> */
	public static final String COLUMN_TEST_GIBINTN = "test_gibintn" ; 
	/** TEST_CHAR ：测试CHAR<br/><br/> */
	public static final String COLUMN_TEST_CHAR = "test_char" ; 
	/** TEST_CHARN ：测试CHAR(16)<br/><br/> */
	public static final String COLUMN_TEST_CHARN = "test_charn" ; 
	/** TEST_DATE ：测试DATE<br/><br/> */
	public static final String COLUMN_TEST_DATE = "test_date" ; 
	/** TEST_DATETIME ：测试DATETIME<br/><br/> */
	public static final String COLUMN_TEST_DATETIME = "test_datetime" ; 
	/** TEST_DECIMAL ：测试DECIMAL<br/><br/> */
	public static final String COLUMN_TEST_DECIMAL = "test_decimal" ; 
	/** TEST_DECIMALP ：测试DECIMAL(12)<br/><br/> */
	public static final String COLUMN_TEST_DECIMALP = "test_decimalp" ; 
	/** TEST_DECIMALPS ：测试DECIMAL(12,4)<br/><br/> */
	public static final String COLUMN_TEST_DECIMALPS = "test_decimalps" ; 
	/** TEST_DOUBLE ：测试DOUBLE<br/><br/> */
	public static final String COLUMN_TEST_DOUBLE = "test_double" ; 
	/** TEST_DOUBLEMD ：测试DOUBLE(10,4)<br/><br/> */
	public static final String COLUMN_TEST_DOUBLEMD = "test_doublemd" ; 
	/** TEST_FLOAT ：测试FLOAT<br/><br/> */
	public static final String COLUMN_TEST_FLOAT = "test_float" ; 
	/** TEST_FLOATP ：测试FLOAT(10)<br/><br/> */
	public static final String COLUMN_TEST_FLOATP = "test_floatp" ; 
	/** TEST_FLOATMD ：测试FLOAT(10,4)<br/><br/> */
	public static final String COLUMN_TEST_FLOATMD = "test_floatmd" ; 
	/** TEST_INT ：测试INT<br/><br/> */
	public static final String COLUMN_TEST_INT = "test_int" ; 
	/** TEST_INTN ：测试INT(12)<br/><br/> */
	public static final String COLUMN_TEST_INTN = "test_intn" ; 
	/** TEST_TIME ：测试TIME<br/><br/> */
	public static final String COLUMN_TEST_TIME = "test_time" ; 
	/** TEST_TIMESTAMP ：测试TIMESTAMP<br/><br/> */
	public static final String COLUMN_TEST_TIMESTAMP = "test_timestamp" ; 
	/** TEST_VARCHARN ：测试VARCHAR(32)<br/><br/> */
	public static final String COLUMN_TEST_VARCHARN = "test_varcharn" ; 
	/** TSET_TEXT ：测试TEXT<br/><br/> */
	public static final String COLUMN_TSET_TEXT = "tset_text" ; 
	/** TEST_BLOB ：测试BLOB<br/><br/> */
	public static final String COLUMN_TEST_BLOB = "test_blob" ; 
	
	
	/** 字段类型：bigint<br/>字段名：测试BIGINT<br/>描述： */
	private Long testBigint ;
	
	/** 字段类型：bigint<br/>字段名：测试GIBINT(8)<br/>描述： */
	private Long testGibintn ;
	
	/** 字段类型：char<br/>字段名：测试CHAR<br/>描述： */
	private String testChar ;
	
	/** 字段类型：char<br/>字段名：测试CHAR(16)<br/>描述： */
	private String testCharn ;
	
	/** 字段类型：date<br/>字段名：测试DATE<br/>描述： */
	private Date testDate ;
	
	/** 字段类型：datetime<br/>字段名：测试DATETIME<br/>描述： */
	private Date testDatetime ;
	
	/** 字段类型：decimal<br/>字段名：测试DECIMAL<br/>描述： */
	private BigDecimal testDecimal ;
	
	/** 字段类型：decimal<br/>字段名：测试DECIMAL(12)<br/>描述： */
	private BigDecimal testDecimalp ;
	
	/** 字段类型：decimal<br/>字段名：测试DECIMAL(12,4)<br/>描述： */
	private BigDecimal testDecimalps ;
	
	/** 字段类型：double<br/>字段名：测试DOUBLE<br/>描述： */
	private Double testDouble ;
	
	/** 字段类型：double<br/>字段名：测试DOUBLE(10,4)<br/>描述： */
	private Double testDoublemd ;
	
	/** 字段类型：float<br/>字段名：测试FLOAT<br/>描述： */
	private Float testFloat ;
	
	/** 字段类型：float<br/>字段名：测试FLOAT(10)<br/>描述： */
	private Float testFloatp ;
	
	/** 字段类型：float<br/>字段名：测试FLOAT(10,4)<br/>描述： */
	private Float testFloatmd ;
	
	/** 字段类型：int<br/>字段名：测试INT<br/>描述： */
	private Integer testInt ;
	
	/** 字段类型：int<br/>字段名：测试INT(12)<br/>描述： */
	private Integer testIntn ;
	
	/** 字段类型：time<br/>字段名：测试TIME<br/>描述： */
	private Time testTime ;
	
	/** 字段类型：timestamp<br/>字段名：测试TIMESTAMP<br/>描述： */
	private Date testTimestamp ;
	
	/** 字段类型：varchar<br/>字段名：测试VARCHAR(32)<br/>描述： */
	private String testVarcharn ;
	
	/** 字段类型：text<br/>字段名：测试TEXT<br/>描述： */
	private String tsetText ;
	
	/** 字段类型：blob<br/>字段名：测试BLOB<br/>描述： */
	private Blob testBlob ;
	
	
	/**
	 * Set the 测试BIGINT.
	 * 
	 * @param testBigint
	 *            测试BIGINT
	 */
	public void setTestBigint(Long testBigint) {
 		this.testBigint = testBigint ;
    }
    
    /**
	 * Get the 测试BIGINT.
	 * 
	 * @return 测试BIGINT
	 */
	public Long getTestBigint(){
		return this.testBigint ;
    }
	
	/**
	 * Set the 测试GIBINT(8).
	 * 
	 * @param testGibintn
	 *            测试GIBINT(8)
	 */
	public void setTestGibintn(Long testGibintn) {
 		this.testGibintn = testGibintn ;
    }
    
    /**
	 * Get the 测试GIBINT(8).
	 * 
	 * @return 测试GIBINT(8)
	 */
	public Long getTestGibintn(){
		return this.testGibintn ;
    }
	
	/**
	 * Set the 测试CHAR.
	 * 
	 * @param testChar
	 *            测试CHAR
	 */
	public void setTestChar(String testChar) {
 		this.testChar = testChar == null ? null : testChar.trim() ;
    }
    
    /**
	 * Get the 测试CHAR.
	 * 
	 * @return 测试CHAR
	 */
	public String getTestChar(){
		return this.testChar ;
    }
	
	/**
	 * Set the 测试CHAR(16).
	 * 
	 * @param testCharn
	 *            测试CHAR(16)
	 */
	public void setTestCharn(String testCharn) {
 		this.testCharn = testCharn == null ? null : testCharn.trim() ;
    }
    
    /**
	 * Get the 测试CHAR(16).
	 * 
	 * @return 测试CHAR(16)
	 */
	public String getTestCharn(){
		return this.testCharn ;
    }
	
	/**
	 * Set the 测试DATE.
	 * 
	 * @param testDate
	 *            测试DATE
	 */
	public void setTestDate(Date testDate) {
 		this.testDate = testDate ;
    }
    
    /**
	 * Get the 测试DATE.
	 * 
	 * @return 测试DATE
	 */
	public Date getTestDate(){
		return this.testDate ;
    }
	
	/**
	 * Set the 测试DATETIME.
	 * 
	 * @param testDatetime
	 *            测试DATETIME
	 */
	public void setTestDatetime(Date testDatetime) {
 		this.testDatetime = testDatetime ;
    }
    
    /**
	 * Get the 测试DATETIME.
	 * 
	 * @return 测试DATETIME
	 */
	public Date getTestDatetime(){
		return this.testDatetime ;
    }
	
	/**
	 * Set the 测试DECIMAL.
	 * 
	 * @param testDecimal
	 *            测试DECIMAL
	 */
	public void setTestDecimal(BigDecimal testDecimal) {
 		this.testDecimal = testDecimal ;
    }
    
    /**
	 * Get the 测试DECIMAL.
	 * 
	 * @return 测试DECIMAL，如果setTestDecimal时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getTestDecimal(){
		if(testDecimal==null){
			return new BigDecimal(0d);
		}
		return testDecimal;
    }
	
	/**
	 * Set the 测试DECIMAL(12).
	 * 
	 * @param testDecimalp
	 *            测试DECIMAL(12)
	 */
	public void setTestDecimalp(BigDecimal testDecimalp) {
 		this.testDecimalp = testDecimalp ;
    }
    
    /**
	 * Get the 测试DECIMAL(12).
	 * 
	 * @return 测试DECIMAL(12)，如果setTestDecimalp时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getTestDecimalp(){
		if(testDecimalp==null){
			return new BigDecimal(0d);
		}
		return testDecimalp;
    }
	
	/**
	 * Set the 测试DECIMAL(12,4).
	 * 
	 * @param testDecimalps
	 *            测试DECIMAL(12,4)
	 */
	public void setTestDecimalps(BigDecimal testDecimalps) {
 		this.testDecimalps = testDecimalps ;
    }
    
    /**
	 * Get the 测试DECIMAL(12,4).
	 * 
	 * @return 测试DECIMAL(12,4)，如果setTestDecimalps时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getTestDecimalps(){
		if(testDecimalps==null){
			return new BigDecimal(0d);
		}
		return testDecimalps;
    }
	
	/**
	 * Set the 测试DOUBLE.
	 * 
	 * @param testDouble
	 *            测试DOUBLE
	 */
	public void setTestDouble(Double testDouble) {
 		this.testDouble = testDouble ;
    }
    
    /**
	 * Get the 测试DOUBLE.
	 * 
	 * @return 测试DOUBLE，如果setTestDouble时原值为空，返回0d
	 */
	public Double getTestDouble(){
		if(testDouble==null){
			return 0d;
		}
        return testDouble;
    }
	
	/**
	 * Set the 测试DOUBLE(10,4).
	 * 
	 * @param testDoublemd
	 *            测试DOUBLE(10,4)
	 */
	public void setTestDoublemd(Double testDoublemd) {
 		this.testDoublemd = testDoublemd ;
    }
    
    /**
	 * Get the 测试DOUBLE(10,4).
	 * 
	 * @return 测试DOUBLE(10,4)，如果setTestDoublemd时原值为空，返回0d
	 */
	public Double getTestDoublemd(){
		if(testDoublemd==null){
			return 0d;
		}
        return testDoublemd;
    }
	
	/**
	 * Set the 测试FLOAT.
	 * 
	 * @param testFloat
	 *            测试FLOAT
	 */
	public void setTestFloat(Float testFloat) {
 		this.testFloat = testFloat ;
    }
    
    /**
	 * Get the 测试FLOAT.
	 * 
	 * @return 测试FLOAT，如果setTestFloat时原值为空，返回0f
	 */
	public Float getTestFloat(){
		if(testFloat==null){
			return 0f;
		}
        return testFloat;
    }
	
	/**
	 * Set the 测试FLOAT(10).
	 * 
	 * @param testFloatp
	 *            测试FLOAT(10)
	 */
	public void setTestFloatp(Float testFloatp) {
 		this.testFloatp = testFloatp ;
    }
    
    /**
	 * Get the 测试FLOAT(10).
	 * 
	 * @return 测试FLOAT(10)，如果setTestFloatp时原值为空，返回0f
	 */
	public Float getTestFloatp(){
		if(testFloatp==null){
			return 0f;
		}
        return testFloatp;
    }
	
	/**
	 * Set the 测试FLOAT(10,4).
	 * 
	 * @param testFloatmd
	 *            测试FLOAT(10,4)
	 */
	public void setTestFloatmd(Float testFloatmd) {
 		this.testFloatmd = testFloatmd ;
    }
    
    /**
	 * Get the 测试FLOAT(10,4).
	 * 
	 * @return 测试FLOAT(10,4)，如果setTestFloatmd时原值为空，返回0f
	 */
	public Float getTestFloatmd(){
		if(testFloatmd==null){
			return 0f;
		}
        return testFloatmd;
    }
	
	/**
	 * Set the 测试INT.
	 * 
	 * @param testInt
	 *            测试INT
	 */
	public void setTestInt(Integer testInt) {
 		this.testInt = testInt ;
    }
    
    /**
	 * Get the 测试INT.
	 * 
	 * @return 测试INT
	 */
	public Integer getTestInt(){
		return this.testInt ;
    }
	
	/**
	 * Set the 测试INT(12).
	 * 
	 * @param testIntn
	 *            测试INT(12)
	 */
	public void setTestIntn(Integer testIntn) {
 		this.testIntn = testIntn ;
    }
    
    /**
	 * Get the 测试INT(12).
	 * 
	 * @return 测试INT(12)
	 */
	public Integer getTestIntn(){
		return this.testIntn ;
    }
	
	/**
	 * Set the 测试TIME.
	 * 
	 * @param testTime
	 *            测试TIME
	 */
	public void setTestTime(Time testTime) {
 		this.testTime = testTime ;
    }
    
    /**
	 * Get the 测试TIME.
	 * 
	 * @return 测试TIME
	 */
	public Time getTestTime(){
		return this.testTime ;
    }
	
	/**
	 * Set the 测试TIMESTAMP.
	 * 
	 * @param testTimestamp
	 *            测试TIMESTAMP
	 */
	public void setTestTimestamp(Date testTimestamp) {
 		this.testTimestamp = testTimestamp ;
    }
    
    /**
	 * Get the 测试TIMESTAMP.
	 * 
	 * @return 测试TIMESTAMP
	 */
	public Date getTestTimestamp(){
		return this.testTimestamp ;
    }
	
	/**
	 * Set the 测试VARCHAR(32).
	 * 
	 * @param testVarcharn
	 *            测试VARCHAR(32)
	 */
	public void setTestVarcharn(String testVarcharn) {
 		this.testVarcharn = testVarcharn == null ? null : testVarcharn.trim() ;
    }
    
    /**
	 * Get the 测试VARCHAR(32).
	 * 
	 * @return 测试VARCHAR(32)
	 */
	public String getTestVarcharn(){
		return this.testVarcharn ;
    }
	
	/**
	 * Set the 测试TEXT.
	 * 
	 * @param tsetText
	 *            测试TEXT
	 */
	public void setTsetText(String tsetText) {
 		this.tsetText = tsetText == null ? null : tsetText.trim() ;
    }
    
    /**
	 * Get the 测试TEXT.
	 * 
	 * @return 测试TEXT
	 */
	public String getTsetText(){
		return this.tsetText ;
    }
	
	/**
	 * Set the 测试BLOB.
	 * 
	 * @param testBlob
	 *            测试BLOB
	 */
	public void setTestBlob(Blob testBlob) {
 		this.testBlob = testBlob ;
    }
    
    /**
	 * Get the 测试BLOB.
	 * 
	 * @return 测试BLOB
	 */
	public Blob getTestBlob(){
		return this.testBlob ;
    }
	
	public String toString(){
		return StringUtil.toString(this) ; 
	}
}