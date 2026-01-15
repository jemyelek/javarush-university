package com.javarush.example.personal;

public class SimpleThreadExample {

    public static void main(String[] args) throws InterruptedException {
        Printer printer1 = new Printer("Canon LBP2900");
        Printer printer2 = new Printer("Samsung MLX");
        Thread thread = new Thread(printer1);
        Thread thread2 = new Thread(printer2);
        thread.start();
        thread2.start();

        System.out.println("Lambda:");

        Thread thread3 = new Thread(() -> {
            System.out.println("Lambda thread " + Thread.currentThread().getName());
        });
        thread3.start();

    }

    static class Printer implements Runnable {
        private final String model;

        public Printer(String model) {
            this.model = model;
        }

        @Override
        public void run() {
            System.out.println(model + " is printing pages... " + Thread.currentThread().getName());
        }
    }
}
