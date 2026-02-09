package com.javarush.personal;

import lombok.Data;

@Data
class Human {
    private String name;
    private int age;
    private String email;

}

public class LombokDemo {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.toString());
    }

}
