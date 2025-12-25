package com.javarush.personal;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
    static class Animal {}

    static class Cat extends Animal {

    }

    public static void main(String[] args) {
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());

        //? extends - можно читать
        List<? extends Animal> animals = catList;
        Animal animal = animals.get(0); // чтение возможно
//        animals.add(new Cat()); // не можем читать

        // ? super - можем читать
        List<? super Animal> catList2 = new ArrayList<>();
        catList2.add(new Cat());
        Cat cat = new Cat();
        catList2.add(cat);

//        cat = catList2.get(0); // нельзы получить
        Object o = catList2.get(0); // можно получить


    }
}
