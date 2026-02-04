package com.javarush.gemini._Theme1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task11 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> {
            System.out.println("Задачу 1: " + Thread.currentThread().getName());
            throw new RuntimeException("Бум!");
        });
        executorService.execute(() -> {
            System.out.println("Задачу 2: " + Thread.currentThread().getName());
        });
        executorService.shutdown();
        // Если запустить через submit(), то уничтожение первого потока не происходит, и он выполняет Задачу 2 тоже. Почему так?
    }
}
