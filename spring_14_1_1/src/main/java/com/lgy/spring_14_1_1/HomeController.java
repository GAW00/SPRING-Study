package com.lgy.spring_14_1_1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
//		return "home";
		return "index";
	}
	
	@RequestMapping("/index")
//	리턴타입 String 으로 뷰를 찾아감
	public String goIndex() {
		return "index";
	}
	
//	HttpServletReqest : 뷰에서 넘어온 값을 받는다
//	model 객체 : 뷰로 값을 넘길 수 있다
//	jsp의 action = "student" 에서 호출됨
//	@RequestMapping("/student")
//	value 속성 사용해 url 값 받음
//	get / post 둘 다 받음
//	@RequestMapping(value = "/student")
//	method = RequestMethod.GET : get 방식만 받을 수 있음
//	@RequestMapping(value = "/student", method = RequestMethod.GET)
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String goStudent(HttpServletRequest httpServletReqest, Model model) {
		String id = httpServletReqest.getParameter("id");
//		id를 studentId에 저장
		model.addAttribute("studentId", id);
		
//		student/studentId : student 폴더에 studentId.jsp 파일
		return "student/studentId";
	}
}
