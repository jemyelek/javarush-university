package com.javarush.example.personal;

import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        System.out.println("1. Runnable Tasks:");
        for (int i = 0; i < 3; i++) {
            int taskId = i;
            executorService.execute(() -> {
                System.out.println("\tTask " + taskId + " in the tread " + Thread.currentThread().getName());
            });
        }

        Thread.sleep(100);
        System.out.println("2. Callable Tasks:");
        Future<Integer> future1 = executorService.submit(() -> {
            try {
                Thread.sleep(1000);
                return 10;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Future<Integer> future2 = executorService.submit(() -> {
            try {
                Thread.sleep(500);
                return 20;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("Result 1: " + future1.get());
        System.out.println("Result 2: " + future2.get());

//        executorService.shutdown();

        ExecutorService fixedPool = Executors.newFixedThreadPool(3);
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        ExecutorService single = Executors.newSingleThreadExecutor();

        fixedPool.shutdown();
        cachedPool.shutdownNow();
        single.shutdown();

        boolean terminator = executorService.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("Shut downed? - " + terminator);
        if (!terminator)
            executorService.shutdown();


    }
}
