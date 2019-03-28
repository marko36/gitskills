package com.lgh.mybatis.beans;

import java.io.Serializable;

public class UserBean implements Serializable{
	private static final long serialVersionUID=1L;
	private Integer id;
	private String username;
	private String pwd;
	private Double account;
	
	public UserBean() {
		super();
	}
	public UserBean(String username,String pwd,Double account) {
		this.username=username;
		this.pwd=pwd;
		this.account=account;
	}
	public UserBean(Integer id,String username,String pwd,Double account) {
		this.id=id;
		this.username=username;
		this.pwd=pwd;
		this.account=account;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Double getAccount() {
		return account;
	}
	public void setAccount(Double account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", username=" + username + ", password=" + pwd + ", account=" + account
				+ "]";
	}
	
}
