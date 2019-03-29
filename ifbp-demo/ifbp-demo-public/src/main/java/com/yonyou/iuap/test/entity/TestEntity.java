package com.yonyou.iuap.test.entity;

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
@Entity(namespace = "TrainMgt-public",name = "TestEntity")
@Table(name = "Train_Test")
public class TestEntity extends BaseEntity{
	
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "id")
    private java.lang.String id;
      
    @Column(name = "content")
    private java.lang.String content;
      
    @Column(name = "training")
    private java.lang.String training;
      
    @Column(name = "test_time")
    private java.util.Date test_time;
      
    @Column(name = "testtype")
    private java.lang.String testtype;
      
    @Column(name = "dr")
    private java.lang.Integer dr = 0;
      
    @Column(name = "ts")
    private java.util.Date ts;
        
	
    @OneToMany(targetEntity = com.yonyou.iuap.achievement.entity.AchievementEntity.class)
    private java.util.List<com.yonyou.iuap.achievement.entity.AchievementEntity> id_achievemententity;
	

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
	 * 属性 content的Getter方法.属性名：考试内容
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getContent () {
		return content;
	}
	   
	/**
	 * 属性content的Setter方法.属性名：考试内容
	 * 创建日期:2019-3-14
	 * @param newContent java.lang.String
	 */
	public void setContent (java.lang.String newContent ) {
	 	this.content = newContent;
	} 	 
	
	/**
	 * 属性 training的Getter方法.属性名：培训任务
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getTraining () {
		return training;
	}
	   
	/**
	 * 属性training的Setter方法.属性名：培训任务
	 * 创建日期:2019-3-14
	 * @param newTraining java.lang.String
	 */
	public void setTraining (java.lang.String newTraining ) {
	 	this.training = newTraining;
	} 	 
	
	/**
	 * 属性 test_time的Getter方法.属性名：考试时间
	 *  创建日期:2019-3-14
	 * @return java.util.Date
	 */
	public java.util.Date getTest_time () {
		return test_time;
	}
	   
	/**
	 * 属性test_time的Setter方法.属性名：考试时间
	 * 创建日期:2019-3-14
	 * @param newTest_time java.util.Date
	 */
	public void setTest_time (java.util.Date newTest_time ) {
	 	this.test_time = newTest_time;
	} 	 
	
	/**
	 * 属性 testtype的Getter方法.属性名：成绩类别
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getTesttype () {
		return testtype;
	}
	   
	/**
	 * 属性testtype的Setter方法.属性名：成绩类别
	 * 创建日期:2019-3-14
	 * @param newTesttype java.lang.String
	 */
	public void setTesttype (java.lang.String newTesttype ) {
	 	this.testtype = newTesttype;
	} 	 
	
	/**
	 * 属性 id_achievemententity的Getter方法.属性名：id_AchievementEntity
	 *  创建日期:2019-3-14
	 * @return java.util.List<com.yonyou.iuap.achievement.entity.AchievementEntity>
	 */
	public java.util.List<com.yonyou.iuap.achievement.entity.AchievementEntity> getId_achievemententity () {
		return id_achievemententity;
	}
	   
	/**
	 * 属性id_achievemententity的Setter方法.属性名：id_AchievementEntity
	 * 创建日期:2019-3-14
	 * @param newId_achievemententity java.util.List<com.yonyou.iuap.achievement.entity.AchievementEntity>
	 */
	public void setId_achievemententity (java.util.List<com.yonyou.iuap.achievement.entity.AchievementEntity> newId_achievemententity ) {
	 	this.id_achievemententity = newId_achievemententity;
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
        return "TestEntity";
    }

    @Override
    public String getNamespace() {
        return "TrainMgt-public";
    }
}