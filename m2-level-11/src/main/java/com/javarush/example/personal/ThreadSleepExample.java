package com.javarush.example.personal;

public class ThreadSleepExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        Thread.sleep(3000);
        System.out.println("End");
    }
}
