package com.yonyou.iuap.trainingteachers.entity;

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
@Entity(namespace = "TrainMgt-public",name = "TrainingTeachersEntity")
@Table(name = "Train_TrainingTeachers")
public class TrainingTeachersEntity extends BaseEntity{
	 
    @FK(name = "trainingteachers", referenceTableName = "Train_Training", referencedColumnName = "id") 
    @Column(name = "trainingteachers")
    private java.lang.String trainingteachers;
    
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "id")
    private java.lang.String id;
      
    @Column(name = "teacher")
    private java.lang.String teacher;
      
    @Column(name = "position")
    private java.lang.String position;
      
    @Column(name = "dr")
    private java.lang.Integer dr = 0;
      
    @Column(name = "ts")
    private java.util.Date ts;
        
	
	

	/**
	 * 属性 trainingteachers的Getter方法.属性名：parentPK
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getTrainingteachers () {
		return trainingteachers;
	}
	   
	/**
	 * 属性trainingteachers的Setter方法.属性名：parentPK
	 * 创建日期:2019-3-14
	 * @param newTrainingteachers java.lang.String
	 */
	public void setTrainingteachers (java.lang.String newTrainingteachers ) {
	 	this.trainingteachers = newTrainingteachers;
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
	 * 属性 teacher的Getter方法.属性名：老师
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getTeacher () {
		return teacher;
	}
	   
	/**
	 * 属性teacher的Setter方法.属性名：老师
	 * 创建日期:2019-3-14
	 * @param newTeacher java.lang.String
	 */
	public void setTeacher (java.lang.String newTeacher ) {
	 	this.teacher = newTeacher;
	} 	 
	
	/**
	 * 属性 position的Getter方法.属性名：职责
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getPosition () {
		return position;
	}
	   
	/**
	 * 属性position的Setter方法.属性名：职责
	 * 创建日期:2019-3-14
	 * @param newPosition java.lang.String
	 */
	public void setPosition (java.lang.String newPosition ) {
	 	this.position = newPosition;
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
        return "TrainingTeachersEntity";
    }

    @Override
    public String getNamespace() {
        return "TrainMgt-public";
    }
}