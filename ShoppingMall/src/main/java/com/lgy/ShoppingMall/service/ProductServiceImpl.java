package com.lgy.ShoppingMall.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgy.ShoppingMall.dao.*;
import com.lgy.ShoppingMall.dto.*;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("ProductService")
public class ProductServiceImpl implements ProductService{
	@Autowired
	private SqlSession sqlSession;
	
	 
	@Override
//	public ArrayList<ProductDto> list() {
	public ArrayList<ProductDto> list(HashMap<String, String> param) {
		log.info("@# BServiceImpl.list() start");
		
		ProductDao dao = sqlSession.getMapper(ProductDao.class);
//		ArrayList<ProductDto> list = dao.list();
		ArrayList<ProductDto> list = dao.list(param);
		
		log.info("@# BServiceImpl.list() end");
		
		return list;
	}

	@Override
	public ProductDto contentView(HashMap<String, String> param) {
		log.info("@# BServiceImpl.contentView() start");
		
		ProductDao dao = sqlSession.getMapper(ProductDao.class);
		ProductDto dto = dao.contentView(param);
		
		log.info("@# BServiceImpl.contentView() end");
		
		return dto;
	}
	
}
