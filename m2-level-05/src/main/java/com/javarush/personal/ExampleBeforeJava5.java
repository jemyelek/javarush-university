package com.javarush.personal;

import java.util.ArrayList;

public class ExampleBeforeJava5 {
    public static void main(String[] args) {
/*

        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(" world");
        list.add(23);
        String str = (String) list.get(2);
*/

        ArrayList<String> newList = new ArrayList<>();
        newList.add("Many");
//        newList.add(23); The compile error

        System.out.println(String.class.getClass().getSimpleName());

        Zoo<Animal> tiger = new Zoo<>();
        tiger.setName();

    }


    public static class Zoo<T extends Animal> {
        int doors;
        T name;
        T animalType;

        T getName() {
            return this.name;
        }

        void setName() {
        }
    }

    public static class Animal {
        private final String type;
        private final int age;

        public Animal(String type, int age) {
            this.type = type;
            this.age = age;
        }

        public String getType() {
            return type;
        }
    }

    public static class Name extends Animal {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public Name(String type, int age) {
            super(type, age);
        }

        public String getName() {
            return name;
        }

        @Override
        public String getType() {
            return super.getType();
        }
    }

}
