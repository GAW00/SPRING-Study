package com.lgy.spring_ex2_1;

public class Draw {
	public static void main(String[] args) {
		// Circle 클래스가 Draw 클래스에 의존
		// Circle 클래스로 객체 행성해서 값을 주입
		// 의존 + 주입(Dependency Injection) : DI
		Circle c = new Circle();
		c.setRadius(10);
		c.getArea();

		Rectangle r = new Rectangle();
		r.setWidth(20);
		r.setHeight(30);
		r.getArea();
	}
}
