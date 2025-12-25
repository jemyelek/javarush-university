package com.javarush.personal.shape;

public class Main {
    public static void main(String[] args) {
        GeoShape rectangle = new Rectangle(3.8, 4.5);
        rectangle.calculateArea();
        rectangle.calculatePerimeterArea();

        rectangle.getInfo();
    }
}
