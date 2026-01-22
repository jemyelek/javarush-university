package com.javarush.personal;

public class SyncBlocking {
    private String name1 = "John";
    private String name2 = "Peter";

    // Synchronized block
    public void swap(){
        synchronized (this) {
            String temp = name1;
            name1 = name2;
            name2 = temp;
        }
    }

    // Synchronized method
    public synchronized void swapSync() {
        String temp = name1;
        name1 = name2;
        name2 = temp;
    }



    public static void main(String[] args) throws InterruptedException {
        SyncBlocking sync = new SyncBlocking();
        System.out.println("Name1: " + sync.name1);
        System.out.println("Name2: " + sync.name2);

        Runnable task = () -> {
            for (int i = 0; i < 5_000; i++) {
                sync.swap();
            }
        };

        Runnable taskSync = () -> {
            for (int i = 0; i < 5_000; i++) {
                sync.swapSync();
            }
        };

        Thread thread1 = new Thread(taskSync);
        Thread thread2 = new Thread(taskSync);
        thread1.start();
        thread2.start();

        thread1.join();
        thread1.join();

        System.out.println("Result Name 1: " + sync.name1);
        System.out.println("Result Name 2: " + sync.name2);
    }
}
