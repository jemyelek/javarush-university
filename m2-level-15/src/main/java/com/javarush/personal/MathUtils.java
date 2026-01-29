package com.javarush.personal;

public class MathUtils {

    public static class Calculator {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

    }

    public static void main(String[] args) {
        System.out.println(MathUtils.Calculator.add(5, 6));
        System.out.println(MathUtils.Calculator.multiply(4, 9));


    }
}
