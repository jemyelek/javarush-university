package com.javarush.personal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Employee {
    private String name;

    public Employee() {
        this.name = "Nameless";
        System.out.println("Created default name");
    }

    public Employee(String name) {
        this.name = name;
        System.out.println("Created name: " + name);
    }

    public String getName() {
        return name;
    }
}

public class NewInstanceDemo {
    public static void main (String[]args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Employee> constructor = Employee.class.getConstructor();
        Employee employee = constructor.newInstance();
        System.out.println(employee.getName());


    }

}
