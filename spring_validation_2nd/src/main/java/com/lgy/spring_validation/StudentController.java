package com.lgy.spring_validation;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class StudentController {
	
	@RequestMapping("/studentForm")
	public String studentForm() {
		
		return "createPage";
	}
	
	// 매개변수 Student : 커맨드 객체 (dto 역할)
	// 매개변수 BindingResult : 스프링에서 제공하는 기본 validation 결과 인터페이스
	@RequestMapping("/student/create")
	public String studentCreate(Student student, BindingResult result) {
		String page = "createDonePage";
		
//		StudentValidator : 공통기능 validation 체크하는 클래스 객체
		StudentValidator validator = new StudentValidator();
		validator.validate(student, result);
		
//		StudentValidator.validate 의  errors.rejectValue 메소드가 호출되면 result.hasErrors() 가 참 
		if (result.hasErrors()) {
//			*.스프링에서 기본으로 출력하는 오류 메시지
//			Field error in object 'student' on field 'id': rejected value []; 
//			codes [trouble.student.id,trouble.id,trouble.java.lang.String,trouble]; 
//			arguments []; default message [null]
			log.info("@# result.hasErrors() id => " + result.getFieldError("id"));
			log.info("@# result.hasErrors() pw => " + result.getFieldError("pw"));
			page = "createPage";
		}
		
		return page;
	}
	
}
