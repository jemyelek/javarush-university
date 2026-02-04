package com.javarush.gemini._Theme1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task01 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                try {
                    System.out.printf("Курьер %s доставляет заказ №%d\n", Thread.currentThread().getName(), finalI);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("заказ №" + finalI + " не обработан.");
                }
            });

        }
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("Работа доставки завершен.");

    }
}
