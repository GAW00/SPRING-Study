package com.lgy.spring_ex3_4;

public class MyWon2Dollar {
	private Won2Dollar w2d;
	private int won;
	
	public void exch() {
		w2d.exchange(won);
	}
	public Won2Dollar getW2d() {
		return w2d;
	}
	public void setW2d(Won2Dollar w2d) {
		this.w2d = w2d;
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
}
