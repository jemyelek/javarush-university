package com.javarush.personal;

import java.util.ArrayList;

public class MethodGenericDemo {

    static <T> T getMiddle(T[] array) {
        return array[array.length / 2];
    }

    static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0
                ? a
                : b;
    }

    public static void main(String[] args) {
        String[] words = {"Java", "Python", "C++"};
        System.out.println("Middle: " + getMiddle(words));
        System.out.println("Max (20 and 45): " + max(20, 45));
        System.out.println("Chars: " + max("B", "A"));
    }

}
