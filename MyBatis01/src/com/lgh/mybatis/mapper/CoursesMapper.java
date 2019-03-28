package com.lgh.mybatis.mapper;

import com.lgh.mybatis.beans.CourseBean;

public interface CoursesMapper {
	public CourseBean findCouById(int id)throws Exception;
	
	public CourseBean findCouAndStu(int id)throws Exception;
}
