package com.lelai.sales.domain.cases;



import java.util.Date;

/**
 * 客户管理Entity
 * @author zw
 * @version 2018-04-21
 */
public class TUser {
	
	private Long id;
	private String nickName;		// 昵称
	private String loginPassword;	// 登录密码

	private String userNo;		// 会员号
	private Integer gender;		// 性别，1男，2女

	private String helpWay;		// 您选择我们是想通过我们帮助到您：0增肌/1减脂/2增强体质/3其他

	private String realName;    //用户实名
	private String telephone;	// 手机号名
	private String age;			// 年龄
	private Date joinDate;			//加入时间
	private Integer courseCycle;	//周期
	private Integer courseTotal;	//上课节数

	private Long beginningPhoto;	//训练开始照片
	private Long finishedPhoto;		//训练结束时照片
	private int isCase;		//是否是案例，0否，1是

	private String beginningPhotoPath;	//训练开始照片Path
	private String finishedPhotoPath;	//训练结束时照片Path

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Integer getCourseCycle() {
		return courseCycle;
	}

	public void setCourseCycle(Integer courseCycle) {
		this.courseCycle = courseCycle;
	}

	public Integer getCourseTotal() {
		return courseTotal;
	}

	public void setCourseTotal(Integer courseTotal) {
		this.courseTotal = courseTotal;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}


	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}


	public String getHelpWay() {
		return helpWay;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setHelpWay(String helpWay) {
		this.helpWay = helpWay;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Long getBeginningPhoto() {
		return beginningPhoto;
	}

	public void setBeginningPhoto(Long beginningPhoto) {
		this.beginningPhoto = beginningPhoto;
	}

	public Long getFinishedPhoto() {
		return finishedPhoto;
	}

	public void setFinishedPhoto(Long finishedPhoto) {
		this.finishedPhoto = finishedPhoto;
	}

	public String getBeginningPhotoPath() {
		return beginningPhotoPath;
	}

	public void setBeginningPhotoPath(String beginningPhotoPath) {
		this.beginningPhotoPath = beginningPhotoPath;
	}

	public String getFinishedPhotoPath() {
		return finishedPhotoPath;
	}

	public void setFinishedPhotoPath(String finishedPhotoPath) {
		this.finishedPhotoPath = finishedPhotoPath;
	}

	public int getIsCase() {
		return isCase;
	}

	public void setIsCase(int isCase) {
		this.isCase = isCase;
	}
}