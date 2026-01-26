package com.javarush.personal;

public class ThreadLocalDemo {

    private static final ThreadLocal<String> user = new ThreadLocal<>();

    public static void main(String[] args) {
        new Thread(() -> {
            user.set("Alis");
            System.out.println("Thread 1: " + user.get());
            user.remove();
        }).start();

        new Thread(() -> {
            user.set("John");
            System.out.println("Thread 2: " + user.get());
            user.remove();
        }).start();

        System.out.println("Main: " + user.get());
    }
}
