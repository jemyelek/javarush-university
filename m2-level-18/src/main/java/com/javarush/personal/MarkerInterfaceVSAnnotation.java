package com.javarush.personal;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

interface Validatable {

}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface Validated {
    String message() default "Default";
}

class Order implements Validatable {
    private String product;

    public Order(String product) {
        this.product = product;
    }

    public void process() {
        System.out.println("Order service: " + product);
    }

}

@Validated(message = "Client should be checked")
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Client: " + name);
    }
}

public class MarkerInterfaceVSAnnotation {
    public static void main(String[] args) {
        Order order = new Order("Laptop");
        Person client = new Person("Tom");

        if (order instanceof Validatable) {
            System.out.println(" Order might be sent");
            order.process();
        }

        Class<?> clientClass = client.getClass();

        if (clientClass.isAnnotationPresent(Validated.class)) {
            Validated annotation = clientClass.getAnnotation(Validated.class);
            System.out.println(" Annotation found " + annotation.message());
            client.display();
        }
    }
}
