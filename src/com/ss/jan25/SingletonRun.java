/**
 * 
 */
package com.ss.jan25;

/**
 * @author chrel
 *
 */
public class SingletonRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonCheck singleton = SingletonCheck.getInstance();
		singleton.print();

	}

}
