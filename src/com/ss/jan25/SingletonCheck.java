/**
 * 
 */
package com.ss.jan25;

/**Christian Reyes
 * @author chrel
 * Assignment 4 - Singleton Double Check
 */
public class SingletonCheck {

	/**
	 * @param args
	 */
	volatile private static SingletonCheck instance = null;

	private SingletonCheck() {

	}

	public static SingletonCheck getInstance() {
		if (instance == null) {
			synchronized (SingletonCheck.class) {
				if (instance == null) {
					instance = new SingletonCheck();
				}
			}
		}
		return instance;
	}
	
	public void print() {
		System.out.println("Singleton working.");
	}

}
