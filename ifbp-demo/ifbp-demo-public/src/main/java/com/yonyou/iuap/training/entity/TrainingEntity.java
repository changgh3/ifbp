package com.yonyou.iuap.training.entity;

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
@Entity(namespace = "TrainMgt-public",name = "TrainingEntity")
@Table(name = "Train_Training")
public class TrainingEntity extends BaseEntity{
	
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "id")
    private java.lang.String id;
      
    @Column(name = "start_date")
    private java.lang.String start_date;
      
    @Column(name = "place")
    private java.lang.String place;
      
    @Column(name = "course")
    private java.lang.String course;
      
    @Column(name = "dr")
    private java.lang.Integer dr = 0;
      
    @Column(name = "ts")
    private java.util.Date ts;
        
	
    @OneToMany(targetEntity = com.yonyou.iuap.trainingstudents.entity.TrainingStudentsEntity.class)
    private java.util.List<com.yonyou.iuap.trainingstudents.entity.TrainingStudentsEntity> trainingstudents;
    @OneToMany(targetEntity = com.yonyou.iuap.trainingteachers.entity.TrainingTeachersEntity.class)
    private java.util.List<com.yonyou.iuap.trainingteachers.entity.TrainingTeachersEntity> trainingteachers;
	

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
	 * 属性 start_date的Getter方法.属性名：培训日期
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getStart_date () {
		return start_date;
	}
	   
	/**
	 * 属性start_date的Setter方法.属性名：培训日期
	 * 创建日期:2019-3-14
	 * @param newStart_date java.lang.String
	 */
	public void setStart_date (java.lang.String newStart_date ) {
	 	this.start_date = newStart_date;
	} 	 
	
	/**
	 * 属性 place的Getter方法.属性名：地点
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getPlace () {
		return place;
	}
	   
	/**
	 * 属性place的Setter方法.属性名：地点
	 * 创建日期:2019-3-14
	 * @param newPlace java.lang.String
	 */
	public void setPlace (java.lang.String newPlace ) {
	 	this.place = newPlace;
	} 	 
	
	/**
	 * 属性 course的Getter方法.属性名：课程
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getCourse () {
		return course;
	}
	   
	/**
	 * 属性course的Setter方法.属性名：课程
	 * 创建日期:2019-3-14
	 * @param newCourse java.lang.String
	 */
	public void setCourse (java.lang.String newCourse ) {
	 	this.course = newCourse;
	} 	 
	
	/**
	 * 属性 trainingstudents的Getter方法.属性名：学生
	 *  创建日期:2019-3-14
	 * @return java.util.List<com.yonyou.iuap.trainingstudents.entity.TrainingStudentsEntity>
	 */
	public java.util.List<com.yonyou.iuap.trainingstudents.entity.TrainingStudentsEntity> getTrainingstudents () {
		return trainingstudents;
	}
	   
	/**
	 * 属性trainingstudents的Setter方法.属性名：学生
	 * 创建日期:2019-3-14
	 * @param newTrainingstudents java.util.List<com.yonyou.iuap.trainingstudents.entity.TrainingStudentsEntity>
	 */
	public void setTrainingstudents (java.util.List<com.yonyou.iuap.trainingstudents.entity.TrainingStudentsEntity> newTrainingstudents ) {
	 	this.trainingstudents = newTrainingstudents;
	} 	 
	
	/**
	 * 属性 trainingteachers的Getter方法.属性名：老师
	 *  创建日期:2019-3-14
	 * @return java.util.List<com.yonyou.iuap.trainingteachers.entity.TrainingTeachersEntity>
	 */
	public java.util.List<com.yonyou.iuap.trainingteachers.entity.TrainingTeachersEntity> getTrainingteachers () {
		return trainingteachers;
	}
	   
	/**
	 * 属性trainingteachers的Setter方法.属性名：老师
	 * 创建日期:2019-3-14
	 * @param newTrainingteachers java.util.List<com.yonyou.iuap.trainingteachers.entity.TrainingTeachersEntity>
	 */
	public void setTrainingteachers (java.util.List<com.yonyou.iuap.trainingteachers.entity.TrainingTeachersEntity> newTrainingteachers ) {
	 	this.trainingteachers = newTrainingteachers;
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
        return "TrainingEntity";
    }

    @Override
    public String getNamespace() {
        return "TrainMgt-public";
    }
}