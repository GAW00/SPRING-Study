package com.lgy.spring_12_2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

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
		
		return "home";
	}
	
	@RequestMapping("board/view")   // 도메인 주소 창의 url에서 board/view 를 사용해야 함
//	@RequestMapping("view")   // 정상
//	@RequestMapping("/view")  // 정상
//	@RequestMapping("view/")  // 오류
//	@RequestMapping("/view/") // 오류
	public String view() {
//		return "view";
		return "board/view"; // views 폴더 아래에 board 폴더를 생성하고 그 아래에 view.jsp가 있어야 함
	}
}
