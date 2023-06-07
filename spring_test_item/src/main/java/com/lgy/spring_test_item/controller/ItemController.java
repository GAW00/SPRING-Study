package com.lgy.spring_test_item.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.spring_test_item.service.ItemContentService;
import com.lgy.spring_test_item.service.ItemService;
import com.lgy.spring_test_item.service.ItemWriteService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ItemController {
	ItemService service;
	
	@RequestMapping("/write")
	public String write() {
		log.info("@# write");
		
		return "itemWrite";
	}
	
	@RequestMapping("/writeResult")
	public String writeResult(HttpServletRequest request, Model model) {
		log.info("@# writeResult");
		
		model.addAttribute("request", request);
		service = new ItemWriteService();
		service.execute(model);
		
		return "writeResult";
	}
	
	@RequestMapping("/content_view")
	public String content_view(Model model) {
		log.info("@# content_view");
		service = new ItemContentService();
		service.execute(model);
		
		return "content_view";
	}
}
