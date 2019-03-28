package com.lgh.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.lgh.mybatis.beans.LockBean;

public interface LockMapper {
	public int saveLock(@Param("lock")LockBean lock);
	
	public LockBean findLockById(int id);
	
	public LockBean findLockAndKeys(int id);
}
