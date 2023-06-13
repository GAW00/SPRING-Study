package com.lgy.spring_test_member_jdbc_Teacher.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.spring_test_member_jdbc_Teacher.service.MWriteService;
import com.lgy.spring_test_member_jdbc_Teacher.service.MemLoginService;
import com.lgy.spring_test_member_jdbc_Teacher.service.MemService;
import com.lgy.spring_test_member_jdbc_Teacher.util.Constant;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemController {
	MemService service;
	public JdbcTemplate template;
	
//	servlet-context.xml 에 있는  template 객체를 저장(this.template)
	@Autowired  // 필요한 의존 객체의 "타입"에 해당하는 빈을 찾아 주입한다
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	 // Constant.template 를 dao에서 사용
		Constant.template = this.template; // Contant.template에 데이터 정보 저장딤
	}
	
	@RequestMapping("/login")
	public String login() {
		log.info("@# login");
		
		return "login";
	}
	
	@RequestMapping("/login_yn")
	public String login_yn(HttpServletRequest request, Model model) {
		log.info("@# login_yn");
		
		model.addAttribute("request", request);
		service = new MemLoginService();
		int result = service.execute(model);
		
//		아이디와 비밀번호가 일치
		if (result == 1) {
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
	public String registerOk(HttpServletRequest request, Model model) { //request 에는 register.jsp 에서 입력한 값들 들어있음
		log.info("@# registerOk");
		
		model.addAttribute("request", request);
		service  = new MWriteService();
		service.execute(model);
		
		return "redirect:login";
	}
}
