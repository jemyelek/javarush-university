package com.javarush.gemini._Theme1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task14 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> {
            System.out.println("Задачу: " + Thread.currentThread().getName());
        });
        executorService.shutdown();
        System.out.println(executorService.isShutdown()); //true
        System.out.println(executorService.isTerminated()); //false
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println(executorService.isShutdown()); //true
        System.out.println(executorService.isTerminated()); //true
        //Да, я не заметил последние части задачи, извиняюсь. Значит команда shutdown изменяет состояние потока isShutdown на ture СРАЗУ. А isTerminated пока не true, так как поток еще не завершил задачу и pool не был уничтожен. А после ожидания всё он был уничтожен.
    }
}
