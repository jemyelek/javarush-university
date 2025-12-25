package com.javarush.personal.interfacedemo;

public class Car implements SoundMaker {
    @Override
    public void makeSound() {
        System.out.println("Signal of Car");
    }
}
