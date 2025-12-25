package com.javarush.personal.parent;

public class Person extends CreatePerson {

    public static void main(String[] args) {
        CreatePerson person = new Person();
        person.move();
    }

}
