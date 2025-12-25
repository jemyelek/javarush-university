package com.javarush.personal.technics;

public class LaserPrinter extends Printer {
    private String config = "Laser Configuration";

    // protected -> public Расширение видимости (Так можно!)
    @Override
    public void printDoc() {

    }

    // Ссужение типа результата Object -> String
    @Override
    public Object getConfiguration() {
        return config;
    }

    @Override
    public String getType() {
        return "Laser Printer";
    }
}
