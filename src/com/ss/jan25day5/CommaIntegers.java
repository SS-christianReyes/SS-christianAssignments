package com.ss.jan25day5;

import java.util.Arrays;
import java.util.List;

/**Christian Reyes
 * @author chrel
 * Assignment 5 - Integers with comma
 */
public class CommaIntegers {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder();	//stringbuilder placeholder
		List<Integer> arr = Arrays.asList(1,5,6,4,9);
		arr.forEach(n -> {
			s.append(oddOrEven(n));
		});
		s.deleteCharAt(s.lastIndexOf(","));
		
		System.out.println(s);
		
	}
	
	
	/**
	 * 
	 * @param Integer n
	 * @return Integer appended with e/r + ,
	 */
	public static StringBuilder oddOrEven(Integer n) {
		StringBuilder s = new StringBuilder();
		if(n % 2 == 0) {
			s.append(n + "e,");
		}
		else {
			s.append(n + "o,");
		}
		return s;
		
	}
	

}
