package com.lgy.spring_ex3_9;

public class EvenNumber {
	public void process(int n) {
		System.out.print(n + "까지의 짝수들의 합계는 ");
		int sum = 0;
		while(n > 1) {
			if(n % 2 == 0) sum += n;
			else sum += n - 1;
			n -= 2;
		}
		System.out.println(sum);
	}
}
