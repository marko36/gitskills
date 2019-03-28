package com.lgh.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lgh.mybatis.beans.KeyBean;

public interface KeyMapper {
	public int batchSaveKeys(@Param("keys")List<KeyBean> keys);
}
