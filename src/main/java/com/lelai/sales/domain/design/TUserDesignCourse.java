package com.lelai.sales.domain.design;


import java.util.Date;
import java.util.List;


/**
 * @author hw
 * @version on 2018/9/25
 */
public class TUserDesignCourse  {

    private Long id;

    private Long tUserDesignId;		// 关联主表Id

    private String code;		// 课程编码，保留字段
    private String period;		// 阶段，1-9，a,b,c,d,e分别代表 day1-day9, day10-day14
    private String content;		// 课程名

    private Integer price;		//价格, 整数足矣
    private String remarks;		// 备注，保留字段
    private Date createTime;		// create_time
    private String createBy;		// create_time
    private Date updateTime;		// update_time
    private String updateBy;		// update_time

    private List<TDesignCourseDetail> designCourseDetails;

    public TUserDesignCourse() {
    }

    public TUserDesignCourse(TDesignCourse tDesignCourse){
        this.code = tDesignCourse.getCode();
        this.period = tDesignCourse.getPeriod();
        this.content = tDesignCourse.getContent();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long gettUserDesignId() {
        return tUserDesignId;
    }

    public void settUserDesignId(Long tUserDesignId) {
        this.tUserDesignId = tUserDesignId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public List<TDesignCourseDetail> getDesignCourseDetails() {
        return designCourseDetails;
    }

    public void setDesignCourseDetails(List<TDesignCourseDetail> designCourseDetails) {
        this.designCourseDetails = designCourseDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            throw new RuntimeException("传入比较类型错误！");
        }

        TUserDesignCourse course = (TUserDesignCourse) o;

        return id != null ? id.equals(course.id) : course.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
