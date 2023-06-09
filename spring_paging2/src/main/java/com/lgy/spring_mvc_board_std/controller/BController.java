package com.lgy.spring_mvc_board_std.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lgy.spring_mvc_board_std.dto.BDto;
import com.lgy.spring_mvc_board_std.dto.Criteria;
import com.lgy.spring_mvc_board_std.dto.PageDTO;
import com.lgy.spring_mvc_board_std.service.BService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BController {
	
	@Autowired
	private BService service;
	
	@RequestMapping("/list_old")
	public String list(Model model) {
		log.info("@# BController.list");
		
		ArrayList<BDto> list = service.list();
		model.addAttribute("list", list);
		
		return "list";
	}
	
	@RequestMapping("/list")
	public String list(Criteria cri, Model model) {
		log.info("@# BController.list");
		log.info("@# cri ===> " + cri);
		
		model.addAttribute("list", service.list(cri));
		model.addAttribute("pageMaker", new PageDTO(123, cri));
		
		return "list";
	}
	
	@RequestMapping("/write")
	public String write(@RequestParam HashMap<String, String> param) {
		log.info("@# BController.write");
		
		service.write(param);
		
		return "redirect:list";
	}
	
	@RequestMapping("/write_view")
	public String write_view() {
		log.info("@# BController.write_view");
		
		return "write_view";
	}
	
	@RequestMapping("/content_view")
	public String content_view(@RequestParam HashMap<String, String> param, Model model) {
		log.info("@# BController.content_view");
		
		BDto dto = service.contentView(param);
		model.addAttribute("content_view", dto);
		
		return "content_view";
	}
	
	@RequestMapping("/modify")
	public String modify(@RequestParam HashMap<String, String> param) {
		log.info("@# BController.modify");

		service.modify(param);
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam HashMap<String, String> param) {
		log.info("@# BController.delete");
		
		service.delete(param);
		
		return "redirect:list";
	}
}











