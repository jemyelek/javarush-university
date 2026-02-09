package com.javarush.personal;

import java.io.Serializable;

interface Loggable {
    // No methods
}

interface Cashable {

}

class User implements Serializable, Cloneable, Loggable {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


public class MarkerInterfaceDemo {

    public static void main(String[] args) {
        User user = new User("John", 23);

        if (user instanceof Serializable) {
            System.out.println("Class implements Serializable");
        }
        if (user instanceof Cloneable) {
            System.out.println("Class implements Cloneable");
        }
        if (user instanceof Loggable) {
            System.out.println("Class implements Loggable");
        }
    }
}

