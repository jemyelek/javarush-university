package com.javarush.example.personal;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread low = new Thread(() -> work("Low", 1));
        Thread normal = new Thread(() -> work("Low", 5));
        Thread high = new Thread(() -> work("Low", 10));

        low.setPriority(Thread.MIN_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        normal.start();
        high.start();

        System.out.println(Thread.currentThread().getPriority());
    }

    public static void work(String name, int priority) {
        System.out.println(name + " thread starts, and priority " + Thread.currentThread().getPriority());
    }
}
