package com.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
// @ResponseBody : 뷰에 출력(기본은 크롬)
//@ResponseBody
public class DemoController {
//	@ResponseBody : 안에 쓰면 해당 메소드에만 적용
	@ResponseBody
	@RequestMapping("/")
	public String home() {
		log.info("Boot Gradle!~");
		return "gradle";
	}
	
	@RequestMapping("/hello.do")
	public String home(Model model) {
		log.info("안녕하세요!~");
		model.addAttribute("message", "hello.jsp 입니다.!");
		return "hello";
	}
}
