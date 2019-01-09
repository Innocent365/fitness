package com.lelai.sales.domain.design;


import java.util.Date;

/**
 * salesEntity
 * @author sales
 * @version 2018-12-11
 */
public class TDesignCourseDetail {

	private String id;
	private String tDesignCourseId;		// 关联主表t_design_course表Id
	private String body;		// 部位
	private String muscle;		// 肌肉
	private String movement;		// 动作
	private String groupNum;		// 组数
	private String intensity;		// 强度-类型
	private String intensityNum;		// 强度-数量
	private String intensityUnit;		// 强度-单位
	private Date createTime;		// create_time
	private Date updateTime;		// update_time

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String gettDesignCourseId() {
		return tDesignCourseId;
	}

	public void settDesignCourseId(String tDesignCourseId) {
		this.tDesignCourseId = tDesignCourseId;
	}

	public String getTDesignCourseId() {
		return tDesignCourseId;
	}

	public void setTDesignCourseId(String tDesignCourseId) {
		this.tDesignCourseId = tDesignCourseId;
	}
	
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public String getMuscle() {
		return muscle;
	}

	public void setMuscle(String muscle) {
		this.muscle = muscle;
	}
	
	public String getMovement() {
		return movement;
	}

	public void setMovement(String movement) {
		this.movement = movement;
	}
	
	public String getGroupNum() {
		return groupNum;
	}

	public void setGroupNum(String groupNum) {
		this.groupNum = groupNum;
	}
	
	public String getIntensity() {
		return intensity;
	}

	public void setIntensity(String intensity) {
		this.intensity = intensity;
	}
	
	public String getIntensityNum() {
		return intensityNum;
	}

	public void setIntensityNum(String intensityNum) {
		this.intensityNum = intensityNum;
	}
	
	public String getIntensityUnit() {
		return intensityUnit;
	}

	public void setIntensityUnit(String intensityUnit) {
		this.intensityUnit = intensityUnit;
	}
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}