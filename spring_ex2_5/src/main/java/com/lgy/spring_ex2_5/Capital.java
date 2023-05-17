package com.lgy.spring_ex2_5;

public class Capital {
	private int num;

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void process() {
		for(int i = 0; i <= num - 'A'; i++) {
			for(int j = 'A'; j <= num - i; j++) {
				System.out.print((char)(j));
			}
			System.out.println();
		}
	}
}
