package com.javarush.personal;

import java.util.concurrent.TimeUnit;

public class DeadLockExample {

    //Todo Fix the method
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Here is DeadLock");

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("t1 gets lock1");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("Interruption1");
                }

                synchronized (lock2) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("t1 gets lock2");
                    } catch (InterruptedException e) {
                        System.out.println("Interruption2");
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("t2 gets lock2");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.getStackTrace();
                }

                synchronized (lock1) {
                    System.out.println("t2 gets lock1");
                }
            }
        });

        t1.start();
        t2.start();

        Thread.sleep(2000);

        if (t1.isAlive() && t2.isAlive())
            System.out.println("DeadLock");

        t1.interrupt();
        t2.interrupt();
    }
}
