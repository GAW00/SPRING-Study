package com.lgy.spring_ex3_4;

public class Won2Dollar {
	public void exchange(int won) {
		double rate = 1200;
		System.out.println(won + "원은 $" + (won / rate) + "입니다.");
	}
}
