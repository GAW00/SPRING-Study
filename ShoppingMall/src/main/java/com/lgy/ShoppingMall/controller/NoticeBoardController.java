package com.lgy.ShoppingMall.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lgy.ShoppingMall.dto.NoticeDto;
import com.lgy.ShoppingMall.service.NoticeService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class NoticeBoardController {
	
	@Autowired
	private NoticeService service;
	
	@RequestMapping("/list")
	public String list(Model model) {
		log.info("@# NoticeBoardController.list() start");
		
		ArrayList<NoticeDto> list = service.list();
		model.addAttribute("list", list);
		
		log.info("@# NoticeBoardController.list() end");
		
		return "list";
	}
	@RequestMapping("/write")
	public String write(@RequestParam HashMap<String, String> param) {
		log.info("@# NoticeBoardController.write() start");
		
		service.write(param);
		
		log.info("@# NoticeBoardController.write() end");
		
		return "redirect:list";
	}
	
	@RequestMapping
	public String write_view() {
		log.info("@# write_view");
		
		return "write_view";
	}
	
	@RequestMapping("/content_view")
	public String content_view(@RequestParam HashMap<String, String> param, Model model) {
		log.info("@# NoticeBoardController.content_view() start");
		
		NoticeDto dto = service.contentView(param);
		model.addAttribute("content_view", dto);
		
		log.info("@# NoticeBoardController.content_view() end");
		
		return "content_view";
	}
	
	@RequestMapping("/modify")
	public String modify(@RequestParam HashMap<String, String> param) {
		log.info("@# NoticeBoardController.modify() start");

		service.modify(param);
		
		log.info("@# NoticeBoardController.modify() end");
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam HashMap<String, String> param) {
		log.info("@# NoticeBoardController.delete() start");
		
		service.delete(param);
		
		log.info("@# NoticeBoardController.delete() end");
		
		return "redirect:list";
	}
}