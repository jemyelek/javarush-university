package com.javarush.personal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalJava {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Linda", "Shon", "Ricky", "Samuel");

        // Old variant
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();
        System.out.println("New era:");
        // New variant
        names.stream()
                .filter(n -> n.length() > 4)
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
