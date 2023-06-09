package com.lgy.spring_mvc_board_jdbc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.spring_mvc_board_jdbc.service.BContentService;
import com.lgy.spring_mvc_board_jdbc.service.BDeleteService;
import com.lgy.spring_mvc_board_jdbc.service.BListService;
import com.lgy.spring_mvc_board_jdbc.service.BModifyService;
import com.lgy.spring_mvc_board_jdbc.service.BService;
import com.lgy.spring_mvc_board_jdbc.service.BWriteService;
import com.lgy.spring_mvc_board_jdbc.util.Constant;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BController {
//	BCommand command
	BService service;
	public JdbcTemplate template;
	
//	servlet-context.xml 에 있는  template 객체를 저장(this.template)
	@Autowired  // 필요한 의존 객체의 "타입"에 해당하는 빈을 찾아 주입한다
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	 // Constant.template 를 dao에서 사용
		Constant.template = this.template; // Contant.template에 데이터 정보 저장딤
	}
	
	// 게시판 목록 조회
	@RequestMapping("/list")
	public String list(Model model) {
		log.info("@# list");
		
		// service(command)단을 호출(강의자료 17장 참고)
//		BListCommand command = new BListCommand();
		
//		command = new BListCommand(); // 업캐스팅
//		command.execute(model);
		service = new BListService();
		service.execute(model);
		return "list";
	}
	
//	request : 뷰에서 값을 받아옴
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		log.info("@# write");
//		request 에 bname, btitle, bcontent 값들이 있음
		model.addAttribute("request", request);
////		command 단 호출
//		command = new BWriteCommand();
////		model 에 request를 담고 있음
//		command.execute(model);
		service  = new BWriteService();
		service.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/write_view")
	public String write_view() {
		log.info("@# write_view");
		
		return "write_view";
	}
	
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		log.info("@# content_view");
		
		model.addAttribute("request", request);
//		command = new BContentCommand();
//		command.execute(model);
		service = new BContentService();
		service.execute(model);
		
		return "content_view";
	}
	
//	content_view.jsp의 form 태그 action 속성에 의해 컨트롤러에서 맵핑됨
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, Model model) {
		log.info("@# modify");
		
		model.addAttribute("request", request);
//		command = new BModifyCommand();
//		command.execute(model);
		service = new BModifyService();
		service.execute(model);
		
		return "redirect:list";
	}
	
//	content_view.jsp의 a태그 delete에 의해 컨트롤러에서 맵핑됨
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		log.info("@# delete");
		
		model.addAttribute("request", request);
//		command = new BDeleteCommand();
//		command.execute(model);
		service = new BDeleteService();
		service.execute(model);
		
		return "redirect:list";
	}
}
