/**
 * Copyright &copy; 2015-2020 <a href="http://www.xxx.com/">TBM</a> All rights reserved.
 */
package com.lelai.sales.domain.modules;


import java.util.Date;

/**
 * 文件管理Entity
 * @author zw
 * @version 2018-04-21
 */
public class TXfile {
	
	private Long id;
	private String name;  //文件名
	private String oname;  //文件原名
	private String path;    //路径
	private int size;      //文件大小
	private String contentType;
	private String type;    //后缀名
	private int isImage;  //是否是图片：0-不是；1-是
	private Date createDate;   //创建日期
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public int getIsImage() {
		return isImage;
	}
	public void setIsImage(int isImage) {
		this.isImage = isImage;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}