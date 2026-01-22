package com.javarush.personal;

public class RaceConditionDemo {
    static volatile int count = 0;

    public static void main(String[] args) throws InterruptedException {

        // What to run
        Runnable task = () -> {
            for (int i = 0; i < 10_000; i++) {
                System.out.println(++count); //Step 1. read from memory; Step 2. modify; Step 3. write to memory
            }
        };

        //Where to run
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        // Factual run
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }

}
