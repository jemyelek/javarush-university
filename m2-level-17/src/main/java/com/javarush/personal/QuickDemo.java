package com.javarush.personal;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class QuickDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Object object = new Simple();
        Class<?> clazz = object.getClass();
        System.out.println("Fields: " + clazz.getDeclaredFields().length);
        System.out.println("Interfaces: " + clazz.getAnnotatedInterfaces().length);

        Object newObject = Class.forName("com.javarush.personal.Simple").newInstance();
        Field field = clazz.getDeclaredField("secret");
        field.setAccessible(true);
        field.set(newObject, "New Secret Paragraph");
        Method method = clazz.getMethod("show");
        method.invoke(newObject);
        field.setAccessible(false);

    }
}

class Simple {
    private String secret = "Top secret";
    public void show() {
        System.out.println("Secret text: " + secret);
    }
}
