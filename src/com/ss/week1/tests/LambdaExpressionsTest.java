package com.ss.week1.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.ss.week1.LambdaExpressions;

public class LambdaExpressionsTest {
	
	private LambdaExpressions l = new LambdaExpressions();

	@Test
	public void isOdd() {
		assertEquals("EVEN", l.isOdd().apply(4));
		assertEquals("ODD", l.isOdd().apply(3));
		assertNotEquals("ODD", l.isOdd().apply(6));
		assertNotEquals("EVEN", l.isOdd().apply(5));
	}
	
	@Test
	public void isPrime() {
		assertEquals("PRIME", l.isPrime().apply(5));
		assertEquals("COMPOSITE", l.isPrime().apply(8));
		assertNotEquals("PRIME", l.isPrime().apply(9));
		assertNotEquals("COMPOSITE", l.isPrime().apply(7));
	}
	
	@Test
	public void isPalindrome() {
		assertEquals("PALINDROME", l.isPalindrome().apply(898));
		assertEquals("NON PALINDROME", l.isPalindrome().apply(312));
		assertNotEquals("NON PALINDROME", l.isPalindrome().apply(898));
		assertNotEquals("PALINDROME", l.isPalindrome().apply(123));
	}

}
