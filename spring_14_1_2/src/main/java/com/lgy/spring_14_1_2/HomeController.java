package com.lgy.spring_14_1_2;

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
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

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
	public String goIndex() {
		return "index";
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String goStudent(HttpServletRequest httpServletReqest, Model model) {
		System.out.println("@# RequestMethod.GET");
		String id = httpServletReqest.getParameter("id");
		model.addAttribute("studentId", id);
		
		return "student/studentId";
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
//	public String goStudent(HttpServletRequest httpServletReqest, Model model) {
//	오버로딩 위해 ModelAndView 사용
	public ModelAndView goStudent(HttpServletRequest httpServletReqest) {
		System.out.println("@# RequestMethod.POST");
		String id = httpServletReqest.getParameter("id");
//		model.addAttribute("studentId", id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("studentId", id);
		mv.setViewName("student/studentId");
		
		return mv;
	}
}
