package com.ss.jan21.Shape;

public class Rectangle implements Shape {

	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateArea() {
		return (this.length * this.width);
	}

	@Override
	public void display() {
		System.out.println("Area of rectangle is "+calculateArea());
		
	}

}
