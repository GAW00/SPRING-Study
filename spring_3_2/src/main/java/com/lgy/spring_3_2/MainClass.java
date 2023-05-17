package com.lgy.spring_3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		MyCalculator myCalculator = new MyCalculator();
//		myCalculator.setCalculator(new Calculator());
//		
//		myCalculator.setFirstNum(10);
//		myCalculator.setSecondNum(2);
		
		// classpath 로 xml 객체 정보 읽어서 configLoc 변수에 저장
		String configLoc = "classpath:applicationCTX.xml";
		// GenericXmlApplicationContext 클래스로 객체정보 파싱(해석)
		// 업캐스팅으로 ctx 참조 변수로 받음
		AbstractApplicationContext ctx =  new GenericXmlApplicationContext(configLoc);
		// getBean 메소드로 객체정보를 가져옴
		// 클래스이름 객체명 =  ctx.getBean("xml에서 MyCalculator 객체에 준 id", 클래스명.class);
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
	}
}
