package com.javarush.personal.overload;

public class Calculator {

    public int add(int a, int b) {
        System.out.println("Adding " + a + "+" + b);
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("Adding " + a + "+" + b + "+" + c);
        return a + b + c;
    }

    public double add(double a, double b) {
        System.out.println("Adding " + a + "+" + b);
        return a + b;
    }

    public double add(double a, double b, double c) {
        System.out.println("Adding " + a + "+" + b + "+" + c);
        return a + b + c;
    }

    public String add(String a, double b) {
        System.out.println("Adding " + a + "+" + b);
        return a + b;
    }

    public String add(double a, String b) {
        System.out.println("Adding " + a + "+" + b);
        return a + b;
    }

    public void process(int x) {
        System.out.println("Processing (int): " + x);
    }

    public void process(Long x) {
        System.out.println("Processing (int): " + x);
    }
}
