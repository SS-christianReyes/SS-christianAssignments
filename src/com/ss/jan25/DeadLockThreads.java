/**
 * 
 */
package com.ss.jan25;

/**Christian Reyes
 * @author chrel
 * Assignment 4 - DeadLock
 */
public class DeadLockThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Runnable t1, t2;
		DeadLockObj d1 = new DeadLockObj();	//object 1
		DeadLockObj d2 = new DeadLockObj(); //object 2
		
		
		//define thread 1
		t1 = new Runnable() {		

			@Override
			public void run() {
				try {
					synchronized (d1) {	//thread 1 locks object 1
						Thread.sleep(100);
						synchronized (d2) { //tries to get object 2
							System.out.println("Thread 1 is running");

						}

					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		};
		
		//define thread 2
		t2 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (d2) {		//thread 2 locks object 2
						Thread.sleep(100);
						synchronized (d1) {	//tries to get object 1
							System.out.println("Thread 2 is running");

						}

					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		};
		
		System.out.println("Start DeadLock, program must be manually terminated");
		new Thread(t1).start();
		new Thread(t2).start();
		

	}

}
