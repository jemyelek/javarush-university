package com.javarush.personal;

public class UpcastingExample {
    public static void main(String[] args) {

        Wood table = new Table();
        if (table instanceof Wood) System.out.println(table + " instanceof Wood");

        Table table1 = new Table();
        if (table instanceof Wood) {
            System.out.println(table1 + " is instanceof Wood");
            table1.canBurn();
        }
    }
}

class Wood {
    void grow() {
        System.out.println("Wood material is grown");
    }
}

class Tree extends Wood {
    @Override
    public void grow() {
        System.out.println("Tree is growing");
    }
}

class Table extends Wood implements Burnable{
    public void build() {
        System.out.println("Table is from the Wood");
    }

    @Override
    public void canBurn() {
        System.out.println("Table can be burned");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

interface Burnable {
    void canBurn();
}