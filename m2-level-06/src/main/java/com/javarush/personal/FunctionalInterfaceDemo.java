package com.javarush.personal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Dunk", "Rocket", "Pull", "Single");

        Consumer<String> printer = s -> System.out.println(s);
        words.forEach(printer);

        System.out.println("Link to method:");
        words.forEach(System.out::println);

        Predicate<String> predicate;

        Supplier<String> supplier;

        Function<String, Integer> function;
    }
}
