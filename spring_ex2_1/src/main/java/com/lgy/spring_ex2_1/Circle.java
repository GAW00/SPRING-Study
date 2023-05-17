package com.lgy.spring_ex2_1;

class Circle {
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void getArea() {
		System.out.println("원의 면적은 : " + Math.PI * Math.pow(radius, 2));
	}
}

