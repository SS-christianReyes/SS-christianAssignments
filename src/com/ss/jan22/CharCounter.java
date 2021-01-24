/**
 * 
 */
package com.ss.jan22;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**Christian Reyes
 * @author chrel
 * Assignment 3 - Character counter
 */
public class CharCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CharCounter c = new CharCounter();
		//path to txt file
		String path = "./resources/charcounter.txt";
		
		if(args.length == 1 && args[0].length() == 1 && Character.isLetter(args[0].charAt(0)))
		{
			try {
				System.out.println("The character " + args[0] + " appears " + c.getNumChars(path, args[0]) + " times");
			} catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Enter a character");
		}

	}
	
	/**
	 * 
	 * @param path to txt file
	 * @param character to be counted
	 * @return number of occurrences
	 * @throws IOException
	 */
	public int getNumChars(String path, String charac) throws IOException
	{
		int counter = 0;
		BufferedReader r = new BufferedReader(new FileReader(path));
		String line = r.readLine();
		while(line != null)
		{
			counter += line.chars().filter(ch -> ch == charac.charAt(0)).count();
			line = r.readLine();
		}
		
		r.close();
		return counter;
		
	}

}
