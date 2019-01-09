package com.lelai.sales.domain.modules;


import com.lelai.sales.domain.cases.TUserTrainCourse;
import com.lelai.sales.domain.cases.TUserTrainDaily;

/**
 * 课程库管理Entity
 * @author fsj
 * @version 2018-04-14
 */
public class TCourseStoreManage  {

	private Long id;				//课程id
	private String courseName;		// 课程名称
	private String courseNumber;     // 课程编号
	private String content;		// 课程介绍
	private Integer courseStatus;		// 课程状态：0上架/1下架
	private String range;		// 适用人群
	private String remark;		// 注意事项
	private String tab;		// 课程关键字
	private String coachId;		// 教练id
	private String coachName;		// 教练名称
	private String courseType;		// 课程类型code，从t_enum表code一致
	private Integer personCountLimit;		// 人数限制
	private Double coursePrice;		// 课价
	private String courseMethod;		// 上课类型：0团课/1私教
	private Integer score;		// 积分
	private String scoreUseLimit;		//是否可抵扣积分；0是1否
	private Double courseScorePrice;      //积分抵扣金额
	private String tcourseImage;       //课程图片地址

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public Integer getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(Integer courseStatus) {
		this.courseStatus = courseStatus;
	}
	
	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}
	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getTab() {
		return tab;
	}

	public void setTab(String tab) {
		this.tab = tab;
	}
	
	public String getCoachId() {
		return coachId;
	}

	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}
	
	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	
	public Integer getPersonCountLimit() {
		return personCountLimit;
	}

	public void setPersonCountLimit(Integer personCountLimit) {
		this.personCountLimit = personCountLimit;
	}
	
	public Double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(Double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	public String getCourseMethod() {
		return courseMethod;
	}

	public void setCourseMethod(String courseMethod) {
		this.courseMethod = courseMethod;
	}

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }


    public String getScoreUseLimit() {
        return scoreUseLimit;
    }

    public void setScoreUseLimit(String scoreUseLimit) {
        this.scoreUseLimit = scoreUseLimit;
    }

    public String getTcourseImage() {
        return tcourseImage;
    }

    public void setTcourseImage(String tcourseImage) {
        this.tcourseImage = tcourseImage;
    }

    public Double getCourseScorePrice() {
        return courseScorePrice;
    }

    public void setCourseScorePrice(Double courseScorePrice) {
        this.courseScorePrice = courseScorePrice;
    }


    public void injectToTUserTrainCourse(TUserTrainCourse entity){
		entity.setCourseName(this.courseName);
		entity.setContent(this.content);
		entity.setCourseNum(this.courseNumber);
		entity.setCoachId(this.coachId);
		entity.setCoachName(this.coachName);
	}

	public void injectToTUserTrainDaily(TUserTrainDaily entity){
		entity.setCourseName(this.courseName);
		entity.setCoachId(this.coachId);
		entity.setCoachName(this.coachName);
	}
	
}