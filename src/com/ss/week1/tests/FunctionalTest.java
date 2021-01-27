package com.ss.week1.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.ss.week1.Functional;

import java.util.Arrays;

public class FunctionalTest {
	
	private Functional f = new Functional();
	
	@Test
	public void rightMost() {
		assertEquals(Arrays.asList(1, 2, 3), f.rightMost(Arrays.asList(21, 32, 343)));
		assertNotEquals(Arrays.asList(1, 2, 3), f.rightMost(Arrays.asList(25, 64, 31)));
	}
	
	@Test
	public void multiplyByTwo() {
		assertEquals(Arrays.asList(2, 4, 6), f.multiplyByTwo(Arrays.asList(1, 2, 3)));
		assertNotEquals(Arrays.asList(3, 5, 4), f.multiplyByTwo(Arrays.asList(1, 2, 3)));
	}
	
	@Test
	public void removeX() {
		assertEquals(Arrays.asList("a", "bb", "c"), f.removeX(Arrays.asList("ax", "bb" , "cx")));
		assertEquals(Arrays.asList("a", "bb", "c"), f.removeX(Arrays.asList("xxax", "xbxbx" , "xcx")));
		assertNotEquals(Arrays.asList("d", "bbdd", "cdd"), f.removeX(Arrays.asList("xxax", "xbxbx" , "xcx")));
	}
	
	
	
	
}
