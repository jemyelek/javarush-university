package com.javarush.personal.animal;

public class AbstractDemo {
    public static void main(String[] args) {
//        Animal animal = new Animal("Name") Does not work, abstract cannot have constructor

        Animal animal = new Dog("Goffi");
        animal.type("Dog");
        animal.makeSound();
        animal.sleep();
        System.out.println(animal.getName());
    }
}
