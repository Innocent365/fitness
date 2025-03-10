package com.lelai.sales.domain.modules;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * 字典Entity
 * @author TBM
 * @version 2013-05-15
 */
public class Dict {

	private String id;
	private String value;	// 数据值
	private String label;	// 标签名
	private String type;	// 类型
	private String description;// 描述
	private Integer sort;	// 排序
	private String parentId;//父Id

	private List<Dict> children;

	public Dict() {
		super();
	}
	

	public Dict(String value, String label){
		this.value = value;
		this.label = label;
	}
	
	@XmlAttribute
	@Length(min=1, max=100)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@XmlAttribute
	@Length(min=1, max=100)
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Length(min=1, max=100)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@XmlAttribute
	@Length(min=0, max=100)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@NotNull
	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	@Length(min=1, max=100)
	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	@Override
	public String toString() {
		return label;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Dict> getChildren() {
		return children;
	}

	public void setChildren(List<Dict> children) {
		this.children = children;
	}
}