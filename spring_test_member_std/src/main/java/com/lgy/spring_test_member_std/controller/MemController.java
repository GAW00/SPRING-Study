package com.lgy.spring_test_member_std.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lgy.spring_test_member_std.dto.MemDto;
import com.lgy.spring_test_member_std.service.MemService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemController {

	@Autowired
	private MemService service;
	
	@RequestMapping("/login")
	public String login() {
		log.info("@# login");
		
		return "login";
	}
	
	@RequestMapping("/login_yn")
	public String login_yn(@RequestParam HashMap<String, String> param, HttpServletRequest request) {
		log.info("@# login_yn");
		
		int re;
		
		ArrayList<MemDto> dto = service.loginYn(param);
		
		if(dto.isEmpty()) { // 조회가 안된 경우
			re = -1;
		}
		else {
			if(request.getParameter("mem_pwd").equals(dto.get(0).getMem_pwd())) {
				re = 1;
			}
			else {
				re = 0;
			}
		}
//		아이디와 비밀번호가 일치
		if (re == 1) {
			return "redirect:login_ok";
		}
		
		return "redirect:login";
	}
		
	@RequestMapping("/login_ok")
	public String login_ok() {
		log.info("@# login_ok");
		
		return "login_ok";
	}
	
	@RequestMapping("/register")
	public String register() {
		log.info("@# register");
		
		return "register";
	}
	
//	request : 뷰에서 값을 받아옴
	@RequestMapping("/registerOk")
	public String registerOk(@RequestParam HashMap<String, String> param) {
		log.info("@# registerOk");
		
		service.write(param);
		
		return "redirect:login";
	}
}
