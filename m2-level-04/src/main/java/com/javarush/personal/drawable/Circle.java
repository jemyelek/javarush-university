package com.javarush.personal.drawable;

public class Circle extends Shape implements Drawable {

    private double radius;
    private static final double PI = Math.PI;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public void draw() {
        System.out.println("Color of circle: " + color + ", radius: " + radius);
    }
}
