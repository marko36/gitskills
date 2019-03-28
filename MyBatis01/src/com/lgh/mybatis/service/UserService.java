package com.lgh.mybatis.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lgh.mybatis.beans.UserBean;
import com.lgh.mybatis.mapper.UserMapper;
import com.lgh.mybatis.tools.DBTools;

public class UserService {
	public static void main(String[] args) {
//		insertUser();
//		selectUserById();
//		deleteUser();
		selectAllUser();
	}
	
	private static void insertUser() {
		SqlSession session=DBTools.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		UserBean user = new UserBean("懿1", "1314520", 7000.0);
		try {
			mapper.insertUser(user);
			System.out.println(user.toString());
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}
		
	}
	
	public static void selectUserById() {
		SqlSession session = DBTools.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		try {
			UserBean user = mapper.selectUserById(1);
			System.out.println(user.toString());
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}
	}
	
	public static void selectAllUser() {
		SqlSession session = DBTools.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		try {
			List<UserBean> users = mapper.selectAllUser();
			System.out.println(users);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}
	}
	
	public static void deleteUser() {
		SqlSession session = DBTools.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		try {
			mapper.deleteUser(1);
			System.out.println("ok");
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}
	}
}
