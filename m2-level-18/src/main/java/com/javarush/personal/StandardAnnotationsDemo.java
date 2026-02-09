package com.javarush.personal;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

class MathOperations {
    @Deprecated
    public int oldAdd(int a, int b) {
        return a + b;
    }

    public int newAdd(int a, int b) {
        return a + b;
    }

    public final <T> List<T> createList(T... elements) {
        List<T> list = new ArrayList<>();

        for (T element : elements) {
            list.add(element);
        }

        return list;
    }

}

class MathAdvancedOperations extends MathOperations {

    @Override
    public int newAdd(int a, int b) {
        System.out.println("New add operation");
        return super.newAdd(a, b);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public List processData() {
        List list = new ArrayList();
        list.add("Element");
        list.add("Alphabet");
        return list;
    }
}

public class StandardAnnotationsDemo {
    public static void main(String[] args) {
        MathAdvancedOperations math = new MathAdvancedOperations();
        List<String> strings = math.createList("Tree", "Dog", "Crag");
        System.out.println(strings);

        Calculator calculator = ((a, b) -> a + b);
        System.out.println(calculator);

    }
}
