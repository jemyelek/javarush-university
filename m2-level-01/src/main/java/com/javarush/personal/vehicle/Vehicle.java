package com.javarush.personal.vehicle;

public class Vehicle {

    protected String brand;
    protected int maxSpeed;

    public Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void startEngine() {
        System.out.println(brand + ": Start engine...");
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + maxSpeed);
    }

}
