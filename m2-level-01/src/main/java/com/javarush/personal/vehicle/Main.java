package com.javarush.personal.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle track = new Vehicle("Track", 110);
        track.startEngine();
        track.printInfo();

        Car car = new Car("Toyota", 180, 4);
        car.startEngine();
        car.signal();
        car.printInfo();
    }
}
