package com.lgy.spring_ex2_5;

public class Multiple {
	private int num;

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void process() {
		boolean multiple = false;
		if(num % 3 == 0) {
			System.out.println("3의 배수이다.");
			multiple = true;
		}
		if(num % 5 == 0) {
			System.out.println("5의 배수이다.");
			multiple = true;
		}
		if(num % 8 == 0) {
			System.out.println("8의 배수이다.");
			multiple = true;
		}
		if(multiple == false) System.out.println("셋 중 어떠한 배수도 아니다");
	}
}
