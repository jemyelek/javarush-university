package com.javarush.personal.interfaces;

public class Driver {
    public void driver(Vehicle vehicle){
        System.out.println("Driver:");
        vehicle.startEngine();
    }
}
