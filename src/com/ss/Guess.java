/**
 * 
 */
package com.ss;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

/**Christian Reyes
 * @author chrel
 * Assignment 1 - Guessing game
 */
public class Guess {

	public static void main(String[] args) {
		
		//initialize scanner and random generator and 
		Scanner scan = new Scanner(System.in);
		Random randomGenerator = new Random();
		int randomNum = randomGenerator.nextInt(100) + 1;
		
		//set variables
		int chances = 5;
		int guess;
		boolean isGuessed = false;
		
		System.out.println("Guess a number between 1 - 100\nYou win if you get it within 10 of the number\nYou have 5 chances");
		
		do {
			
		System.out.print("What is your guess: "); //ask the user for input
		guess = scan.nextInt();
		
		//check if guess is within 10 if not, reduce chances
		if(Math.abs(guess - randomNum) <= 10)	
		{
			isGuessed = true;
		}
		else {
			chances--; 
			System.out.println("Nope, you have " +chances+" chance(s) left");
		}
			
		}while(isGuessed != true && chances > 0); //loop to keep asking the user
		
		scan.close();
		
		if(isGuessed == true) {
			System.out.println("You got it! The number was " + randomNum); //display if user won
		}
		
		else {
			System.out.println("Sorry, you lost. The number was " + randomNum); //display if user lost
		}
		
	}

}
