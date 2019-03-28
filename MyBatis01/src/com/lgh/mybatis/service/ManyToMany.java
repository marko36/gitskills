package com.lgh.mybatis.service;

import org.apache.ibatis.session.SqlSession;

import com.lgh.mybatis.beans.CourseBean;
import com.lgh.mybatis.beans.StudentBean;
import com.lgh.mybatis.mapper.CoursesMapper;
import com.lgh.mybatis.mapper.StudentMapper;
import com.lgh.mybatis.tools.DBTools;

public class ManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findStudentByCourses();
		findCoursesByStudent();
	}
	
	public static void findCoursesByStudent() {
		SqlSession session = DBTools.getSession();
		StudentMapper sm = session.getMapper(StudentMapper.class);
		try {
			StudentBean sb = sm.findStuAndCou(1);
			System.out.println(sb);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}
		
	}
	
	public static void findStudentByCourses() {
		SqlSession session = DBTools.getSession();
		CoursesMapper cm = session.getMapper(CoursesMapper.class);
		try {
			CourseBean cb = cm.findCouAndStu(2);
			System.out.println(cb);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}
	}

}
