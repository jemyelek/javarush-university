package com.javarush.personal;

public class YieldExample {
    public static void main(String[] args) throws InterruptedException {
        
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread 1");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread 2");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread 3");
                Thread.yield();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread 4");
                Thread.yield();
            }
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();
    }
}
