package com.javarush.personal;

import java.util.*;

public class StandardSorting {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Nick", "Dan", "Tom", "Mel", "Stanley", "Роман", "Азим"));
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(names);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(23, 66, 24, 78, 433, 967));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);



    }

}
