package com.javarush.personal.parent;

public interface InterEngineer {

    default void move() {
        System.out.println("Programmer...");
    }
}
