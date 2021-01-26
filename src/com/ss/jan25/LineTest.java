/**
 * 
 */
package com.ss.jan25;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**Christian Reyes
 * @author chrel
 * Assignment 4 - Line Test
 */
public class LineTest {

	private Line positiveLine = new Line(0.0,0.0,1.0,1.0); //(0,0),(1,1)
	private Line negativeLine = new Line(0.0,1.0,1.0,0.0); //(0,1),(1,0)
	private Line horizontalLine = new Line(0.0,0.0,5.0,0.0); //(0,0),(5,0)
	private Line verticalLine = new Line(0.0,0.0,0.0,5.0);	//(0,0),(0,5)
	
	@Test
	public void getSlope() {
		assertEquals(1.0, positiveLine.getSlope(), .0001);
		assertEquals(-1.0, negativeLine.getSlope(), .0001);
		assertEquals(0.0, horizontalLine.getSlope(), .0001);
	}
	
	@Test
	public void getDistance() {
		assertEquals(Math.sqrt(2), positiveLine.getDistance(), .0001);
		assertEquals(Math.sqrt(2), negativeLine.getDistance(), .0001);
		assertEquals(5.0, horizontalLine.getDistance(), .0001);
		assertEquals(5.0, verticalLine.getDistance(), .0001);
	}
	
	@Test
	public void parallelTo() {
		assertEquals(true, positiveLine.parallelTo(new Line(-1.0,0.0,0.0,1.0)));
		assertEquals(true, horizontalLine.parallelTo(horizontalLine));
	}
	

}
