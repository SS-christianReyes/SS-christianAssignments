/**
 * 
 */
package com.ss.jan22;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**Christian Reyes
 * @author chrel
 * Assignment 3 - Append Text
 */
public class AppendText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//variable to hold given command line text
		String text = "";
		
		//path to file
		String path = "./resources/file.txt";
		
		//loop through given command line text
		for(String s: args)
		{
			text+=s;
		}
		
		AppendText appendTxt = new AppendText();
		appendTxt.writeToFile(path,text);

	}
	
	/**
	 * 
	 * @param path - path to directory
	 * @param data - text to be appended
	 */
	public void writeToFile(String path, String data) {
		
		try {
			File file = new File("./resources/file.txt");
			file.createNewFile();
			FileWriter fr = new FileWriter(file, true);
			fr.write(data);
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
