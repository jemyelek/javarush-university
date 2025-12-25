package com.javarush.personal.shape;

public class Rectangle extends GeoShape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width + height;
    }

    @Override
    public double calculatePerimeterArea() {
        return 2* (width + height);
    }
}
