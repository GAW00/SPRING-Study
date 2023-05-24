package com.lgy.spring_8_3_1;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

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
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config); // config = dev or run
//		spring 설정파일 가져오기
//		dev or run 가지고 profile 속성을 찾아감(xml 중 하나 선택됨)
		ctx.load("applicationCTX_dev.xml", "applicationCTX_run.xml");
		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("ip : " + info.getIpNum());
		System.out.println("ip : " + info.getPortNum());
	}
}
