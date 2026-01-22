package com.javarush.personal;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class VolatileExample {
    private static boolean flag = false;

    private static volatile boolean volatileFlag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (!flag && !Thread.currentThread().isInterrupted()) {

            }

            System.out.println("thread1: " + (flag ? "if true" : "interrupted"));
        });

        thread1.start();
        TimeUnit.SECONDS.sleep(1);

        flag = true;
        thread1.join(500);

        if (thread1.isAlive()) {
            System.out.println("Without volatile - changes invisible");
            thread1.interrupt();
            thread1.join();
        }

        Thread thread2 = new Thread(() -> {
            while (!volatileFlag) {

            }
            System.out.println("thread2: could see true");
        });

        thread2.start();
        TimeUnit.SECONDS.sleep(1);
        volatileFlag = true;
        thread2.join();
        System.out.println("volatile - visibility gurantined");
    }

}
