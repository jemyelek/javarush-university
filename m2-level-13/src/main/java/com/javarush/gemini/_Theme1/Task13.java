package com.javarush.gemini._Theme1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task13 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService poolA = Executors.newFixedThreadPool(2);
        ExecutorService poolB = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            poolA.execute(() -> {
                System.out.println("Запрос принят " + Thread.currentThread().getName());
                poolB.execute(() -> {
                    System.out.println("Сохраняю в БД " + Thread.currentThread().getName());
                });
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            });
        }

        poolA.shutdown();
        poolA.awaitTermination(10, TimeUnit.SECONDS);
        poolB.shutdown();
        poolB.awaitTermination(10, TimeUnit.SECONDS);
    }
}
