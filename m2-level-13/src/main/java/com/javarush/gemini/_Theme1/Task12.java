package com.javarush.gemini._Theme1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task12 {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 50; i++) {
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
        System.out.println(Thread.activeCount());
        executorService.shutdown();
        //newCachedThreadPool сразу создает 50 потоков, и мгновенно выполняет все до sleep. А newFixedThreadPool делит на три этапа, по 10 потоков. В первом случаи очень быстро всё выполняется.
    }
}
