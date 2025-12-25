package com.javarush.personal;

import java.util.Optional;

public class OptionalsDemo {
    public static void main(String[] args) {

        Optional<String > optionalEmpty = Optional.empty();
        Optional<String > optionalFull = Optional.of("Hello");
        Optional<String > optionalNullable = Optional.ofNullable(null);

        System.out.println(optionalEmpty);
        System.out.println(optionalFull);
        System.out.println(optionalNullable);

        optionalFull.ifPresent(value -> System.out.println("Value: " + value));
        optionalEmpty.ifPresent(value -> System.out.println("Empty value: " + value));

        String result = optionalFull.orElse("Default");
        System.out.println(result);
    }
}
