package com.lgy.spring_5_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		
//		이름 ~ 반 출력
		studentInfo.getStudentInfo();
		
//		student2 : 홍길순 객체
		Student student2 = ctx.getBean("student2", Student.class);
		studentInfo.setStudent(student2);
		studentInfo.getStudentInfo();
	}
}
