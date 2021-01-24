/**
 * 
 */
package com.ss.jan21;

/**Christian Reyes
 * @author chrel
 * Assignment 2 - 2d Array 
 */
public class MaxArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//initialize variables
		int max = 0;
		int maxCol = 0;
		int maxRow = 0;
		
		//initialize 2d array
		int[][] a = {
				{1,4,6},
				{2,3,5},
				{5,7,3},
				{9,5,4}
		};
		
		//loop through each element of 2d array
		for(int row = 0; row < a.length; row++){
			for(int col = 0; col < a[row].length; col++){
				if(a[row][col] > max) { //check if current element is bigger than recorded max
					max = a[row][col];
					maxRow = row;
					maxCol = col;
				}
			}
		}
		
		System.out.println("Max number is at position ["+maxRow+"]["+maxCol+"] which is " + max);
	
	}

}
