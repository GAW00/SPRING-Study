package com.lgy.spring_test_item_std.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lgy.spring_test_item_std.dto.ItemDto;
import com.lgy.spring_test_item_std.service.ItemService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ItemController {
	
	@Autowired
	private ItemService service;
	
	@RequestMapping("/write")
	public String write() {
		log.info("@# write");
		
		return "itemWrite";
	}
	
	@RequestMapping("/writeResult")
	public String writeResult(@RequestParam HashMap<String, String> param) {
		log.info("@# writeResult");
		
		service.write(param);
		
		return "writeResult";
	}
	
	@RequestMapping("/content_view")
	public String content_view(Model model) {
		log.info("@# content_view");

//		ItemDao dao = sqlSession.getMapper(ItemDao.class);
//		model.addAttribute("content_view", dao.contentView());
		ArrayList<ItemDto> dtos = service.contentView();
		model.addAttribute("contentView", dtos);
		
		return "content_view";
	}
}
