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
 * 员工
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/ABF-mysql.erm
 * 业务域：om
 * 模型：OM_EMPLOYEE 员工
 *
 * 人员信息表
人员至少隶属于一个机构；
本表记录了：人员基本信息，人员联系信息，人员在机构中的信息，人员对应的操作员信息集成了人员的多个维度信息一起。
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class OmEmployee implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	private String guid ;
	
	/** 字段类型：varchar<br/>字段名：员工代码<br/>描述： */
	private String empCode ;
	
	/** 字段类型：varchar<br/>字段名：员工姓名<br/>描述： */
	private String empName ;
	
	/** 字段类型：varchar<br/>字段名：员工全名<br/>描述： */
	private String empRealname ;
	
	/** 字段类型：varchar<br/>字段名：性别<br/>描述：见业务菜单：DICT_OM_GENDER */
	private String gender ;
	
	/** 字段类型：varchar<br/>字段名：员工状态<br/>描述：见业务字典： DICT_OM_EMPSTATUS */
	private String empstatus ;
	
	/** 字段类型：varchar<br/>字段名：员工职级<br/>描述：见业务字典： DICT_OM_EMPDEGREE */
	private String empDegree ;
	
	/** 字段类型：varchar<br/>字段名：主机构编号<br/>描述：人员所属主机构编号（冗余设计） */
	private String guidOrg ;
	
	/** 字段类型：varchar<br/>字段名：基本岗位<br/>描述： */
	private String guidPosition ;
	
	/** 字段类型：varchar<br/>字段名：直接主管<br/>描述： */
	private String guidEmpMajor ;
	
	/** 字段类型：date<br/>字段名：入职日期<br/>描述： */
	private Date indate ;
	
	/** 字段类型：date<br/>字段名：离职日期<br/>描述： */
	private Date outdate ;
	
	/** 字段类型：varchar<br/>字段名：办公电话<br/>描述： */
	private String otel ;
	
	/** 字段类型：varchar<br/>字段名：办公地址<br/>描述： */
	private String oaddress ;
	
	/** 字段类型：varchar<br/>字段名：办公邮编<br/>描述：见业务字典： DICT_SD_ZIPCODE */
	private String ozipcode ;
	
	/** 字段类型：varchar<br/>字段名：办公邮件<br/>描述： */
	private String oemail ;
	
	/** 字段类型：varchar<br/>字段名：传真号码<br/>描述： */
	private String faxno ;
	
	/** 字段类型：varchar<br/>字段名：手机号码<br/>描述： */
	private String mobileno ;
	
	/** 字段类型：varchar<br/>字段名：MSN号码<br/>描述： */
	private String msn ;
	
	/** 字段类型：varchar<br/>字段名：证件类型<br/>描述：见业务字典： DICT_SD_PAPERTYPE */
	private String paperType ;
	
	/** 字段类型：varchar<br/>字段名：证件号码<br/>描述： */
	private String paperNo ;
	
	/** 字段类型：date<br/>字段名：出生日期<br/>描述： */
	private Date birthdate ;
	
	/** 字段类型：varchar<br/>字段名：家庭电话<br/>描述： */
	private String htel ;
	
	/** 字段类型：varchar<br/>字段名：家庭地址<br/>描述： */
	private String haddress ;
	
	/** 字段类型：varchar<br/>字段名：家庭邮编<br/>描述：见业务字典： DICT_SD_ZIPCODE */
	private String hzipcode ;
	
	/** 字段类型：varchar<br/>字段名：政治面貌<br/>描述：见业务字典： DICT_SD_PARTY */
	private String party ;
	
	/** 字段类型：varchar<br/>字段名：私人电子邮箱<br/>描述： */
	private String pemail ;
	
	/** 字段类型：varchar<br/>字段名：操作员编号<br/>描述： */
	private String guidOperator ;
	
	/** 字段类型：varchar<br/>字段名：操作员<br/>描述：登陆用户id */
	private String userId ;
	
	/** 字段类型：varchar<br/>字段名：可授权角色<br/>描述：限定了该人员对应的操作员登陆系统时，可为其他操作员分配角色的范围； 可选内容来自角色表（AC_ROLE），json数组形式，如： [{roleid:"444555"},{roleid:"999888"},....] */
	private String specialty ;
	
	/** 字段类型：varchar<br/>字段名：可管理机构<br/>描述：限定了本人员对应的操作员可维护哪些机构信息（机构，人员等与机构关联的信息），json数组形式，如： [{orgid:"123"},{orgid:"456"},....] 如果为空，则表示无任何机构的管理权限 */
	private String orgList ;
	
	/** 字段类型：varchar<br/>字段名：工作描述<br/>描述： */
	private String workexp ;
	
	/** 字段类型：varchar<br/>字段名：备注<br/>描述： */
	private String remark ;
	
	/** 字段类型：date<br/>字段名：注册日期<br/>描述：首次新增人员记录数据的日期 */
	private Date regdate ;
	
	/** 字段类型：timestamp<br/>字段名：创建时间<br/>描述： */
	private Date createtime ;
	
	/** 字段类型：timestamp<br/>字段名：最新更新时间<br/>描述： */
	private Date lastmodytime ;
	
	
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
	 * Set the 员工代码.
	 * 
	 * @param empCode
	 *            员工代码
	 */
	public void setEmpCode(String empCode) {
 		this.empCode = empCode == null ? null : empCode.trim() ;
    }
    
    /**
	 * Get the 员工代码.
	 * 
	 * @return 员工代码
	 */
	public String getEmpCode(){
		return this.empCode ;
    }
	
	/**
	 * Set the 员工姓名.
	 * 
	 * @param empName
	 *            员工姓名
	 */
	public void setEmpName(String empName) {
 		this.empName = empName == null ? null : empName.trim() ;
    }
    
    /**
	 * Get the 员工姓名.
	 * 
	 * @return 员工姓名
	 */
	public String getEmpName(){
		return this.empName ;
    }
	
	/**
	 * Set the 员工全名.
	 * 
	 * @param empRealname
	 *            员工全名
	 */
	public void setEmpRealname(String empRealname) {
 		this.empRealname = empRealname == null ? null : empRealname.trim() ;
    }
    
    /**
	 * Get the 员工全名.
	 * 
	 * @return 员工全名
	 */
	public String getEmpRealname(){
		return this.empRealname ;
    }
	
	/**
	 * Set the 性别.
	 * 
	 * @param gender
	 *            性别
	 */
	public void setGender(String gender) {
 		this.gender = gender == null ? null : gender.trim() ;
    }
    
    /**
	 * Get the 性别.
	 * 
	 * @return 性别
	 */
	public String getGender(){
		return this.gender ;
    }
	
	/**
	 * Set the 员工状态.
	 * 
	 * @param empstatus
	 *            员工状态
	 */
	public void setEmpstatus(String empstatus) {
 		this.empstatus = empstatus == null ? null : empstatus.trim() ;
    }
    
    /**
	 * Get the 员工状态.
	 * 
	 * @return 员工状态
	 */
	public String getEmpstatus(){
		return this.empstatus ;
    }
	
	/**
	 * Set the 员工职级.
	 * 
	 * @param empDegree
	 *            员工职级
	 */
	public void setEmpDegree(String empDegree) {
 		this.empDegree = empDegree == null ? null : empDegree.trim() ;
    }
    
    /**
	 * Get the 员工职级.
	 * 
	 * @return 员工职级
	 */
	public String getEmpDegree(){
		return this.empDegree ;
    }
	
	/**
	 * Set the 主机构编号.
	 * 
	 * @param guidOrg
	 *            主机构编号
	 */
	public void setGuidOrg(String guidOrg) {
 		this.guidOrg = guidOrg == null ? null : guidOrg.trim() ;
    }
    
    /**
	 * Get the 主机构编号.
	 * 
	 * @return 主机构编号
	 */
	public String getGuidOrg(){
		return this.guidOrg ;
    }
	
	/**
	 * Set the 基本岗位.
	 * 
	 * @param guidPosition
	 *            基本岗位
	 */
	public void setGuidPosition(String guidPosition) {
 		this.guidPosition = guidPosition == null ? null : guidPosition.trim() ;
    }
    
    /**
	 * Get the 基本岗位.
	 * 
	 * @return 基本岗位
	 */
	public String getGuidPosition(){
		return this.guidPosition ;
    }
	
	/**
	 * Set the 直接主管.
	 * 
	 * @param guidEmpMajor
	 *            直接主管
	 */
	public void setGuidEmpMajor(String guidEmpMajor) {
 		this.guidEmpMajor = guidEmpMajor == null ? null : guidEmpMajor.trim() ;
    }
    
    /**
	 * Get the 直接主管.
	 * 
	 * @return 直接主管
	 */
	public String getGuidEmpMajor(){
		return this.guidEmpMajor ;
    }
	
	/**
	 * Set the 入职日期.
	 * 
	 * @param indate
	 *            入职日期
	 */
	public void setIndate(Date indate) {
 		this.indate = indate ;
    }
    
    /**
	 * Get the 入职日期.
	 * 
	 * @return 入职日期
	 */
	public Date getIndate(){
		return this.indate ;
    }
	
	/**
	 * Set the 离职日期.
	 * 
	 * @param outdate
	 *            离职日期
	 */
	public void setOutdate(Date outdate) {
 		this.outdate = outdate ;
    }
    
    /**
	 * Get the 离职日期.
	 * 
	 * @return 离职日期
	 */
	public Date getOutdate(){
		return this.outdate ;
    }
	
	/**
	 * Set the 办公电话.
	 * 
	 * @param otel
	 *            办公电话
	 */
	public void setOtel(String otel) {
 		this.otel = otel == null ? null : otel.trim() ;
    }
    
    /**
	 * Get the 办公电话.
	 * 
	 * @return 办公电话
	 */
	public String getOtel(){
		return this.otel ;
    }
	
	/**
	 * Set the 办公地址.
	 * 
	 * @param oaddress
	 *            办公地址
	 */
	public void setOaddress(String oaddress) {
 		this.oaddress = oaddress == null ? null : oaddress.trim() ;
    }
    
    /**
	 * Get the 办公地址.
	 * 
	 * @return 办公地址
	 */
	public String getOaddress(){
		return this.oaddress ;
    }
	
	/**
	 * Set the 办公邮编.
	 * 
	 * @param ozipcode
	 *            办公邮编
	 */
	public void setOzipcode(String ozipcode) {
 		this.ozipcode = ozipcode == null ? null : ozipcode.trim() ;
    }
    
    /**
	 * Get the 办公邮编.
	 * 
	 * @return 办公邮编
	 */
	public String getOzipcode(){
		return this.ozipcode ;
    }
	
	/**
	 * Set the 办公邮件.
	 * 
	 * @param oemail
	 *            办公邮件
	 */
	public void setOemail(String oemail) {
 		this.oemail = oemail == null ? null : oemail.trim() ;
    }
    
    /**
	 * Get the 办公邮件.
	 * 
	 * @return 办公邮件
	 */
	public String getOemail(){
		return this.oemail ;
    }
	
	/**
	 * Set the 传真号码.
	 * 
	 * @param faxno
	 *            传真号码
	 */
	public void setFaxno(String faxno) {
 		this.faxno = faxno == null ? null : faxno.trim() ;
    }
    
    /**
	 * Get the 传真号码.
	 * 
	 * @return 传真号码
	 */
	public String getFaxno(){
		return this.faxno ;
    }
	
	/**
	 * Set the 手机号码.
	 * 
	 * @param mobileno
	 *            手机号码
	 */
	public void setMobileno(String mobileno) {
 		this.mobileno = mobileno == null ? null : mobileno.trim() ;
    }
    
    /**
	 * Get the 手机号码.
	 * 
	 * @return 手机号码
	 */
	public String getMobileno(){
		return this.mobileno ;
    }
	
	/**
	 * Set the MSN号码.
	 * 
	 * @param msn
	 *            MSN号码
	 */
	public void setMsn(String msn) {
 		this.msn = msn == null ? null : msn.trim() ;
    }
    
    /**
	 * Get the MSN号码.
	 * 
	 * @return MSN号码
	 */
	public String getMsn(){
		return this.msn ;
    }
	
	/**
	 * Set the 证件类型.
	 * 
	 * @param paperType
	 *            证件类型
	 */
	public void setPaperType(String paperType) {
 		this.paperType = paperType == null ? null : paperType.trim() ;
    }
    
    /**
	 * Get the 证件类型.
	 * 
	 * @return 证件类型
	 */
	public String getPaperType(){
		return this.paperType ;
    }
	
	/**
	 * Set the 证件号码.
	 * 
	 * @param paperNo
	 *            证件号码
	 */
	public void setPaperNo(String paperNo) {
 		this.paperNo = paperNo == null ? null : paperNo.trim() ;
    }
    
    /**
	 * Get the 证件号码.
	 * 
	 * @return 证件号码
	 */
	public String getPaperNo(){
		return this.paperNo ;
    }
	
	/**
	 * Set the 出生日期.
	 * 
	 * @param birthdate
	 *            出生日期
	 */
	public void setBirthdate(Date birthdate) {
 		this.birthdate = birthdate ;
    }
    
    /**
	 * Get the 出生日期.
	 * 
	 * @return 出生日期
	 */
	public Date getBirthdate(){
		return this.birthdate ;
    }
	
	/**
	 * Set the 家庭电话.
	 * 
	 * @param htel
	 *            家庭电话
	 */
	public void setHtel(String htel) {
 		this.htel = htel == null ? null : htel.trim() ;
    }
    
    /**
	 * Get the 家庭电话.
	 * 
	 * @return 家庭电话
	 */
	public String getHtel(){
		return this.htel ;
    }
	
	/**
	 * Set the 家庭地址.
	 * 
	 * @param haddress
	 *            家庭地址
	 */
	public void setHaddress(String haddress) {
 		this.haddress = haddress == null ? null : haddress.trim() ;
    }
    
    /**
	 * Get the 家庭地址.
	 * 
	 * @return 家庭地址
	 */
	public String getHaddress(){
		return this.haddress ;
    }
	
	/**
	 * Set the 家庭邮编.
	 * 
	 * @param hzipcode
	 *            家庭邮编
	 */
	public void setHzipcode(String hzipcode) {
 		this.hzipcode = hzipcode == null ? null : hzipcode.trim() ;
    }
    
    /**
	 * Get the 家庭邮编.
	 * 
	 * @return 家庭邮编
	 */
	public String getHzipcode(){
		return this.hzipcode ;
    }
	
	/**
	 * Set the 政治面貌.
	 * 
	 * @param party
	 *            政治面貌
	 */
	public void setParty(String party) {
 		this.party = party == null ? null : party.trim() ;
    }
    
    /**
	 * Get the 政治面貌.
	 * 
	 * @return 政治面貌
	 */
	public String getParty(){
		return this.party ;
    }
	
	/**
	 * Set the 私人电子邮箱.
	 * 
	 * @param pemail
	 *            私人电子邮箱
	 */
	public void setPemail(String pemail) {
 		this.pemail = pemail == null ? null : pemail.trim() ;
    }
    
    /**
	 * Get the 私人电子邮箱.
	 * 
	 * @return 私人电子邮箱
	 */
	public String getPemail(){
		return this.pemail ;
    }
	
	/**
	 * Set the 操作员编号.
	 * 
	 * @param guidOperator
	 *            操作员编号
	 */
	public void setGuidOperator(String guidOperator) {
 		this.guidOperator = guidOperator == null ? null : guidOperator.trim() ;
    }
    
    /**
	 * Get the 操作员编号.
	 * 
	 * @return 操作员编号
	 */
	public String getGuidOperator(){
		return this.guidOperator ;
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
	 * Set the 可授权角色.
	 * 
	 * @param specialty
	 *            可授权角色
	 */
	public void setSpecialty(String specialty) {
 		this.specialty = specialty == null ? null : specialty.trim() ;
    }
    
    /**
	 * Get the 可授权角色.
	 * 
	 * @return 可授权角色
	 */
	public String getSpecialty(){
		return this.specialty ;
    }
	
	/**
	 * Set the 可管理机构.
	 * 
	 * @param orgList
	 *            可管理机构
	 */
	public void setOrgList(String orgList) {
 		this.orgList = orgList == null ? null : orgList.trim() ;
    }
    
    /**
	 * Get the 可管理机构.
	 * 
	 * @return 可管理机构
	 */
	public String getOrgList(){
		return this.orgList ;
    }
	
	/**
	 * Set the 工作描述.
	 * 
	 * @param workexp
	 *            工作描述
	 */
	public void setWorkexp(String workexp) {
 		this.workexp = workexp == null ? null : workexp.trim() ;
    }
    
    /**
	 * Get the 工作描述.
	 * 
	 * @return 工作描述
	 */
	public String getWorkexp(){
		return this.workexp ;
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
	
	/**
	 * Set the 注册日期.
	 * 
	 * @param regdate
	 *            注册日期
	 */
	public void setRegdate(Date regdate) {
 		this.regdate = regdate ;
    }
    
    /**
	 * Get the 注册日期.
	 * 
	 * @return 注册日期
	 */
	public Date getRegdate(){
		return this.regdate ;
    }
	
	/**
	 * Set the 创建时间.
	 * 
	 * @param createtime
	 *            创建时间
	 */
	public void setCreatetime(Date createtime) {
 		this.createtime = createtime ;
    }
    
    /**
	 * Get the 创建时间.
	 * 
	 * @return 创建时间
	 */
	public Date getCreatetime(){
		return this.createtime ;
    }
	
	/**
	 * Set the 最新更新时间.
	 * 
	 * @param lastmodytime
	 *            最新更新时间
	 */
	public void setLastmodytime(Date lastmodytime) {
 		this.lastmodytime = lastmodytime ;
    }
    
    /**
	 * Get the 最新更新时间.
	 * 
	 * @return 最新更新时间
	 */
	public Date getLastmodytime(){
		return this.lastmodytime ;
    }
	
	public String toString(){
		return StringUtils.toString(this) ; 
	}
}