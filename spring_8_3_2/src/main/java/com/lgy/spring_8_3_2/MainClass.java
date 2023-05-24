package com.lgy.spring_8_3_2;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config="";
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		if(str.equals("dev")) { // 개발 서버일때
			config="dev";
		}
		else if(str.equals("run")) { // 운영 서버일때
			config="run";
		}
		sc.close();
		
//		xml 방식)
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//		ctx.getEnvironment().setActiveProfiles(config); // config = dev or run
//		ctx.load("applicationCTX_dev.xml", "applicationCTX_run.xml");
//		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
//		System.out.println("ip : " + info.getIpNum());
//		System.out.println("ip : " + info.getPortNum());
		
//		java 방식)
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config); // config = dev or run
//		register() : class 등록
		ctx.register(ApplicationConfigDev.class, ApplicationConfigRun.class);
		ctx.refresh();
		
		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("ip : " + info.getIpNum());
		System.out.println("ip : " + info.getPortNum());
	}
}
