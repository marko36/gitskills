package com.lgh.mybatis.mapper;

import com.lgh.mybatis.beans.HusbandBean;

public interface HusbandMapper {
	public HusbandBean selectHusbandById(int id)throws Exception;
	
	public HusbandBean selectHusbandAndWife(int id)throws Exception;
}
