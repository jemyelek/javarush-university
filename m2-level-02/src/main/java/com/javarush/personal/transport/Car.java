package com.javarush.personal.transport;

public class Car extends Transport {
    @Override
    void move() {
        System.out.println("Car can move fast.");
    }

    @Override
    public void beep() {
        System.out.println("Pabaaaap...");
    }
}
