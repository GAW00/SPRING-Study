package com.lgy.spring_mvc_board_std.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.lgy.spring_mvc_board_std.dto.BDto;
import com.lgy.spring_mvc_board_std.dto.Criteria;
import com.lgy.spring_mvc_board_std.dto.PageDTO;
import com.lgy.spring_mvc_board_std.service.BService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BController {
//	@Autowired
//	private SqlSession sqlSession;
	
	@Autowired
	private BService service;
	
	@RequestMapping("/list_old")
	public String list(Model model) {
		log.info("@# BController.list");
		
//		IBDao dao = sqlSession.getMapper(IBDao.class);
//		model.addAttribute("list", dao.list());
		ArrayList<BDto> list = service.list();
		model.addAttribute("list", list);
		
		return "list";
	}
	
	@RequestMapping("/list")
	public String list(Criteria cri, Model model) {
		log.info("@# BController.list");
		log.info("@# cri ===> " + cri);
		
		log.info("%%%%%% cri.pageNum = " + cri.getPageNum());
		log.info("%%%%%% cri.amount = " + cri.getAmount());
		
		model.addAttribute("list", service.list(cri));
		model.addAttribute("pageMaker", new PageDTO(123, cri));
		
		return "list";
	}
	
	@RequestMapping("/write")
//	public String write(HttpServletRequest request, Model model) {
	public String write(@RequestParam HashMap<String, String> param) {
		log.info("@# BController.write");
		
//		IBDao dao = sqlSession.getMapper(IBDao.class);
//		dao.write(request.getParameter("bname")
//				, request.getParameter("btitle")
//				, request.getParameter("bcontent"));
		service.write(param);
		
		return "redirect:list";
	}
	
	@RequestMapping("/write_view")
	public String write_view() {
		log.info("@# BController.write_view");
		
		return "write_view";
	}
	
	@RequestMapping("/content_view")
//	public String content_view(HttpServletRequest request, Model model) {
	public String content_view(@RequestParam HashMap<String, String> param, Model model) {
		log.info("@# BController.content_view");
		
//		IBDao dao = sqlSession.getMapper(IBDao.class);
//		model.addAttribute("content_view", dao.contentView(request.getParameter("bid")));
		BDto dto = service.contentView(param);
		model.addAttribute("content_view", dto);
		model.addAttribute("pageMaker", param);
		
		return "content_view";
	}
	
	@RequestMapping("/modify")
//	public String modify(HttpServletRequest request, Model model) {
	public String modify(@RequestParam HashMap<String, String> param, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		log.info("@# BController.modify");

		service.modify(param);
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
//	public String delete(HttpServletRequest request, Model model) {
	public String delete(@RequestParam HashMap<String, String> param, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		log.info("@# BController.delete");
		
//		IBDao dao = sqlSession.getMapper(IBDao.class);
//		dao.delete(request.getParameter("bid"));
		service.delete(param);
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		
		return "redirect:list";
	}
}











