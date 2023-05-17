package com.lgy.spring_2_2;

class Won2dollar {
	private int won;

	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
	public void exchange2Dollar() {
		double rate = 1200;
		System.out.println("$" + (won / rate));
	}
}
