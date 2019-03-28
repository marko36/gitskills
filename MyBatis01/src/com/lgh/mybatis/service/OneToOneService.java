package com.lgh.mybatis.service;

import org.apache.ibatis.session.SqlSession;

import com.lgh.mybatis.beans.HusbandBean;
import com.lgh.mybatis.mapper.HusbandMapper;
import com.lgh.mybatis.tools.DBTools;

public class OneToOneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		selectHusbandAndWife();
		selectHusbandById();
	}
	
	public static void selectHusbandAndWife() {
		SqlSession session = DBTools.getSession();
		HusbandMapper mapper = session.getMapper(HusbandMapper.class);
		try {
			HusbandBean husband = mapper.selectHusbandAndWife(2);
			System.out.println(husband);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}
	}
	
	public static void selectHusbandById() {
		SqlSession session = DBTools.getSession();
		HusbandMapper mapper = session.getMapper(HusbandMapper.class);
		try {
			HusbandBean husband = mapper.selectHusbandById(1);
			System.out.println(husband);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}
	}

}
