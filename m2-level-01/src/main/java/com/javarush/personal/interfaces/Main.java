package com.javarush.personal.interfaces;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Car vehicle = new Car();
        Track track = new Track();
        driver.driver(vehicle);
        driver.driver(track);
    }
}
