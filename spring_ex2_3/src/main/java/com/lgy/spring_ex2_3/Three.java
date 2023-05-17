package com.lgy.spring_ex2_3;

public class Three {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public void is3Multiple() {
		if(num % 3 == 0) {
			System.out.println(num + "은 3의 배수");
		}
		else {
			System.out.println(num + "은 3의 배수 아님");
		}
	}
}
