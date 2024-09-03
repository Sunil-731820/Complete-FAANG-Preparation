package com.java.dsa.exceptions;

class Counter implements Runnable {
    private final String threadName;

    public Counter(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Counter("Thread 1"));
        Thread thread2 = new Thread(new Counter("Thread 2"));

        thread1.start(); // Start Thread 1
        thread2.start(); // Start Thread 2

        try {
            thread1.join(); // Wait for Thread 1 to finish
            thread2.join(); // Wait for Thread 2 to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("All threads have completed execution.");
    }
}

