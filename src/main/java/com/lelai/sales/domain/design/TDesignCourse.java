package com.lelai.sales.domain.design;

import java.util.Date;

/**
 * salesEntity
 * @author sales
 * @version 2018-12-11
 */
public class TDesignCourse {

	private String id;
	private String code;		// 课程编码，保留字段
	private String desired;		// 健身需求：A:塑身，B:体态提升，C:协调
	private String period;		// 阶段，1-9，a,b,c,d,e分别代表 day1-day9, day10-day14

	private String content;		// 课程名
	private Integer price;		//价格, 整数足矣
	private String remarks;		// 备注，保留字段
	private Date createTime;		// create_time
	private Date updateTime;		// update_time

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getDesired() {
		return desired;
	}

	public void setDesired(String desired) {
		this.desired = desired;
	}
	
	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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