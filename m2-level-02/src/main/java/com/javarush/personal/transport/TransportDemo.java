package com.javarush.personal.transport;

public class TransportDemo {
    public static void main(String[] args) {
        Transport transport = new Car();
        Transport plane = new Plane();

        Transport[] transports = {transport, plane};

        for (Transport transport1 : transports) {
            transport1.beep();
            transport1.move();
        }
    }
}
