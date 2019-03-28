package com.lgh.mybatis.mapper;

import com.lgh.mybatis.beans.StudentBean;

public interface StudentMapper {
	public StudentBean findStuById(int id)throws Exception;
	
	public StudentBean findStuAndCou(int id)throws Exception;
}
