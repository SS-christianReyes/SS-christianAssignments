package com.ss.jan25day5;

import java.util.Arrays;
import java.util.List;

/**Christian Reyes
 * @author chrel
 * Assignment 5 - Lambdas
 */
public class Lambdas {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		List<String> arr = Arrays.asList("Short", "Longgg", "Longerrr", "Longestttttt");
		System.out.println(arr);
		
		
		System.out.println("------------Print from shortest to longest--------------");
		arr.stream().sorted((s1,s2) ->{
			if(s1.length() > s2.length()){
				return 1;
			}
			if(s1.length() < s2.length()) {
				return -1;
			}
			return 0;
		}).forEach(System.out::println);
		
		System.out.println("-----------Print from longest to shortest-------------");
		arr.stream().sorted((s1,s2) ->{
			if(s1.length() > s2.length()){
				return -1;
			}
			if(s1.length() < s2.length()) {
				return 1;
			}
			return 0;
		}).forEach(System.out::println);
		
		System.out.println("---------Alphabetically by first character only-----------");
		arr.stream().sorted((s1,s2) ->{
			if(s1.charAt(0) > s2.charAt(0)){
				return 1;
			}
			if(s1.charAt(0) < s2.charAt(0)) {
				return -1;
			}
			return 0;
		}).forEach(System.out::println);
		
		System.out.println("---------------Contain e-------------------");
		arr.stream().sorted((s1,s2) ->{
			if(s1.indexOf("e") > -1){
				return -1;
			}
			return 1;
		}).forEach(System.out::println);
		
		System.out.println("---------------Contain e using helper-------------------");
		arr.stream().sorted((s1,s2) -> orderByE(s1)
		).forEach(System.out::println);
		
		}
	
	
		/**
		 * 
		 * @param s1
		 * @return int
		 */
		public static int orderByE(String s1)
		{
			if(s1.indexOf("e") > -1){
				return -1;
			}
			return 1;
		}
	
	
	

}
