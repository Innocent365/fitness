package com.lelai.sales.domain.design;


import java.util.Date;

/**
 * @author hw
 * @version on 2018/9/25
 */
public class TUserDesign {

    private Long id;      //计划Id
    private Integer orderNum;   //序号

    private String userName;    //客户
    private String userJob;         //职业
    private Integer userAge;        //年龄
    private Integer userGender;        //性别
    private String userTelephone;        //手机号

    private String desired;     //健身需求
    private String levelAt;    //所处级别

    private String remarks;      //备注

    private Date createTime;		// create_time
    private String createBy;		// create_time
    private Date updateTime;		// update_time
    private String updateBy;		// update_time

    private String designer;
    private String designTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserJob() {
        return userJob;
    }

    public void setUserJob(String userJob) {
        this.userJob = userJob;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public String getDesired() {
        return desired;
    }

    public void setDesired(String desired) {
        this.desired = desired;
    }

    public String getLevelAt() {
        return levelAt;
    }

    public void setLevelAt(String levelAt) {
        this.levelAt = levelAt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getDesignTime() {
        return designTime;
    }

    public void setDesignTime(String designTime) {
        this.designTime = designTime;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }
}
