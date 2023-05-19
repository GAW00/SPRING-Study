package com.lgy.spring_5_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
//		Pencil6BWithEraser pencil1 = ctx.getBean("pencil1", Pencil6BWithEraser.class);
//		pencil1.use();
//		Pencil6B pencil2 = ctx.getBean("pencil2", Pencil6B.class);
//		pencil2.use(); 
//		Pencil4B pencil3 = ctx.getBean("pencil3", Pencil4B.class);
//		pencil3.use();
		
//		Pencil.class : 인터페이스 사용(참조변수는 인터페이스로받음)
//		pencil1, 2, 3의 use()는 오버라이딩을 통해 호출
		Pencil pencil1 = ctx.getBean("pencil1", Pencil.class);
		pencil1.use();
		Pencil pencil2 = ctx.getBean("pencil2", Pencil.class);
		pencil2.use();
		Pencil pencil3 = ctx.getBean("pencil3", Pencil.class);
		pencil3.use();
	}
}
