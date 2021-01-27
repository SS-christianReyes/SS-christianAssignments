/**
 * 
 */
package com.ss.jan25day5;

import java.util.Arrays;
import java.util.List;

/**Christian Reyes
 * @author chrel
 * Assignment 5 - A + Three Letter Filter
 */
public class AThreeLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> arr = Arrays.asList("air", "sky", "earth", "airplane", "and");
		arr.stream().filter(s -> s.startsWith("a") && s.length() == 3).forEach(e -> {
			System.out.println(e);
		});

	}
	

}
