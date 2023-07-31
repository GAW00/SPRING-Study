package com.boot.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.MemDao;
import com.boot.dto.MemDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MemServiceImpl implements MemService{

	@Autowired
	private MemDao dao;
	
	@Override
	public ArrayList<MemDto> loginYn(HashMap<String, String> param) {
		log.info("@# MemService.loginYn start");
		
		ArrayList<MemDto> dto =  dao.loginYn(param);
		
		return dto;
	}

	@Override
	public void write(HashMap<String, String> param) {
		log.info("@# MemService.write start");
		
		dao.write(param);
	}
	
}
