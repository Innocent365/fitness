package com.lelai.sales.domain.cases;

/**
 * @author hw
 * @version on 2018/11/30
 */
public class TStrength {

    private String part;
    private String muscle;

    private Integer beginWeight;
    private Integer beginWeightNum;
    private Integer beginWeightGroupNum;
    private String beginWeightTip;

    private Integer maxWeight;
    private Integer maxWeightNum;
    private Integer maxWeightGroupNum;
    private String maxWeightTip;



    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getMuscle() {
        return muscle;
    }

    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }

    public Integer getBeginWeight() {
        return beginWeight;
    }

    public void setBeginWeight(Integer beginWeight) {
        this.beginWeight = beginWeight;
    }

    public String getBeginWeightTip() {
        return beginWeightTip;
    }

    public void setBeginWeightTip(String beginWeightTip) {
        this.beginWeightTip = beginWeightTip;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }


    public String getMaxWeightTip() {
        return maxWeightTip;
    }

    public void setMaxWeightTip(String maxWeightTip) {
        this.maxWeightTip = maxWeightTip;
    }

    public Integer getBeginWeightNum() {
        return beginWeightNum;
    }

    public void setBeginWeightNum(Integer beginWeightNum) {
        this.beginWeightNum = beginWeightNum;
    }

    public Integer getBeginWeightGroupNum() {
        return beginWeightGroupNum;
    }

    public void setBeginWeightGroupNum(Integer beginWeightGroupNum) {
        this.beginWeightGroupNum = beginWeightGroupNum;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public Integer getMaxWeightNum() {
        return maxWeightNum;
    }

    public void setMaxWeightNum(Integer maxWeightNum) {
        this.maxWeightNum = maxWeightNum;
    }

    public Integer getMaxWeightGroupNum() {
        return maxWeightGroupNum;
    }

    public void setMaxWeightGroupNum(Integer maxWeightGroupNum) {
        this.maxWeightGroupNum = maxWeightGroupNum;
    }
}
