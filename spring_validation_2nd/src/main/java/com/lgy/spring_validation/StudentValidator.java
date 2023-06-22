package com.lgy.spring_validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import lombok.extern.slf4j.Slf4j;

// Validator : 스프링에서 제공하는 기본 validation 인터페이스
@Slf4j
public class StudentValidator implements Validator{

//	supports : 커맨드 객체 지정(dto 해당)
//	<?> : 제네릭 타입 파라미터를 어떤것이라도 받아줌(ex> String, Integer))
	@Override
	public boolean supports(Class<?> clazz) {
//		커맨드 객체가 clazz 매개변수로 부터 배치됨(validation 체크 대상이 됨)
		return Student.class.isAssignableFrom(clazz);
	}

//	target : 유효성검사(validation) 체크 대상인 커맨드 객체
//	errors : 결과값 받는 객체
	@Override
	public void validate(Object target, Errors errors) {
		log.info("@# validate()");
		Student student = (Student) target;
		
		/*
		String id = student.getId();
		if(id == "" || id.trim().isEmpty()) {
			log.info("@# id is null or empty");
//			결과값 객체에 id 가 문제 있음을 알림(return)
			errors.rejectValue("id", "trouble");
		}
		
		String pw = student.getPw();
		if(pw == "" || pw.trim().isEmpty()) {
			log.info("@# pw is null or empty");
//			결과값 객체에 pw 가 문제 있음을 알림(return)
			errors.rejectValue("pw", "trouble");
		}
		*/
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "trouble");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pw", "trouble");
	}
	
}
