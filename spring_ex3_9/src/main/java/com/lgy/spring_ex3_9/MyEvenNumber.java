package com.lgy.spring_ex3_9;

public class MyEvenNumber {
	private EvenNumber evennumber;
	private int n;

	public void pc() {
		evennumber.process(n);
	}
	public EvenNumber getEvennumber() {
		return evennumber;
	}
	public void setEvennumber(EvenNumber evennumber) {
		this.evennumber = evennumber;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
}
