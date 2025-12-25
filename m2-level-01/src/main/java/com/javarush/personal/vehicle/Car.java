package com.javarush.personal.vehicle;

public class Car extends Vehicle {

    private int doorsCount;

    public Car(String brand, int maxSpeed, int doorsCount) {
        super(brand, maxSpeed);
        this.doorsCount = doorsCount;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    public void signal() {
        System.out.println(brand + ": Beep!");
    }


}
