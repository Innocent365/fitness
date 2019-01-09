package com.lelai.sales.domain.design;

import com.lelai.sales.domain.modules.Dict;

import java.util.Date;
import java.util.List;

/**
 * 课程详情Entity
 * @author hw
 * @version 2018-11-05
 */
public class TUserDesignCourseDetail {


	private Long id;
	private Long tUserDesignCourseId;		// 关联主表t_user_design_course表Id
	private String body;	 		// 部位
	private String muscle;			// 肌肉
	private String movement;		// 动作
	private String groupNum;		// 组数
	private String intensity;		// 强度-类型
	private String intensityNum;	// 强度-数量
	private String intensityUnit;	// 强度-单位
	private Date createTime;		// create_time
	private String createBy;		// create_time
	private Date updateTime;		// update_time
	private String updateBy;		// update_time
	private String remarks;			//备注

	private List<Dict> bodyDict;
	private List<Dict> muscleDict;
	private List<Dict> movementDict;




	public TUserDesignCourseDetail() {
	}

	public TUserDesignCourseDetail(TDesignCourseDetail tDesignCourseDetail) {
		this.body = tDesignCourseDetail.getBody();
		this.muscle = tDesignCourseDetail.getMuscle();
		this.movement = tDesignCourseDetail.getMovement();

		this.intensity = tDesignCourseDetail.getIntensity();
		this.intensityNum = tDesignCourseDetail.getIntensityNum();
		this.intensityUnit = tDesignCourseDetail.getIntensityUnit();

		this.groupNum = tDesignCourseDetail.getGroupNum();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long gettUserDesignCourseId() {
		return tUserDesignCourseId;
	}

	public void settUserDesignCourseId(Long tUserDesignCourseId) {
		this.tUserDesignCourseId = tUserDesignCourseId;
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

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<Dict> getBodyDict() {
		return bodyDict;
	}

	public void setBodyDict(List<Dict> bodyDict) {
		this.bodyDict = bodyDict;
	}

	public List<Dict> getMuscleDict() {
		return muscleDict;
	}

	public void setMuscleDict(List<Dict> muscleDict) {
		this.muscleDict = muscleDict;
	}

	public List<Dict> getMovementDict() {
		return movementDict;
	}

	public void setMovementDict(List<Dict> movementDict) {
		this.movementDict = movementDict;
	}
}