package com.javarush.gemini;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class IntroExecutor {
    public static void main(String[] args) {
        // Создаем пул из 2 потоков
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Поток " + threadName + " выполняет задачу " + taskId);
                try {
                    Thread.sleep(500); // Имитация работы
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        System.out.println("Все задачи отправлены.");

        // Важно: закрываем пул!
        executor.shutdown();

        try {
            // Ждем завершения задач (опционально, если нужно ждать)
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
        System.out.println("Готово.");
    }
}