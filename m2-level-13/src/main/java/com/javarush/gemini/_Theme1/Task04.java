package com.javarush.gemini._Theme1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

public class Task04 {
    private static int counter;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(() -> {
            try {
                System.out.println("Task " + counter++);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.shutdown();
        try {
            executorService.submit(() -> {
                System.out.println("Успел?");
            });
        } catch (RejectedExecutionException e) {
            System.out.println("Не успел, поток уже закрыт.");;
        }
    }
}
