package com.lgy.spring_ex2_5;

import java.util.Arrays;

public class Triangle {
	private int a, b, c;

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public void process() {
		int[] arr = {a, b, c};
		Arrays.sort(arr);
		if(arr[2] < arr[0] + arr[1]) System.out.println("삼각형이 됩니다.");
		else System.out.println("삼각형이 될 수 없습니다.");
	}
}
