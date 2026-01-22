package com.javarush.example.personal;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callableTask = () -> {
            System.out.println("Callable is working");
            Thread.sleep(1000);
            return "Result of thread";
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(callableTask);

        System.out.println(future.get());
        executorService.shutdown();
    }
}
