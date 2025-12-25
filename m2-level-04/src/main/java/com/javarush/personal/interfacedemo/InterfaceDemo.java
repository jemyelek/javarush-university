package com.javarush.personal.interfacedemo;

public class InterfaceDemo {
    public static void main(String[] args) {
        SoundMaker car = new Car();
        SoundMaker bell = new Bell();

        car.makeSound();
        bell.makeSound();

        playSound(car);

    }

    static void playSound(SoundMaker soundMaker){
        System.out.print("Sound: ");
        soundMaker.makeSound();
    }
}
