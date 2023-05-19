package com.lgy.spring_ex5_1;

public class Circle {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double process() {
		return Math.PI * Math.pow(radius, 2);
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
