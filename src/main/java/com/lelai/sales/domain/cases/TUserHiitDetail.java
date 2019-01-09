package com.lelai.sales.domain.cases;

import java.util.Date;

/**
 * @author hw
 * @version on 2018/12/20
 */
public class TUserHiitDetail {

    private Long id;
    private Long tUserHiitId;		// t_user表的Id
    private Integer content;		// 测试内容
    private Integer duration;		// 总时长（单位分钟）
    private Integer intervals;		// 组间歇时常（单位秒）
    private Integer groupNum;		// 测试组数（个）


    private Date updateTime;	// update_time
    private String updateBy;		// update_by
    private Date createTime;	// create_time
    private String createBy;		// create_by

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long gettUserHiitId() {
        return tUserHiitId;
    }

    public void settUserHiitId(Long tUserHiitId) {
        this.tUserHiitId = tUserHiitId;
    }

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getIntervals() {
        return intervals;
    }

    public void setIntervals(Integer intervals) {
        this.intervals = intervals;
    }

    public Integer getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
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
