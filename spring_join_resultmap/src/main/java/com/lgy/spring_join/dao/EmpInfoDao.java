package com.lgy.spring_join.dao;

import java.util.ArrayList;

import com.lgy.spring_join.dto.EmpDeptDto;
import com.lgy.spring_join.dto.EmpJoinDeptDto;

public interface EmpInfoDao {
//	public ArrayList<EmpDeptDto> list();
	public ArrayList<EmpJoinDeptDto> list();
}
