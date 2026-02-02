package com.javarush.personal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class QuickReflectionDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<String> stringClass = String.class;
        System.out.println("Fields: " + stringClass.getDeclaredFields().length);
        System.out.println("Methods: " + stringClass.getDeclaredMethods().length);
        System.out.println("Constructors: " + stringClass.getDeclaredConstructors().length);

        Constructor<?> constructor = stringClass.getConstructor(String.class);
        String str = (String) constructor.newInstance("Hello, Java!");
        System.out.println("\nString: " + str);
    }
}
