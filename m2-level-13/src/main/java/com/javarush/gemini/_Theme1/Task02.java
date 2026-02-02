package com.javarush.gemini._Theme1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task02 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 0; i < 50; i++) {
            service.submit(() -> {
                try {
                    System.out.printf("Обработка котировки... %s\n", Thread.currentThread().getName());
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        Thread.sleep(65_000);
        for (int i = 0; i < 50; i++) {
            service.submit(() -> {
                try {
                    System.out.printf("Новая обработка котировки... %s\n", Thread.currentThread().getName());
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        service.shutdown();
        System.out.println("Executor Service stopped.");
    }
}
