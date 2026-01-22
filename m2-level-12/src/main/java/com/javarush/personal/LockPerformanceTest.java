package com.javarush.personal;

import java.util.concurrent.atomic.AtomicInteger;

public class LockPerformanceTest {
    private static final int ITERATIONS = 10_000_000;
    private int syncCounter = 0;
    private final AtomicInteger atomicCounter = new AtomicInteger(0);

    public synchronized void incrementSync() {
        syncCounter++;
    }

    public static void main(String[] args) throws InterruptedException {
        LockPerformanceTest test = new LockPerformanceTest();

        // 1. Тестируем Synchronized
        long startSync = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < ITERATIONS; i++) test.incrementSync();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < ITERATIONS; i++) test.incrementSync();
        });
        t1.start(); t2.start();
        t1.join(); t2.join();
        long endSync = System.currentTimeMillis();

        // 2. Тестируем AtomicInteger
        long startAtomic = System.currentTimeMillis();
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < ITERATIONS; i++) test.atomicCounter.incrementAndGet();
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < ITERATIONS; i++) test.atomicCounter.incrementAndGet();
        });
        t3.start(); t4.start();
        t3.join(); t4.join();
        long endAtomic = System.currentTimeMillis();

        System.out.println("Synchronized: " + (endSync - startSync) + " ms");
        System.out.println("AtomicInteger: " + (endAtomic - startAtomic) + " ms");
    }
}
