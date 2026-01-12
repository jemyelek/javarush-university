package com.javarush.example.personal;

public class CloneExample {

    static class Address {
        String city;

        Address(String city) {
            this.city = city;
        }


    }

    static class Person implements Cloneable {
        String name;
        Address address;

        Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Warsaw");
        Person personOriginal = new Person("Chack", address);

        Person personClone = (Person) personOriginal.clone();

        System.out.println("Original: " + personOriginal.address.city);
        System.out.println("Clone: " + personClone.address.city);

        personClone.address.city = "Check";

        System.out.println("Original: " + personOriginal.address.city);
        System.out.println("Clone: " + personClone.address.city);
    }
}
