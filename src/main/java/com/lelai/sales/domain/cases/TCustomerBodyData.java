package com.lelai.sales.domain.cases;


import java.util.Date;

/**
 * 会员身体数据Entity
 * @author zw
 * @version 2018-05-19
 */
public class TCustomerBodyData {
	
	private Long userId;		// 用户id
	private Double height;		// 身高
	private Double weight;		// 体重

	private Double bodyMoisture;	//身体总水分
	private Double visceralFatGrade;		// 内脏脂肪等级

	private Double bodyFat;		//体脂
	private Double bodyFatRate;		// 体脂百分比

	private Double skeletalMuscleContent;		// 骨骼肌含量
	private Double chest;		// 胸围
	private Double waistline;		// 腰围
	private Double hipline;		// 臀围
	private Double leftThigh;		// 左大腿围
	private Double leftLeg;		// 左小腿围
	private Double leftArm;		// 左上臂
	private Double rightThigh;		// 右大腿围
	private Double rightLeg;		// 右小腿围
	private Double rightArm;		// 右上臂围
	private Date recordTime;		// 记录时间
	private Double salt;		// 无机盐
	private Double protein;		// 蛋白质
	private Double visceralFat;		// 内脏脂肪
	private Double bmi;		// BMI(数值)
	private Double skeletalMuscle;		// 骨骼肌
	private Double bodyMassParameters;		// 身体质量参数（数值）
	private Double waistToHipFat;		// 腰臀脂肪比率(%)
	private Double basalMetabolicRate;		// 基础代谢率

	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getBodyFatRate() {
		return bodyFatRate;
	}
	public void setBodyFatRate(Double bodyFatRate) {
		this.bodyFatRate = bodyFatRate;
	}
	public Double getSkeletalMuscleContent() {
		return skeletalMuscleContent;
	}
	public void setSkeletalMuscleContent(Double skeletalMuscleContent) {
		this.skeletalMuscleContent = skeletalMuscleContent;
	}
	public Double getChest() {
		return chest;
	}
	public void setChest(Double chest) {
		this.chest = chest;
	}
	public Double getWaistline() {
		return waistline;
	}
	public void setWaistline(Double waistline) {
		this.waistline = waistline;
	}
	public Double getHipline() {
		return hipline;
	}
	public void setHipline(Double hipline) {
		this.hipline = hipline;
	}
	public Double getLeftThigh() {
		return leftThigh;
	}
	public void setLeftThigh(Double leftThigh) {
		this.leftThigh = leftThigh;
	}
	public Double getLeftLeg() {
		return leftLeg;
	}
	public void setLeftLeg(Double leftLeg) {
		this.leftLeg = leftLeg;
	}
	public Double getLeftArm() {
		return leftArm;
	}
	public void setLeftArm(Double leftArm) {
		this.leftArm = leftArm;
	}
	public Double getRightThigh() {
		return rightThigh;
	}
	public void setRightThigh(Double rightThigh) {
		this.rightThigh = rightThigh;
	}
	public Double getRightLeg() {
		return rightLeg;
	}
	public void setRightLeg(Double rightLeg) {
		this.rightLeg = rightLeg;
	}
	public Double getRightArm() {
		return rightArm;
	}
	public void setRightArm(Double rightArm) {
		this.rightArm = rightArm;
	}
	public Date getRecordTime() {
		return recordTime;
	}
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}
	public Double getSalt() {
		return salt;
	}
	public void setSalt(Double salt) {
		this.salt = salt;
	}
	public Double getProtein() {
		return protein;
	}
	public void setProtein(Double protein) {
		this.protein = protein;
	}
	public Double getVisceralFat() {
		return visceralFat;
	}
	public void setVisceralFat(Double visceralFat) {
		this.visceralFat = visceralFat;
	}
	public Double getBmi() {
		return bmi;
	}
	public void setBmi(Double bmi) {
		this.bmi = bmi;
	}
	public Double getSkeletalMuscle() {
		return skeletalMuscle;
	}
	public void setSkeletalMuscle(Double skeletalMuscle) {
		this.skeletalMuscle = skeletalMuscle;
	}
	public Double getBodyMassParameters() {
		return bodyMassParameters;
	}
	public void setBodyMassParameters(Double bodyMassParameters) {
		this.bodyMassParameters = bodyMassParameters;
	}
	public Double getWaistToHipFat() {
		return waistToHipFat;
	}
	public void setWaistToHipFat(Double waistToHipFat) {
		this.waistToHipFat = waistToHipFat;
	}
	public Double getBasalMetabolicRate() {
		return basalMetabolicRate;
	}
	public void setBasalMetabolicRate(Double basalMetabolicRate) {
		this.basalMetabolicRate = basalMetabolicRate;
	}

	public Double getBodyMoisture() {
		return bodyMoisture;
	}

	public void setBodyMoisture(Double bodyMoisture) {
		this.bodyMoisture = bodyMoisture;
	}

	public Double getVisceralFatGrade() {
		return visceralFatGrade;
	}

	public void setVisceralFatGrade(Double visceralFatGrade) {
		this.visceralFatGrade = visceralFatGrade;
	}

	public Double getBodyFat() {
		return bodyFat;
	}

	public void setBodyFat(Double bodyFat) {
		this.bodyFat = bodyFat;
	}
}