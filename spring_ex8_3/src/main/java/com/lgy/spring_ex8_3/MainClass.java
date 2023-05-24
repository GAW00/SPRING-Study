package com.lgy.spring_ex8_3;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "";
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		if(str.equals("oracle")) {
			config = "oracle";
		}
		else if(str.equals("mysql")) {
			config = "mysql";
		}
		sc.close();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("oracleCTX.xml", "mysqlCTX.xml");
		
		DbInfo dbInfo = ctx.getBean("dbInfo", DbInfo.class);
		System.out.println("driver : " + dbInfo.getDriver());
		System.out.println("url : " + dbInfo.getUrl());
		System.out.println("user : " + dbInfo.getUser());
		System.out.println("pwd : " + dbInfo.getPassword());
	}
}
