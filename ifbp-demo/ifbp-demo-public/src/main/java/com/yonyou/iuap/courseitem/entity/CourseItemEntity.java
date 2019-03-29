package com.yonyou.iuap.courseitem.entity;

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
@Entity(namespace = "TrainMgt-public",name = "CourseItemEntity")
@Table(name = "Train_CourseItem")
public class CourseItemEntity extends BaseEntity{
	 
    @FK(name = "course", referenceTableName = "Train_Course", referencedColumnName = "id") 
    @Column(name = "course")
    private java.lang.String course;
    
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "id")
    private java.lang.String id;
      
    @Column(name = "name")
    private java.lang.String name;
      
    @Column(name = "remark")
    private java.lang.String remark;
      
    @Column(name = "duration")
    private java.lang.String duration;
      
    @Column(name = "grade")
    private java.lang.String grade;
      
    @Column(name = "type")
    private java.lang.String type;
      
    @Column(name = "dr")
    private java.lang.Integer dr = 0;
      
    @Column(name = "ts")
    private java.util.Date ts;
        
	
	

	/**
	 * 属性 course的Getter方法.属性名：parentPK
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getCourse () {
		return course;
	}
	   
	/**
	 * 属性course的Setter方法.属性名：parentPK
	 * 创建日期:2019-3-14
	 * @param newCourse java.lang.String
	 */
	public void setCourse (java.lang.String newCourse ) {
	 	this.course = newCourse;
	} 	 
	
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
	 * 属性 name的Getter方法.属性名：课程名称
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getName () {
		return name;
	}
	   
	/**
	 * 属性name的Setter方法.属性名：课程名称
	 * 创建日期:2019-3-14
	 * @param newName java.lang.String
	 */
	public void setName (java.lang.String newName ) {
	 	this.name = newName;
	} 	 
	
	/**
	 * 属性 remark的Getter方法.属性名：课程描述
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getRemark () {
		return remark;
	}
	   
	/**
	 * 属性remark的Setter方法.属性名：课程描述
	 * 创建日期:2019-3-14
	 * @param newRemark java.lang.String
	 */
	public void setRemark (java.lang.String newRemark ) {
	 	this.remark = newRemark;
	} 	 
	
	/**
	 * 属性 duration的Getter方法.属性名：学习时长
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getDuration () {
		return duration;
	}
	   
	/**
	 * 属性duration的Setter方法.属性名：学习时长
	 * 创建日期:2019-3-14
	 * @param newDuration java.lang.String
	 */
	public void setDuration (java.lang.String newDuration ) {
	 	this.duration = newDuration;
	} 	 
	
	/**
	 * 属性 grade的Getter方法.属性名：课程级别
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getGrade () {
		return grade;
	}
	   
	/**
	 * 属性grade的Setter方法.属性名：课程级别
	 * 创建日期:2019-3-14
	 * @param newGrade java.lang.String
	 */
	public void setGrade (java.lang.String newGrade ) {
	 	this.grade = newGrade;
	} 	 
	
	/**
	 * 属性 type的Getter方法.属性名：课程类别
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getType () {
		return type;
	}
	   
	/**
	 * 属性type的Setter方法.属性名：课程类别
	 * 创建日期:2019-3-14
	 * @param newType java.lang.String
	 */
	public void setType (java.lang.String newType ) {
	 	this.type = newType;
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
        return "CourseItemEntity";
    }

    @Override
    public String getNamespace() {
        return "TrainMgt-public";
    }
}