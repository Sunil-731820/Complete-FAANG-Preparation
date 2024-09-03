package com.java.dsa.exceptions;


class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Calling the Runnable Interface methods okay");
		
	}
	
}

public class RunnableExample{
	public static void main(String[] args) {
		System.out.println("This is the Example of the RunnableExample :");
		
		MyRunnable runnable = new MyRunnable();
		Thread threa = new Thread(runnable);
		runnable.run();
		threa.start();
	}

}
