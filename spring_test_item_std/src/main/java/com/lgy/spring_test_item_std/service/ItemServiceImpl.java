package com.lgy.spring_test_item_std.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgy.spring_test_item_std.dao.ItemDao;
import com.lgy.spring_test_item_std.dto.ItemDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void write(HashMap<String, String> param) {
		log.info("@# write start");
		
		ItemDao dao = sqlSession.getMapper(ItemDao.class);
		dao.write(param);
		
		log.info("@# write end");
	}

	@Override
	public ArrayList<ItemDto> contentView() {
		log.info("@# contentView start");
		
		ItemDao dao = sqlSession.getMapper(ItemDao.class);
		ArrayList<ItemDto> dtos = dao.contentView();
		
		log.info("@# contentVIew end");
		
		return dtos;
	}
	
}
