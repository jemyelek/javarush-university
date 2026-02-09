package com.javarush.personal;

import java.util.Arrays;
import java.util.List;

public class ImperativeVSDeclarativeDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumImperative = 0;
        for (int num : numbers) {
            if (num % 2 == 0)
                sumImperative += num;
        }
        System.out.println("Sum of even numbers: " + sumImperative);

        int sumDeclarative = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
        System.out.println("Sum of even numbers: " + sumDeclarative);
    }
}
