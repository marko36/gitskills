package com.lgh.mybatis.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lgh.mybatis.beans.KeyBean;
import com.lgh.mybatis.beans.LockBean;
import com.lgh.mybatis.mapper.KeyMapper;
import com.lgh.mybatis.mapper.LockMapper;
import com.lgh.mybatis.tools.DBTools;

public class OneToManyService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findLockAndKeys();
//		saveLock();
//		batchSaveKeys();
	}
	
	private static void findLockAndKeys() {
		SqlSession session = DBTools.getSession();
		LockMapper lm = session.getMapper(LockMapper.class);
		LockBean lock = lm.findLockAndKeys(1);
		System.out.println(lock);
		
	}
	
	public static void batchSaveKeys() {
		SqlSession session = DBTools.getSession();
		LockMapper lm = session.getMapper(LockMapper.class);
		KeyMapper km = session.getMapper(KeyMapper.class);
		LockBean lock = lm.findLockAndKeys(1);
		List<KeyBean> keys = new ArrayList<KeyBean>();
		for(int i=0;i<5;i++) {
			KeyBean key = new KeyBean(null,"钥匙"+i,lock);
			keys.add(key);
		}
		km.batchSaveKeys(keys);
		session.commit();
		
	}
	
	public static void saveLock() {
		SqlSession session = DBTools.getSession();
		LockMapper lm = session.getMapper(LockMapper.class);
		LockBean lock = new LockBean(null,"锁1",null);
		lm.saveLock(lock);
		session.commit();
	}
	

}
