package com.yonyou.iuap.trainingstudents.entity;

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
@Entity(namespace = "TrainMgt-public",name = "TrainingStudentsEntity")
@Table(name = "Train_TrainingStudents")
public class TrainingStudentsEntity extends BaseEntity{
	 
    @FK(name = "trainingstudents", referenceTableName = "Train_Training", referencedColumnName = "id") 
    @Column(name = "trainingstudents")
    private java.lang.String trainingstudents;
    
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "id")
    private java.lang.String id;
      
    @Column(name = "student")
    private java.lang.String student;
      
    @Column(name = "dr")
    private java.lang.Integer dr = 0;
      
    @Column(name = "ts")
    private java.util.Date ts;
        
	
	

	/**
	 * 属性 trainingstudents的Getter方法.属性名：parentPK
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getTrainingstudents () {
		return trainingstudents;
	}
	   
	/**
	 * 属性trainingstudents的Setter方法.属性名：parentPK
	 * 创建日期:2019-3-14
	 * @param newTrainingstudents java.lang.String
	 */
	public void setTrainingstudents (java.lang.String newTrainingstudents ) {
	 	this.trainingstudents = newTrainingstudents;
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
	 * 属性 student的Getter方法.属性名：参训学生
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getStudent () {
		return student;
	}
	   
	/**
	 * 属性student的Setter方法.属性名：参训学生
	 * 创建日期:2019-3-14
	 * @param newStudent java.lang.String
	 */
	public void setStudent (java.lang.String newStudent ) {
	 	this.student = newStudent;
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
        return "TrainingStudentsEntity";
    }

    @Override
    public String getNamespace() {
        return "TrainMgt-public";
    }
}