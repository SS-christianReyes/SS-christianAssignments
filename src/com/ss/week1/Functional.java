/**
 * 
 */
package com.ss.week1;

import java.util.List;
import java.util.stream.Collectors;

/** Christian Reyes
 * @author chrel
 * Week 1
 */
public class Functional {
	
	
	/**
	 * 
	 * @param list of non negative integers
	 * @return list of right most digits
	 */
	public List<Integer> rightMost(List<Integer> arr){
		return arr.stream().map(n -> n % 10).collect(Collectors.toList());
	}
	
	/**
	 * 
	 * @param list of integers
	 * @return list of integers each multiplied by 2
	 */
	public List<Integer> multiplyByTwo(List<Integer> arr){
		return arr.stream().map(n -> n * 2).collect(Collectors.toList());
	}
	
	/**
	 * 
	 * @param list of Strings 
	 * @return list of strings removing x from each 
	 */
	public List<String> removeX(List<String> arr){
		return arr.stream().map(n -> n.replace("x", "")).collect(Collectors.toList());
	}
	
}
