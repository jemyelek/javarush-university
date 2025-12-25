package com.javarush.personal.technics;

abstract class Printer {

    protected abstract void printDoc();

    public abstract Object getConfiguration();

    public abstract String getType();
}
