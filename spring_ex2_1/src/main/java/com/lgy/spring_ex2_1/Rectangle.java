package com.lgy.spring_ex2_1;

class Rectangle {
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void getArea() {
		System.out.println("사각형의 면적은 : " + width * height);
	}
}