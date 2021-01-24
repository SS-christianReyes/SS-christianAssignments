/**
 * 
 */
package com.ss;

/**Christian Reyes
 * @author chrel
 * Assignment 1 - Patterns
 * 
 */
public class Patterns {
	
	public static void main(String[] args) {
		
		// Pattern 1
		System.out.println("1)");
		for(int i = 1; i <= 4; i++) 
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
	
			System.out.println();
		}
		
		// Pattern 2
		System.out.println("2)");
		for(int i = 4; i >= 1; i--) 
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Pattern 3
		System.out.println("3)");
		for(int i = 4, c = 1; i >= 1; i--,c+=2) 
		{
			for(int j = 1; j <= i - 1; j++) //loop for spaces left of *
			{
				System.out.print(" ");
			}
			
			for(int k = 1; k <= c ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Pattern 4
		System.out.println("4)");
		for(int i = 1, c = 7; i <= 4; i++,c-=2) 
		{
			for(int j = 1; j <= i - 1; j++) //loop for spaces left of *
			{
				System.out.print(" ");
			}
			
			for(int k = 1; k <= c ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
