package com.javarush.personal.interfaces;

public class Track implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Track");
    }
}
