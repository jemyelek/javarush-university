package com.javarush.example.personal;

public class ObjectMethodDemo {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        System.out.println(object1.hashCode());
        System.out.println(object1.toString());
        System.out.println(object1.getClass().getSimpleName());
        System.out.println(object1.equals(object2));


    }
}
