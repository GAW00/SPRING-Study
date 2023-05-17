package com.lgy.spring_ex2_4;

public class RectangleMedian {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setX(150);
		r.setY(150);
		r.process();
		
		Median m = new Median();
		m.setN1(20);
		m.setN2(100);
		m.setN3(33);
		m.process();
	}
}
