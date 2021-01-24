/**
 * 
 */
package com.ss.jan21;

/**Christian Reyes
 * @author chrel
 * Assignment 2 - Commandline addition
 */
public class CommandLineAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//initialize variables
		int sum = 0; 	//variable to hold sum of arguments
		int currentNum; //variable to hold current argument after parsing
		
		//loop through given arguments
		for(String s: args)
		{
			try {
		        currentNum = Integer.parseInt(s); //parse each argument to int
		        sum += currentNum;
		        System.out.println(currentNum); //display current number
		    } catch (NumberFormatException e) {
		        System.err.println("Argument " + s + " must be an integer.");
		    }
		}
		
		System.out.println("Sum of given arguments is " +sum);

	}

}
