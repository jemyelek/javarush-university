package com.javarush.personal;

import java.util.concurrent.SynchronousQueue;

public class SynchronizedQueueDemo {
    public static void main(String[] args) {
        String[] items = {"Task 1", "Task 2", "Task 3", "Task 4", "Task 5"};
        SynchronousQueue<String> queue = new SynchronousQueue<>();

        //Producer Thread
        Thread producer = new Thread(() -> {
            for (String item : items) {
                System.out.println("Producer: Trying to put " + item);
                try {
                    queue.put(item);
                    System.out.println("Producer passed an item successfully!");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        //Consumer Thread
        Thread consumer  = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Consumer: Trying to get item...");
                try {
                    String item = queue.take();
                    Thread.sleep(500);
                    System.out.println("Consumer took an item " + item);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
