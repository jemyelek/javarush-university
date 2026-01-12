package com.javarush.example.personal;

public class MutableImmutableExample {

    static class MutablePerson {
        String name;
        int age;

        public MutablePerson(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    static final class ImmutablePerson {
        private final String name;
        private final int age;

        public ImmutablePerson(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        MutablePerson mutablePerson = new MutablePerson("Clark", 34);
        System.out.println(mutablePerson.name + " " + mutablePerson.age);
        mutablePerson.name = "Tom";
        mutablePerson.age = 35;
        System.out.println(mutablePerson.name + " " + mutablePerson.age);

        ImmutablePerson immutablePerson = new ImmutablePerson("John", 40);
        String JohnName = immutablePerson.name;
        int JohnAge = immutablePerson.age;
        System.out.println(JohnName);
        System.out.println(JohnAge);

    }

}
