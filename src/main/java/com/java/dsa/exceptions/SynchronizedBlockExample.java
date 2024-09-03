package com.java.dsa.exceptions;



public class SynchronizedBlockExample {

	private static int counter = 0;
	
	public void incrementNumberByone() {
		synchronized (this) {
			counter++;
			System.out.println("The Counter value is :"+counter);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("This is The Example of the SynchronizedBlockExample :");
		
		SynchronizedBlockExample blockExample = new SynchronizedBlockExample();
		blockExample.incrementNumberByone();
		
		System.out.println("Now Making the use With threads");
		
		Runnable task = () -> {
			for(int i=0;i<5;i++) {
				blockExample.incrementNumberByone();
			}
		};
		
		Thread th1 = new Thread(task);
		Thread th2 = new Thread(task);
		
		th1.start();
		System.out.println("After one Thread is completed ");
		th2.start();
		System.out.println("After Second thread is completed ");
	}

}
