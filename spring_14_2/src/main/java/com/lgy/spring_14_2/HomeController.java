package com.lgy.spring_14_2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String index() {
		return "index";
	}
	
	@RequestMapping("/studentVIew")
//	뷰에서 넘어오는 값들을 클래스 객체로 한번에 받음
//	public String studentVIew(StudentInformation studentInformation) {
//	클래스 이름을 studentInfo 로 임의로 변경하면 뷰에서 찾지 못해 값을 받지 못함 ==> @ModelAttrivute 에서 변경해줄 수 있음
//	public String studentVIew(StudentInformation studentInfo) { ==> 오류
	public String studentVIew(@ModelAttribute("studentInfo") StudentInformation studentInformation) {
		return "studentVIew";
	}
}
