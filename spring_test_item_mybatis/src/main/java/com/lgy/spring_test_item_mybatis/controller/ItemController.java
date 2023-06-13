package com.lgy.spring_test_item_mybatis.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.spring_test_item_mybatis.dao.ItemDao;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ItemController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/write")
	public String write() {
		log.info("@# write");
		
		return "itemWrite";
	}
	
	@RequestMapping("/writeResult")
	public String writeResult(HttpServletRequest request, Model model) {
		log.info("@# writeResult");
		
		ItemDao dao = sqlSession.getMapper(ItemDao.class);
		dao.write(request.getParameter("name")
				, Integer.parseInt(request.getParameter("price"))
				, request.getParameter("description"));
		
		return "writeResult";
	}
	
	@RequestMapping("/content_view")
	public String content_view(Model model) {
		log.info("@# content_view");

		ItemDao dao = sqlSession.getMapper(ItemDao.class);
		model.addAttribute("content_view", dao.contentView());
		
		return "content_view";
	}
}
