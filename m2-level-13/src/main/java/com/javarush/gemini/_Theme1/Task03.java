package com.javarush.gemini._Theme1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task03 {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 1000; i++) {
            service.submit(new Task());
        }

        service.shutdown();
        service.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("Service stopped.");

    }

    static class Task implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println(++counter);
            }
        }
    }
}


