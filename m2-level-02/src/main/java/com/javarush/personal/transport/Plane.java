package com.javarush.personal.transport;

public class Plane extends Transport{
    @Override
    void move() {
        System.out.println("Can move and can fly. Speed even faster than car");
    }

    @Override
    public void beep() {
        super.beep();
        System.out.println("Tuuudut...");
    }
}
