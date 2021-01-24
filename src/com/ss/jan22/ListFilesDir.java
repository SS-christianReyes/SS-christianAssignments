/**
 * 
 */
package com.ss.jan22;
import java.io.File;

/**Christian Reyes
 * @author chrel
 * Assignment 3 - Files/Directory List
 */
public class ListFilesDir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//path to directory
		String path = "./resources";
		
		ListFilesDir lf = new ListFilesDir();
		File[] files = lf.getList(path);
		
		if(files == null)
		{
			System.out.print("Something went wrong / Directory doesn't exist");
		}
		else {
			lf.displayFileList(files);
		}
	}
	
	/**
	 * 
	 * @param path - path to the given directory
	 * @return list of files
	 */
	public File[] getList(String path){
		File f = new File(path);
		return f.listFiles();
	}

	/**
	 * 
	 * @param list of files
	 */
	public void displayFileList(File[] files) 
	{
		for(File file : files)
		{
			System.out.println(file.getName());
		}
	}
	
}
