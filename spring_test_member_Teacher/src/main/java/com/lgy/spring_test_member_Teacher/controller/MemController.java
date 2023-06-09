package com.lgy.spring_test_member_Teacher.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.spring_test_member_Teacher.service.MemLoginService;
import com.lgy.spring_test_member_Teacher.service.MemService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemController {
	MemService service;
	
	@RequestMapping("/login")
	public String login() {
		log.info("@# login");
		
		return "login"; // .jsp 를 가리킴
	}
	
	@RequestMapping("/login_yn")
	public String login_yn(HttpServletRequest request, Model model) {
		log.info("@# login_yn");
		
		model.addAttribute("request", request);
		service = new MemLoginService();
		int result = service.execute(model);
		
		if(result == 1) { // 아이디 비밀번호 일치하는 경우
			return "redirect:login_ok2"; // redirect:는 DB와의 연동도 함께처리된다 그냥 습관적으로 붙여도 상관 X
		}
		return "redirect:login"; // .jsp 를 가리킴
	}
	
	@RequestMapping("/login_ok2")
	public String login_ok() {
		log.info("@# login_ok2");
		
		return "login_ok"; // .jsp 를 가리킴 도메인에는 ~/login_ok2????????????????????????????????????????????
	}
}
