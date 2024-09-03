package com.java.dsa.exceptions;


class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread is Started Running okay ");
	}
	
}

public class ThreadExample {
	public static void main(String[] args) {
		System.out.println("This is The Example of the ThreadExample ");
		
		MyThread myThread = new MyThread();
		myThread.start();
		myThread.run();
	}

}
