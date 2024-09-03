package com.java.dsa.exceptions;

public class SynchronizedMethodExample {
    private int counter = 0;

    // Synchronized method
    public synchronized void incrementCounter() {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public static void main(String[] args) {
        SynchronizedMethodExample example = new SynchronizedMethodExample();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                example.incrementCounter();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}

