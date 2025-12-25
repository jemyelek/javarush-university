package com.javarush.personal.interfaces;

public class Car implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Car");
    }
}
