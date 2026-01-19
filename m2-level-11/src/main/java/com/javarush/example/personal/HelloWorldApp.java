package com.javarush.example.personal;

import java.util.concurrent.TimeUnit;

public class HelloWorldApp {
    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            try {
                System.out.println("Starting");
                TimeUnit.SECONDS.sleep(4);
                System.out.println("Woke up!");
            } catch (InterruptedException e) {
                System.out.println("Interruption occur.");
            }
        };

        Thread thread = new Thread(task);
        thread.start();
        thread.join();
        System.out.println("Finish!");
    }
}
