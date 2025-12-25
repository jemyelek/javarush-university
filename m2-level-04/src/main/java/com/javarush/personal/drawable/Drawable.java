package com.javarush.personal.drawable;

public interface Drawable {
    void draw();

    default void erase(){
        System.out.println("Erase figure");
    }
}
