package com.lgy.spring_test_item.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.spring_test_item.service.MemLoginService;
import com.lgy.spring_test_item.service.MemService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemController {
	MemService service;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model) {
		log.info("@# login");
		
		model.addAttribute("request", request);
		
		service = new MemLoginService();
		if(service.execute(model)) return "login_ok";
		else return "login_no";
	}
}
