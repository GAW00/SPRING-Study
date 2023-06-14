package com.lgy.spring_test_member_std.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgy.spring_test_member_std.dao.MemDao;
import com.lgy.spring_test_member_std.dto.MemDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MemServiceImpl implements MemService{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public ArrayList<MemDto> loginYn(HashMap<String, String> param) {
		log.info("@# MemService.loginYn start");
		
		MemDao dao = sqlSession.getMapper(MemDao.class);		
		ArrayList<MemDto> dto =  dao.loginYn(param);
		
		log.info("@# MemService.loginYn end");
		
		return dto;
	}

	@Override
	public void write(HashMap<String, String> param) {
		log.info("@# MemService.write start");
		
		MemDao dao = sqlSession.getMapper(MemDao.class);
		dao.write(param);
		
		log.info("@# MemService.write end");
	}
	
}
