package com.boot.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.ItemDao;
import com.boot.dto.ItemDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemDao dao;
	
	@Override
	public void write(HashMap<String, String> param) {
		log.info("@# write start");
		
		dao.write(param);
	}

	@Override
	public ArrayList<ItemDto> contentView() {
		log.info("@# contentView start");
		
		ArrayList<ItemDto> dtos = dao.contentView();
		
		return dtos;
	}
	
}
