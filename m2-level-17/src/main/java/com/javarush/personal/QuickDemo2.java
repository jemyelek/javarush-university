package com.javarush.personal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class QuickDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

        Object object = new SomeClass();
        Class<?> clazz = object.getClass();
        Object newObject = Class.forName("com.javarush.personal.SomeClass").newInstance();

        Constructor<?> constructor = clazz.getDeclaredConstructor();
        SomeClass someClass = (SomeClass) constructor.newInstance();
        someClass.show();

        Field field = clazz.getDeclaredField("secret");
        field.setAccessible(true);
        field.set(newObject, "Top SECRET KEY");
        Method method = clazz.getMethod("show");
        method.invoke(newObject);

    }
}

class SomeClass {
    private String secret = "Secret KEY";

    public void show() {
        System.out.println("SK: " + secret);
    }
}
