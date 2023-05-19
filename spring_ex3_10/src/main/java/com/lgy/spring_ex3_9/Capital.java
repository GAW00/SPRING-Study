package com.lgy.spring_ex3_9;

public class Capital {
	public void alphabet(String alp_ori) {
		int alp = alp_ori.charAt(0);
		for(int i = 0; i <= alp - 'A'; i++) {
			for(int j = 'A'; j <= alp - i; j++) {
				System.out.print((char)(j));
			}
			System.out.println();
		}
	}
}
