package com.yonyou.iuap.teacher.entity;

import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Column;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Entity;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.GeneratedValue;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Id;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.FK;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.OneToMany;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Stragegy;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Table;
import com.yonyou.ifbp.persistence.vo.BaseEntity;


/**
 * <b> 此处简要描述此类功能 </b>
 * <p>
 *   此处添加类的描述信息
 * </p>
 *  创建日期:2019-3-14
 * @author 
 * @version 
 */
@Entity(namespace = "TrainMgt-public",name = "TeacherEntity")
@Table(name = "Train_Teacher")
public class TeacherEntity extends BaseEntity{
	
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "id")
    private java.lang.String id;
      
    @Column(name = "code")
    private java.lang.String code;
      
    @Column(name = "name")
    private java.lang.String name;
      
    @Column(name = "gender")
    private java.lang.String gender;
      
    @Column(name = "photo")
    private java.lang.String photo;
      
    @Column(name = "phone")
    private java.lang.String phone;
      
    @Column(name = "email")
    private java.lang.String email;
      
    @Column(name = "pid")
    private java.lang.String pid;
      
    @Column(name = "psn")
    private java.lang.String psn;
      
    @Column(name = "dept")
    private java.lang.String dept;
      
    @Column(name = "dr")
    private java.lang.Integer dr = 0;
      
    @Column(name = "ts")
    private java.util.Date ts;
        
	
	

	/**
	 * 属性 id的Getter方法.属性名：ID
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getId () {
		return id;
	}
	   
	/**
	 * 属性id的Setter方法.属性名：ID
	 * 创建日期:2019-3-14
	 * @param newId java.lang.String
	 */
	public void setId (java.lang.String newId ) {
	 	this.id = newId;
	} 	 
	
	/**
	 * 属性 code的Getter方法.属性名：编码
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getCode () {
		return code;
	}
	   
	/**
	 * 属性code的Setter方法.属性名：编码
	 * 创建日期:2019-3-14
	 * @param newCode java.lang.String
	 */
	public void setCode (java.lang.String newCode ) {
	 	this.code = newCode;
	} 	 
	
	/**
	 * 属性 name的Getter方法.属性名：名称
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getName () {
		return name;
	}
	   
	/**
	 * 属性name的Setter方法.属性名：名称
	 * 创建日期:2019-3-14
	 * @param newName java.lang.String
	 */
	public void setName (java.lang.String newName ) {
	 	this.name = newName;
	} 	 
	
	/**
	 * 属性 gender的Getter方法.属性名：性别
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getGender () {
		return gender;
	}
	   
	/**
	 * 属性gender的Setter方法.属性名：性别
	 * 创建日期:2019-3-14
	 * @param newGender java.lang.String
	 */
	public void setGender (java.lang.String newGender ) {
	 	this.gender = newGender;
	} 	 
	
	/**
	 * 属性 photo的Getter方法.属性名：照片
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getPhoto () {
		return photo;
	}
	   
	/**
	 * 属性photo的Setter方法.属性名：照片
	 * 创建日期:2019-3-14
	 * @param newPhoto java.lang.String
	 */
	public void setPhoto (java.lang.String newPhoto ) {
	 	this.photo = newPhoto;
	} 	 
	
	/**
	 * 属性 phone的Getter方法.属性名：联系电话
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getPhone () {
		return phone;
	}
	   
	/**
	 * 属性phone的Setter方法.属性名：联系电话
	 * 创建日期:2019-3-14
	 * @param newPhone java.lang.String
	 */
	public void setPhone (java.lang.String newPhone ) {
	 	this.phone = newPhone;
	} 	 
	
	/**
	 * 属性 email的Getter方法.属性名：电子邮件
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getEmail () {
		return email;
	}
	   
	/**
	 * 属性email的Setter方法.属性名：电子邮件
	 * 创建日期:2019-3-14
	 * @param newEmail java.lang.String
	 */
	public void setEmail (java.lang.String newEmail ) {
	 	this.email = newEmail;
	} 	 
	
	/**
	 * 属性 pid的Getter方法.属性名：身份标识
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getPid () {
		return pid;
	}
	   
	/**
	 * 属性pid的Setter方法.属性名：身份标识
	 * 创建日期:2019-3-14
	 * @param newPid java.lang.String
	 */
	public void setPid (java.lang.String newPid ) {
	 	this.pid = newPid;
	} 	 
	
	/**
	 * 属性 psn的Getter方法.属性名：员工
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getPsn () {
		return psn;
	}
	   
	/**
	 * 属性psn的Setter方法.属性名：员工
	 * 创建日期:2019-3-14
	 * @param newPsn java.lang.String
	 */
	public void setPsn (java.lang.String newPsn ) {
	 	this.psn = newPsn;
	} 	 
	
	/**
	 * 属性 dept的Getter方法.属性名：来源机构
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getDept () {
		return dept;
	}
	   
	/**
	 * 属性dept的Setter方法.属性名：来源机构
	 * 创建日期:2019-3-14
	 * @param newDept java.lang.String
	 */
	public void setDept (java.lang.String newDept ) {
	 	this.dept = newDept;
	} 	 
	
	/**
	 * 属性 dr的Getter方法.属性名：dr
	 *  创建日期:2019-3-14
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getDr () {
		return dr;
	}
	   
	/**
	 * 属性dr的Setter方法.属性名：dr
	 * 创建日期:2019-3-14
	 * @param newDr java.lang.Integer
	 */
	public void setDr (java.lang.Integer newDr ) {
	 	this.dr = newDr;
	} 	 
	
	/**
	 * 属性 ts的Getter方法.属性名：ts
	 *  创建日期:2019-3-14
	 * @return java.util.Date
	 */
	public java.util.Date getTs () {
		return ts;
	}
	   
	/**
	 * 属性ts的Setter方法.属性名：ts
	 * 创建日期:2019-3-14
	 * @param newTs java.util.Date
	 */
	public void setTs (java.util.Date newTs ) {
	 	this.ts = newTs;
	} 	 
	
    @Override
    public String getMetaDefinedName() {
        return "TeacherEntity";
    }

    @Override
    public String getNamespace() {
        return "TrainMgt-public";
    }
}