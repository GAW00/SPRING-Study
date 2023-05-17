package com.lgy.spring_ex3_4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainWon2Dollar {
	public static void main(String[] args) {
		String configLoc = "classpath:won2DollarCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyWon2Dollar myw2d = ctx.getBean("myw2d", MyWon2Dollar.class);
		
		myw2d.exch();
	}
}
