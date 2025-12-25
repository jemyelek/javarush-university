package com.javarush.personal.animal;

abstract class Animal {
    private String name;
    private String type;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    public void type(String type){
        this.type = type;
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public String getName() {
        return this.name;
    }

}
