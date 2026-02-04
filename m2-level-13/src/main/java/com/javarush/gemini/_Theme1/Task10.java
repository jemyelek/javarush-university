package com.javarush.gemini._Theme1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task10 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executorService.submit(() -> {
                try {
                    System.out.println("Задача № " + finalI + " начала выполняться потоком " + Thread.currentThread().getName());
                    Thread.sleep(2000);
                    System.out.println("Задача №" + finalI + " завершена");
                } catch (InterruptedException e) {
                    System.out.println("Interruption");
                }
            });
        }
        executorService.shutdown();
    }
}
