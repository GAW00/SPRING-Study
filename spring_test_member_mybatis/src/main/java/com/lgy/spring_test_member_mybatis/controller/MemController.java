package com.lgy.spring_test_member_mybatis.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.spring_test_member_mybatis.dao.MemDao;
import com.lgy.spring_test_member_mybatis.dto.MemDto;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemController {

	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping("/login")
	public String login() {
		log.info("@# login");
		
		return "login";
	}
	
	@RequestMapping("/login_yn")
	public String login_yn(HttpServletRequest request, Model model) {
		log.info("@# login_yn");
		
		MemDao dao = sqlSession.getMapper(MemDao.class);		
		
		ArrayList<MemDto> dto = dao.loginYn(request.getParameter("mem_uid")
				  						  , request.getParameter("mem_pwd"));
		if(dto.isEmpty()) { // 조회가 안된 경우
			return "redirect:login";
		}
		else {
			if(request.getParameter("mem_pwd").equals(dto.get(0).getMem_pwd())) {
				return "redirect:login_ok";
			}
			else {
				return "redirect:login";
			}
		}
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
		
		MemDao dao = sqlSession.getMapper(MemDao.class);
		dao.write(request.getParameter("mem_uid")
				, request.getParameter("mem_pwd")
				, request.getParameter("mem_name"));
		
		return "redirect:login";
	}
}
