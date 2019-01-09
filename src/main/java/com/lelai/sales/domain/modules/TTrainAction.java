package com.lelai.sales.domain.modules;


import java.util.Date;

import static com.lelai.sales.common.UserUtils.tryParseInteger;

/**
 * 训练内容配置Entity
 * @author fsj
 * @version 2018-05-16
 */
public class TTrainAction {
	
	private String actionId;		// 动作表id
	private String body;            //身体部分
	private String bodydetail;		// 身体部位详情
	private String actionname;		// 训练动作名称
	private String actionCode;		// 动作编号
	private String remark;		// 备注
	private String planId;		// 计划id
	private String planintensity;		// 计划训练强度
	private String plannum;		// 计划训练组数
	private Date plantimes;		// 计划用时
	private String actualintenity;		// 实际训练强度
	private String actualnum;		// 实际训练组数
	private Date actualtime;		// 实际消耗时间
	private int updateFlag;     //是否修改

	private int weight;	//处理的强度
	private int weightNum;	//处理的强度个数

	public String getActionId() {
		return actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getBodydetail() {
		return bodydetail;
	}

	public void setBodydetail(String bodydetail) {
		this.bodydetail = bodydetail;
	}

	public String getActionname() {
		return actionname;
	}

	public void setActionname(String actionname) {
		this.actionname = actionname;
	}

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPlanintensity() {
		return planintensity;
	}

	public void setPlanintensity(String planintensity) {
		this.planintensity = planintensity;
	}

	public String getPlannum() {
		return plannum;
	}

	public void setPlannum(String plannum) {
		this.plannum = plannum;
	}

	public Date getPlantimes() {
		return plantimes;
	}

	public void setPlantimes(Date plantimes) {
		this.plantimes = plantimes;
	}

	public String getActualintenity() {
		return actualintenity;
	}

	public void setActualintenity(String actualintenity) {
		this.actualintenity = actualintenity;
	}

	public String getActualnum() {
		return actualnum;
	}

	public void setActualnum(String actualnum) {
		this.actualnum = actualnum;
	}

	public Date getActualtime() {
		return actualtime;
	}

	public void setActualtime(Date actualtime) {
		this.actualtime = actualtime;
	}

	public int getUpdateFlag() {
		return updateFlag;
	}

	public void setUpdateFlag(int updateFlag) {
		this.updateFlag = updateFlag;
	}

	public int getWeight() {
		return tryParseInteger(this.planintensity.replaceAll("kg","").split("/")[0]);
	}

	public int getWeightNum() {
		String array []= this.planintensity.replaceAll("kg","").split("/");
		if(array.length>1) return tryParseInteger(array[1]);
		return 0;
	}
}