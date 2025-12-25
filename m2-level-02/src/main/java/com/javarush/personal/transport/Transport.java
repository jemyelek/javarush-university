package com.javarush.personal.transport;

abstract class Transport {

    abstract void move();

    public void beep() {
        System.out.println("Beep");
    }

}
