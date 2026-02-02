package com.javarush.personal;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    private void log() {
        System.out.println("Done!");
    }
}
public class SimpleMethodDemo {
    public static void main(String[] args) {
        Class<?> clazz = Calculator.class;
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("Method: " + method.getName());
            System.out.println(" Public? " + Modifier.isPublic(method.getModifiers()));
            System.out.println(" Parameters: " + method.getParameterCount());
            System.out.println(" Returns: " + method.getReturnType().getSimpleName());
        }
    }
}
