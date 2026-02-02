package com.javarush.gemini._Theme1;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task05 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i < 6; i++) {
            int finalI = i;
            executorService.submit(() -> {
                Random random = new Random();
                int sleepTime = random.nextInt(3);
                try {
                    System.out.println("Task " + finalI + " of " + Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {
            System.out.println("Жду завершения всех задач...");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Прервались...");
            }
        }
        System.out.println("Все задачи выполнены");
    }
}
