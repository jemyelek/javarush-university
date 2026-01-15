package com.javarush.example.personal;

public class ThreadInterruptExample {

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread thread = new Thread(clock);
        thread.start();

        Thread.sleep(5000);
        thread.interrupt();
        thread.join();

    }
    static class Clock implements Runnable {

        @Override
        public void run() {
            Thread current = Thread.currentThread();
            while (!current.isInterrupted()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Interruption!");
                    current.interrupt();
                }
                System.out.println("Tik");
            }
            System.out.println("Clock Thread Interrupted.");
        }
    }
}
