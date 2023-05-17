package com.lgy.spring_ex3_6;

public class MyDivAndRemains {
	private DivAndRemains dr;
	private int n;
	
	public void pc() {
		dr.process(n);
	}
	public DivAndRemains getDr() {
		return dr;
	}
	public void setDr(DivAndRemains dr) {
		this.dr = dr;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
}
