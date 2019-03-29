package com.yonyou.iuap.achievement.entity;

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
@Entity(namespace = "TrainMgt-public",name = "AchievementEntity")
@Table(name = "Train_Achievement")
public class AchievementEntity extends BaseEntity{
	 
    @FK(name = "fk_id_achievemententity", referenceTableName = "Train_Test", referencedColumnName = "id") 
    @Column(name = "fk_id_achievemententity")
    private java.lang.String fk_id_achievemententity;
    
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "id")
    private java.lang.String id;
      
    @Column(name = "training")
    private java.lang.String training;
      
    @Column(name = "student")
    private java.lang.String student;
      
    @Column(name = "grade")
    private java.lang.Double grade;
      
    @Column(name = "dr")
    private java.lang.Integer dr = 0;
      
    @Column(name = "ts")
    private java.util.Date ts;
        
	
	

	/**
	 * 属性 fk_id_achievemententity的Getter方法.属性名：parentPK
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getFk_id_achievemententity () {
		return fk_id_achievemententity;
	}
	   
	/**
	 * 属性fk_id_achievemententity的Setter方法.属性名：parentPK
	 * 创建日期:2019-3-14
	 * @param newFk_id_achievemententity java.lang.String
	 */
	public void setFk_id_achievemententity (java.lang.String newFk_id_achievemententity ) {
	 	this.fk_id_achievemententity = newFk_id_achievemententity;
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
	 * 属性 training的Getter方法.属性名：培训活动
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getTraining () {
		return training;
	}
	   
	/**
	 * 属性training的Setter方法.属性名：培训活动
	 * 创建日期:2019-3-14
	 * @param newTraining java.lang.String
	 */
	public void setTraining (java.lang.String newTraining ) {
	 	this.training = newTraining;
	} 	 
	
	/**
	 * 属性 student的Getter方法.属性名：学生
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getStudent () {
		return student;
	}
	   
	/**
	 * 属性student的Setter方法.属性名：学生
	 * 创建日期:2019-3-14
	 * @param newStudent java.lang.String
	 */
	public void setStudent (java.lang.String newStudent ) {
	 	this.student = newStudent;
	} 	 
	
	/**
	 * 属性 grade的Getter方法.属性名：分数
	 *  创建日期:2019-3-14
	 * @return java.lang.Double
	 */
	public java.lang.Double getGrade () {
		return grade;
	}
	   
	/**
	 * 属性grade的Setter方法.属性名：分数
	 * 创建日期:2019-3-14
	 * @param newGrade java.lang.Double
	 */
	public void setGrade (java.lang.Double newGrade ) {
	 	this.grade = newGrade;
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
        return "AchievementEntity";
    }

    @Override
    public String getNamespace() {
        return "TrainMgt-public";
    }
}