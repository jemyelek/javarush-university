package com.javarush.personal;

public class SynchronizedDemo {

    private int counter = 0;

    public void increment() {
            counter++;
    }

    public synchronized void incrementSync() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedDemo demo = new SynchronizedDemo();

        Runnable task = () -> {
            for (int i = 0; i < 10_000; i++) {
                demo.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Without synchronize: " + demo.counter);
        demo.counter = 0;

        Runnable safeTask = () -> {
            for (int i = 0; i < 10_000; i++) {
                demo.incrementSync();
            }
        };

        Thread thread3 = new Thread(safeTask);
        Thread thread4 = new Thread(safeTask);
        thread3.start();
        thread4.start();

        thread3.join();
        thread4.join();

        System.out.println("Synchronized: " + demo.counter);
    }

}
