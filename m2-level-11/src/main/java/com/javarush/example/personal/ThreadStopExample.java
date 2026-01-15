package com.javarush.example.personal;

public class ThreadStopExample {

    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        Thread thread =  new Thread(worker);
        thread.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        worker.stop();
        System.out.println("Work is stopping");
        thread.join();

        System.out.println("Main ended");
    }

    static class Worker implements Runnable {
        private volatile boolean running = true;

        public void stop() {
            running = false;
        }

        @Override
        public void run() {
            while (running) {
                System.out.println("Working...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Work interrupted");
                    return;
                }
            }
            System.out.println("Work stopped");
        }
    }
}
