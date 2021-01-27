/**
 * 
 */
package com.ss.week1;

import java.math.BigInteger;
import java.util.function.Function;

/**Christian Reyes
 * @author chrel
 * Week 1
 */
public class LambdaExpressions {

	// check if even or odd
	public Function<Integer, String> isOdd(){
		return (n) -> n % 2 == 0 ? "EVEN" : "ODD";
	}
	
	//check if prime number
	public Function<Integer, String> isPrime(){
		return (n) -> BigInteger.valueOf(n).isProbablePrime(1) ? "PRIME" : "COMPOSITE" ;
	}
	
	//check if number is a palindrome
	public Function<Integer, String> isPalindrome(){
		return (n) -> {
			StringBuilder num = new StringBuilder(String.valueOf(n));
			StringBuilder temp = new StringBuilder(num).reverse();
			if(num.compareTo(temp) == 0) {
				return "PALINDROME";
			}
			else {
				return "NON PALINDROME";
			}
			
		};
	}
	

}
