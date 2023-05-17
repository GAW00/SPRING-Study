package com.lgy.spring_ex2_3;

public class DivAndRemains {
	private int num;

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void isSame() {
		if(num / 10 == num % 10) {
			System.out.println(num + "은 10의 자리와 1의 자리가 같다");
		}
		else {
			System.out.println(num + "은 10의 자리와 1의 자리가 다르다");
		}
	}
}
