package com.javarush.personal;

import java.util.ArrayList;

public class ExampleOfInstanceOf {
    public static void main(String[] args) {

        Object[] objects = new Object[] {
                "Text",
                55,
                56.6,
                new ArrayList<>(),
                'C'
        };

        for (Object object : objects) {
            if (object instanceof String) System.out.println(object + " is String");
            if (object instanceof Integer) System.out.println(object + " is Integer");
            if (object instanceof Double) System.out.println(object + " is Double");
            if (object instanceof Character) System.out.println(object + " is Character");
            if (object instanceof ArrayList<?>) System.out.println(object + " is ArrayList");

        }
    }
}
