package com.javarush.personal.multiinterface;

public class Duck implements Flyable, Swimable, Speakable{
    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void speak() {
        System.out.println("Donald Duck is speaking");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim in the lake");
    }
}
