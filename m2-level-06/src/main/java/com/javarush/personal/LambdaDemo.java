package com.javarush.personal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {

    public static void main(String[] args) {
        Comparator<String> oldComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Comparator<String> newComparator = (s1, s2) -> {
            return s1.compareTo(s2);
        };

        List<String> words = new ArrayList<>(Arrays.asList("Sam", "Tom", "Peter", "Carpet"));
        words.sort(oldComparator);
        System.out.println(words);

        words.sort(newComparator);
        System.out.println(words);

    }
}
