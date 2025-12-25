package com.javarush.personal.shape;

public abstract class GeoShape {
    public abstract double calculateArea();
    public abstract double calculatePerimeterArea();

    public void getInfo() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeterArea());
    }
}
