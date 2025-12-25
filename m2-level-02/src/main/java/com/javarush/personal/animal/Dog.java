package com.javarush.personal.animal;

public class Dog extends Animal {
    private String type;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void type(String type) {
        this.type = type;
    }

    @Override
    void makeSound() {
        System.out.println("Gaw-gaw...");
    }


}
