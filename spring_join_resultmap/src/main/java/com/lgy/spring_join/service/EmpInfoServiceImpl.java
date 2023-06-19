package com.lgy.spring_join.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgy.spring_join.dao.EmpInfoDao;
import com.lgy.spring_join.dto.EmpDeptDto;
import com.lgy.spring_join.dto.EmpJoinDeptDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmpInfoServiceImpl implements EmpInfoService{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public ArrayList<EmpJoinDeptDto> list() {
		log.info("@# EmpInfoServiceImpl.list()");
		
		EmpInfoDao dao = sqlSession.getMapper(EmpInfoDao.class);
		ArrayList<EmpJoinDeptDto> list = dao.list();
		
		return list;
	}

}











