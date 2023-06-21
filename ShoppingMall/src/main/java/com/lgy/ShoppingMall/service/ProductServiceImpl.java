package com.lgy.ShoppingMall.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgy.ShoppingMall.dao.ProductDao;
import com.lgy.ShoppingMall.dto.CategoryDto;
import com.lgy.ShoppingMall.dto.ProductDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("ProductService")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public ArrayList<CategoryDto> category() {
		log.info("@# ProductServiceImpl.category() start");
		
		ProductDao dao = sqlsession.getMapper(ProductDao.class);
		ArrayList<CategoryDto> category = dao.category();
		
		log.info("@# ProductServiceImpl.category() end");
		
		return category;
	}

	@Override
	public void register(HashMap<String, String> param) {
		log.info("@# ProductServiceImpl.register() start");
		
		ProductDao dao = sqlsession.getMapper(ProductDao.class);
		dao.register(param);
		
		log.info("@# ProductServiceImpl.register() end");
	}

	@Override
	public ArrayList<ProductDto> productlist() {
		log.info("@# ProductServiceImpl.productlist() start");
		
		ProductDao dao = sqlsession.getMapper(ProductDao.class);
		ArrayList<ProductDto> productlist = dao.productlist();
		
		log.info("@# ProductServiceImpl.productlist() end");
		return null;
	}

	@Override
	public ProductDto productView(HashMap<String, String> param) {
		log.info("@# ProductServiceImpl.productView() start");
		
		ProductDao dao = sqlsession.getMapper(ProductDao.class);
		ProductDto dto = dao.productView(param);
		
		log.info("@# ProductServiceImpl.productView() end");
		return dto;
	}

	@Override
	public void productModify(HashMap<String, String> param) {
		log.info("@# ProductServiceImpl.productModify() start");
		
		ProductDao dao = sqlsession.getMapper(ProductDao.class);
		dao.productModify(param);
		
		log.info("@# ProductServiceImpl.productModify() end");
	}

	@Override
	public void productDelete(HashMap<String, String> param) {
		log.info("@# ProductServiceImpl.productDelete() start");
		
		ProductDao dao = sqlsession.getMapper(ProductDao.class);
		dao.productDelete(param);
		
		log.info("@# ProductServiceImpl.productDelete() end");
	}
	
}
