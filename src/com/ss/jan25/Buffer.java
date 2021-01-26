/**
 * 
 */
package com.ss.jan25;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**Christian Reyes
 * @author chrel
 * Assignment 4 - Producer-Consumer
 */
public class Buffer {
	
	private static BlockingQueue<Integer> buffer = new ArrayBlockingQueue<Integer>(10);
	private static Random rand = new Random();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				try {
					produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				try {
					consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		/* Program must be manually terminated after running
		 * 
		 */
		t1.start();
		t2.start();
		
		
	}
	
	public static void produce() throws InterruptedException {
		
		while(true) {
			Thread.sleep(rand.nextInt(1500) + 500);		//producer runs every .5-2 seconds
			Integer val = rand.nextInt(100);			
			buffer.put(val);							//produces a random integer value and puts it in buffer
			System.out.println("Producer produced " + val +", Buffer size is " + buffer.size());
		}
	}
	
	public static void consume() throws InterruptedException
	{
		while(true) {
			Thread.sleep(rand.nextInt(2000) + 1000); 	//consumer runs every 1-3 seconds
			
			Integer val = buffer.take();				//consumer eats from buffer
			System.out.println("Consumer consumed " + val +", Buffer size is " + buffer.size());
		}
	}
	

}
