package com.javarush.personal.drawable;

public abstract class Shape {
    protected String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public void setColor(String color) {
        this.color = color;
        System.out.println("Color changed to " + color);
    }
}
