package com.lgh.mybatis.beans;

import java.io.Serializable;
import java.util.List;

public class CourseBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private List<StudentBean> students;
	
	public CourseBean() {
		super();
	}
	public CourseBean(Integer id,String name,List<StudentBean> students) {
		super();
		this.id=id;
		this.name=name;
		this.students=students;
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
	public List<StudentBean> getStudents() {
		return students;
	}
	public void setStudents(List<StudentBean> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "CourseBean [id=" + id + ", name=" + name + ", students=" + students + "]";
	}
	
	
}
