package com.javarush.personal.interfacedemo;

public class Bell implements SoundMaker {
    @Override
    public void makeSound() {
        System.out.println("Dzin-Dzin!");
    }
}
