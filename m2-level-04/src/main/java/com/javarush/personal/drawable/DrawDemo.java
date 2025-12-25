package com.javarush.personal.drawable;

public class DrawDemo {
    public static void main(String[] args) {
        Circle circle = new Circle("Black", 34.5);
        circle.draw();
        System.out.println("Area: " + circle.getArea());
        circle.setColor("Blue");


        Shape shape = new Circle("Green", 12.4);
        shape.getArea();
        System.out.println(shape.color);
        shape.setColor("Red");

        Shape newShape = circle;
        circle.draw();

        Drawable drawable = circle;
        drawable.erase();
        drawable.draw();
    }
}
