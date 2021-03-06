package com.ss.jan21.Shape;

public class Circle implements Shape {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * (this.radius * this.radius);
	}

	@Override
	public void display() {
		System.out.println("Area of circle is "+ this.calculateArea());
		
	}

}
