/**
 * 
 */
package com.ss.jan21.Shape;

/**Christian Reyes
 * @author chrel
 * Assignment 2 - Shapes
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Triangle t = new Triangle(3.2,5.0);
		t.display();
		
		Circle c = new Circle(5);
		c.display();
		
		Rectangle r = new Rectangle(10, 7);
		r.display();

	}

}
