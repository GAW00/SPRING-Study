package com.lgy.spring_ex3_8;

import java.util.Arrays;

public class Median {
	public void process(int n1, int n2, int n3) {
		int[] arr = {n1, n2, n3};
		Arrays.sort(arr);
		System.out.println("입력된 정수 " + n1 + ", " + n2 + ", " + n3 + "의 중간값은 " + arr[1]);
	}
}
