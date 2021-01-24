package com.ss.jan21.Shape;

public class Triangle implements Shape {
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return (this.base * this.height * 0.5);
	}

	@Override
	public void display() {
		System.out.println("Area of triangle is " +calculateArea());
		
	}

}
