package com.lgy.spring_ex2_5;

public class MultipleTriangle {
	public static void main(String[] args) {
		Multiple m = new Multiple();
		m.setNum(240);
		m.process();
		
		Triangle t = new Triangle();
		t.setA(4);
		t.setB(3);
		t.setC(5);
		t.process();
	}
}
