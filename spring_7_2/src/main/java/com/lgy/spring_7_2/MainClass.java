package com.lgy.spring_7_2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX.xml");
		
//		@# afterPropertiesSet() 1. 빈생성시 호출
//		@# initMethod() 2. 빈생성후 호출
//		INFO : org.springframework.context.support.GenericXmlApplicationContext - Closing org.springframework.context.support.GenericXmlApplicationContext@2957fcb0: startup date [Mon May 22 14:53:51 KST 2023]; root of context hierarchy
//		INFO : org.springframework.beans.factory.support.DefaultListableBeanFactory - Destroying singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@2d3fcdbd: defining beans [student,otherStudent]; root of factory hierarchy
//		@# destroyMethod() 3. 빈 소멸시 호출
//		@# destroy() 4. 빈 소멸후 호출
		ctx.refresh();
		
		ctx.close();
	}
}
