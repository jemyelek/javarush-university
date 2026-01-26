package com.javarush.personal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ThreadFactoryDemo {
    public static void main(String[] args) {
        ThreadFactory threadFactory = new ThreadFactory() {
            private int counter = 0;
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setName("MyThread " + ++counter);
                thread.setPriority(Thread.MAX_PRIORITY);
                thread.setUncaughtExceptionHandler((t, e) -> {
                    System.out.println("Exception in Thread " + t.getName() + ": " + e.getMessage());
                });
                return thread;
            }
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor(threadFactory);
        executorService.submit(() -> {
            System.out.println("1. Task is being executed in thread " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
            throw new RuntimeException("Test Thread Exception");
        });

        executorService.submit(() -> {
            System.out.println("2. Task is being executed int thread " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
            throw new RuntimeException("No. 2 Exception in Thread");
        });

        executorService.shutdown();
        System.out.println("Threads are finished.");
    }
}
