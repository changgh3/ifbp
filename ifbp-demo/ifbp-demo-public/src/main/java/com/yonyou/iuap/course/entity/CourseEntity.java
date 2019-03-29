package com.yonyou.iuap.course.entity;

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
@Entity(namespace = "TrainMgt-public",name = "CourseEntity")
@Table(name = "Train_Course")
public class CourseEntity extends BaseEntity{
	
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "id")
    private java.lang.String id;
      
    @Column(name = "stage")
    private java.lang.String stage;
      
    @Column(name = "duration")
    private java.lang.String duration;
    
    @Column(name = "djzt")
    private java.lang.String djzt;
      
    @Column(name = "title")
    private java.lang.String title;
      
    @Column(name = "goal")
    private java.lang.String goal;
      
    @Column(name = "key_point")
    private java.lang.String key_point;
      
    @Column(name = "manner")
    private java.lang.String manner;
      
    @Column(name = "teacher")
    private java.lang.String teacher;
      
    @Column(name = "assistant")
    private java.lang.String assistant;
      
    @Column(name = "start_time")
    private java.util.Date start_time;
      
    @Column(name = "end_time")
    private java.util.Date end_time;
      
    @Column(name = "low_limit")
    private java.lang.Integer low_limit;
      
    @Column(name = "low_fee")
    private java.math.BigDecimal low_fee;
      
    @Column(name = "cert")
    private java.lang.Boolean cert;
      
    @Column(name = "dr")
    private java.lang.Integer dr = 0;
      
    @Column(name = "ts")
    private java.util.Date ts;
        
	
    @OneToMany(targetEntity = com.yonyou.iuap.courseitem.entity.CourseItemEntity.class)
    private java.util.List<com.yonyou.iuap.courseitem.entity.CourseItemEntity> course;
	

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
	 * 属性 stage的Getter方法.属性名：面向阶段
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getStage () {
		return stage;
	}
	   
	/**
	 * 属性stage的Setter方法.属性名：面向阶段
	 * 创建日期:2019-3-14
	 * @param newStage java.lang.String
	 */
	public void setStage (java.lang.String newStage ) {
	 	this.stage = newStage;
	} 	 
	
	/**
	 * 属性 duration的Getter方法.属性名：时长
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getDuration () {
		return duration;
	}
	   
	/**
	 * 属性duration的Setter方法.属性名：时长
	 * 创建日期:2019-3-14
	 * @param newDuration java.lang.String
	 */
	public void setDuration (java.lang.String newDuration ) {
	 	this.duration = newDuration;
	} 	 
	
	/**
	 * 属性 title的Getter方法.属性名：课程标题
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getTitle () {
		return title;
	}
	   
	/**
	 * 属性title的Setter方法.属性名：课程标题
	 * 创建日期:2019-3-14
	 * @param newTitle java.lang.String
	 */
	public void setTitle (java.lang.String newTitle ) {
	 	this.title = newTitle;
	} 	 
	
	/**
	 * 属性 goal的Getter方法.属性名：达到目标
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getGoal () {
		return goal;
	}
	   
	/**
	 * 属性goal的Setter方法.属性名：达到目标
	 * 创建日期:2019-3-14
	 * @param newGoal java.lang.String
	 */
	public void setGoal (java.lang.String newGoal ) {
	 	this.goal = newGoal;
	} 	 
	
	/**
	 * 属性 key_point的Getter方法.属性名：重点
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getKey_point () {
		return key_point;
	}
	   
	/**
	 * 属性key_point的Setter方法.属性名：重点
	 * 创建日期:2019-3-14
	 * @param newKey_point java.lang.String
	 */
	public void setKey_point (java.lang.String newKey_point ) {
	 	this.key_point = newKey_point;
	} 	 
	
	/**
	 * 属性 manner的Getter方法.属性名：形式
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getManner () {
		return manner;
	}
	   
	/**
	 * 属性manner的Setter方法.属性名：形式
	 * 创建日期:2019-3-14
	 * @param newManner java.lang.String
	 */
	public void setManner (java.lang.String newManner ) {
	 	this.manner = newManner;
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
	 * 属性 assistant的Getter方法.属性名：助教
	 *  创建日期:2019-3-14
	 * @return java.lang.String
	 */
	public java.lang.String getAssistant () {
		return assistant;
	}
	   
	/**
	 * 属性assistant的Setter方法.属性名：助教
	 * 创建日期:2019-3-14
	 * @param newAssistant java.lang.String
	 */
	public void setAssistant (java.lang.String newAssistant ) {
	 	this.assistant = newAssistant;
	} 	 
	
	/**
	 * 属性 start_time的Getter方法.属性名：开始时间
	 *  创建日期:2019-3-14
	 * @return java.util.Date
	 */
	public java.util.Date getStart_time () {
		return start_time;
	}
	   
	/**
	 * 属性start_time的Setter方法.属性名：开始时间
	 * 创建日期:2019-3-14
	 * @param newStart_time java.util.Date
	 */
	public void setStart_time (java.util.Date newStart_time ) {
	 	this.start_time = newStart_time;
	} 	 
	
	/**
	 * 属性 end_time的Getter方法.属性名：结束时间
	 *  创建日期:2019-3-14
	 * @return java.util.Date
	 */
	public java.util.Date getEnd_time () {
		return end_time;
	}
	   
	/**
	 * 属性end_time的Setter方法.属性名：结束时间
	 * 创建日期:2019-3-14
	 * @param newEnd_time java.util.Date
	 */
	public void setEnd_time (java.util.Date newEnd_time ) {
	 	this.end_time = newEnd_time;
	} 	 
	
	/**
	 * 属性 low_limit的Getter方法.属性名：最低成班人数
	 *  创建日期:2019-3-14
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getLow_limit () {
		return low_limit;
	}
	   
	/**
	 * 属性low_limit的Setter方法.属性名：最低成班人数
	 * 创建日期:2019-3-14
	 * @param newLow_limit java.lang.Integer
	 */
	public void setLow_limit (java.lang.Integer newLow_limit ) {
	 	this.low_limit = newLow_limit;
	} 	 
	
	/**
	 * 属性 low_fee的Getter方法.属性名：最低费用
	 *  创建日期:2019-3-14
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getLow_fee () {
		return low_fee;
	}
	   
	/**
	 * 属性low_fee的Setter方法.属性名：最低费用
	 * 创建日期:2019-3-14
	 * @param newLow_fee java.math.BigDecimal
	 */
	public void setLow_fee (java.math.BigDecimal newLow_fee ) {
	 	this.low_fee = newLow_fee;
	} 	 
	
	/**
	 * 属性 cert的Getter方法.属性名：是否发证
	 *  创建日期:2019-3-14
	 * @return java.lang.Boolean
	 */
	public java.lang.Boolean getCert () {
		return cert;
	}
	   
	/**
	 * 属性cert的Setter方法.属性名：是否发证
	 * 创建日期:2019-3-14
	 * @param newCert java.lang.Boolean
	 */
	public void setCert (java.lang.Boolean newCert ) {
	 	this.cert = newCert;
	} 	 
	
	/**
	 * 属性 course的Getter方法.属性名：课程
	 *  创建日期:2019-3-14
	 * @return java.util.List<com.yonyou.iuap.courseitem.entity.CourseItemEntity>
	 */
	public java.util.List<com.yonyou.iuap.courseitem.entity.CourseItemEntity> getCourse () {
		return course;
	}
	   
	/**
	 * 属性course的Setter方法.属性名：课程
	 * 创建日期:2019-3-14
	 * @param newCourse java.util.List<com.yonyou.iuap.courseitem.entity.CourseItemEntity>
	 */
	public void setCourse (java.util.List<com.yonyou.iuap.courseitem.entity.CourseItemEntity> newCourse ) {
	 	this.course = newCourse;
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
        return "CourseEntity";
    }

    @Override
    public String getNamespace() {
        return "TrainMgt-public";
    }

	public java.lang.String getDjzt() {
		return djzt;
	}

	public void setDjzt(java.lang.String djzt) {
		this.djzt = djzt;
	}
}