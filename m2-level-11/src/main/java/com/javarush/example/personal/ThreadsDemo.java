package com.javarush.example.personal;

import java.util.Random;

public class ThreadsDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Task("Tom"));
        Thread thread2 = new Thread(new Task("Jim"));
        System.out.println("Start");
        thread1.start();
        System.out.println("Joining... " + thread1.getThreadGroup());

        thread1.join();
        thread2.start();

        System.out.println("Joining... " + thread1.getThreadGroup());
        thread2.join();

        System.out.println("Cores: " + Runtime.getRuntime().availableProcessors());
        System.out.println();

        // using Random
        for (int i = 0; i < 10; i++) {
            new Thread(new Task("" + new Random())).start();
        }

        System.out.println();
        Work work = new Work();
        work.start();
    }

    public static class Work extends Thread {
        private static int step;

        @Override
        public void run() {
            System.out.println("Step " + ++step);
        }
    }

    public static class Task implements Runnable {
        private static int counter = 0;
        private final String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("Thread " + name + " starts running... - " + counter++);
        }
    }


}
