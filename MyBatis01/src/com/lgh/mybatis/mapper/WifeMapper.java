package com.lgh.mybatis.mapper;

import com.lgh.mybatis.beans.WifeBean;

public interface WifeMapper {
	
	
	public WifeBean selectWifeByHusbandId(int id)throws Exception;
}
