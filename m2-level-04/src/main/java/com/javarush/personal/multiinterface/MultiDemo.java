package com.javarush.personal.multiinterface;

public class MultiDemo {

    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.fly();
        duck.speak();
        duck.swim();

        Flyable flyable = duck;
        Swimable swimable = duck;
        Speakable speakable = duck;

        flyable.fly();
        swimable.swim();
        speakable.speak();

        Flyable[] fly = {duck, new Flyable() {
            @Override
            public void fly() {
                System.out.println("Flying plane");
            }
        }};

        for (Flyable f : fly) {
            f.fly();
        }

    }
}
