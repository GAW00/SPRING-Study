package com.lgy.ShoppingMall.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lgy.ShoppingMall.dto.*;
import com.lgy.ShoppingMall.service.*;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping("/main")
	public String main(Model model) {
		log.info("@# BController.main");
		
		return "main";
	}
	
	@RequestMapping("/list")
//	public String list(Model model) {
	public String list(@RequestParam HashMap<String, String> param, Model model) {
		log.info("@# BController.list");
		
//		ArrayList<ProductDto> list = service.list();
		ArrayList<ProductDto> list = service.list(param);
		model.addAttribute("list", list);
		
		return "list";
	}
	
//	@RequestMapping("/write")
////	public String write(HttpServletRequest request, Model model) {
//	public String write(@RequestParam HashMap<String, String> param) {
//		log.info("@# BController.write");
//		
////		IBDao dao = sqlSession.getMapper(IBDao.class);
////		dao.write(request.getParameter("bname")
////				, request.getParameter("btitle")
////				, request.getParameter("bcontent"));
//		service.write(param);
//		
//		return "redirect:list";
//	}
//	
//	@RequestMapping("/write_view")
//	public String write_view() {
//		log.info("@# BController.write_view");
//		
//		return "write_view";
//	}
//	
	@RequestMapping("/content_view")
//	public String content_view(HttpServletRequest request, Model model) {
	public String content_view(@RequestParam HashMap<String, String> param, Model model) {
		log.info("@# BController.content_view");
		
		ProductDto dto = service.contentView(param);
		model.addAttribute("content_view", dto);
		
		return "content_view";
	}
	
//	@RequestMapping("/modify")
////	public String modify(HttpServletRequest request, Model model) {
//	public String modify(@RequestParam HashMap<String, String> param) {
//		log.info("@# BController.modify");
//
////		IBDao dao = sqlSession.getMapper(IBDao.class);
////		dao.modify(request.getParameter("bid")
////				, request.getParameter("bname")
////				, request.getParameter("btitle")
////				, request.getParameter("bcontent"));
//		service.modify(param);
//		
//		return "redirect:list";
//	}
//	
//	@RequestMapping("/delete")
////	public String delete(HttpServletRequest request, Model model) {
//	public String delete(@RequestParam HashMap<String, String> param) {
//		log.info("@# BController.delete");
//		
////		IBDao dao = sqlSession.getMapper(IBDao.class);
////		dao.delete(request.getParameter("bid"));
//		service.delete(param);
//		
//		return "redirect:list";
//	}
}











