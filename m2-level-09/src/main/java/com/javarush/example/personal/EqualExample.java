package com.javarush.example.personal;

import java.util.Objects;

public class EqualExample {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (this.getClass() != obj.getClass()) return false;

            Person person = (Person) obj;

            return age == person.age && Objects.equals(name, person.name);
        }

    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 32);
        Person person2 = new Person("Tim", 45);
        Person person3 = new Person("Tim", 45);

        System.out.println(person1.equals(person2));
        System.out.println(person2.equals(person3));
    }
}
