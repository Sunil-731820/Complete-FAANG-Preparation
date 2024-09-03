package com.java.dsa.exceptions;

public class VolatileExample {
    private static volatile boolean running = true; // Volatile flag to control thread execution

    public static void main(String[] args) {
        Runnable task = () -> {
            while (running) {
                // Perform some work
                System.out.println("Thread is running...");
                try {
                	System.out.println("Before Calling the Sleep method for 0.5 Second ");
                    Thread.sleep(500); // Simulate work
                    System.out.println("After Sleep Is Done ");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Thread has stopped.");
        };

        Thread thread = new Thread(task);
        System.out.println("Before callibg the Start Methods :");
        thread.start();
        System.out.println("After Start is Done ");
        
        // Let the thread run for a few seconds
        try {
        	System.out.println("Sleeeping for 2 Second Okay");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Stop the thread
        running = false;

        // Wait for the thread to finish
        try {
        	System.out.println("Wait for Other thread to join ");
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread finished.");
    }
}
