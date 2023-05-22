package com.lgy.spring_8_2_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationCTX.xml");
//		스프링 자바 설정파일 사용
//		AnnotationConfigApplicationContext 사용하기 위해 pom.xml에 dependency cglib 추가
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		AdminConnection connection = ctx.getBean("adminConnection", AdminConnection.class);
		System.out.println("adminID : " + connection.getAdminId());
		System.out.println("adminPW : " + connection.getAdminPw());
		System.out.println("sub_adminID : " + connection.getSub_adminId());
		System.out.println("sub_adminPW : " + connection.getSub_adminPw());
	}
}
