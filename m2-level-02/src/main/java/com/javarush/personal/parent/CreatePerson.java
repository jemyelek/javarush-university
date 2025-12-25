package com.javarush.personal.parent;

public class CreatePerson implements InterEngineer, InterMusician {
    // Multiple class inheritance does not allowed in Java

    @Override
    public void move() {
        InterEngineer.super.move();
        InterMusician.super.move();
    }
}
