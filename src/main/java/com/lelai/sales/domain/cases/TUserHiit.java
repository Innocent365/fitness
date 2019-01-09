package com.lelai.sales.domain.cases;

import java.util.Date;
import java.util.List;

/**
 * salesEntity
 * @author sales
 * @version 2018-12-01
 */
public class TUserHiit   {
	
	private Long id;
	private Long userId;		// t_user表的Id
	private String feeling;		// 客户测试感受
	private Date recordDate;	// 测试时间
	private String remarks;		// 备注

	private List<TUserHiitDetail> details;	//测试内容

	private String content = "";			// 测试内容
	private Integer minutes = 0;		// 总时长（单位分钟）
	private Integer intervals = 0;		// 组间歇时常（单位秒）
	private Integer groupNum =0;		// 测试组数（个）


	private Date updateTime;		// update_time
	private String updateBy;		// update_by
	private Date createTime;		// create_time
	private String createBy;		// create_by


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public Integer getIntervals() {
		return intervals;
	}


	public Integer getGroupNum() {
		return groupNum;
	}


	public String getFeeling() {
		return feeling;
	}

	public void setFeeling(String feeling) {
		this.feeling = feeling;
	}

	public Date getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public List<TUserHiitDetail> getDetails() {
		return details;
	}

	public void setDetails(List<TUserHiitDetail> details) {
		if(details.size()>0){
			details.stream().forEach(p-> {
				this.content += p.getContent() + "、";
				this.minutes += p.getDuration();
				this.intervals += p.getIntervals();
				this.groupNum += p.getGroupNum();
			});
		}
		this.details = details;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
}