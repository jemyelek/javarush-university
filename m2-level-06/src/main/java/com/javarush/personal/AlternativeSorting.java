package com.javarush.personal;

import java.util.*;

public class AlternativeSorting {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Dick", "Map", "House", "Earth"));
        System.out.println(words);

        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Comparator<String> alphabetComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(words, lengthComparator);
        System.out.println(words);

        Collections.sort(words, alphabetComparator);
        System.out.println(words);

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(words);
    }
}
