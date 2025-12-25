package com.javarush.personal.parent;

public interface InterMusician {
    default void move() {
        System.out.println("Piano playing...");
    }
}
