package com.lgh.mybatis.beans;

import java.io.Serializable;

public class WifeBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private HusbandBean husband;
	
	public WifeBean() {
		super();
	}
	
	public WifeBean(Integer id,String name,HusbandBean Husband, HusbandBean husband) {
		super();
		this.id=id;
		this.name=name;
		this.husband=husband;
	}
	
	
	
	@Override
	public String toString() {
		return "WifeBean [id=" + id + ", name=" + name + ", husband=" + husband + "]";
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HusbandBean getHusband() {
		return husband;
	}
	public void setHusband(HusbandBean husband) {
		this.husband = husband;
	}
	
	

}
