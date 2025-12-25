package com.javarush.personal;

import java.lang.reflect.InvocationTargetException;

public class EraserTypeDemo {

    static class Box<T> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }

        // We cannot create Generic Type object via 'new T()'
//        public T createItem() {
//            return new T();
//        }


    }
    //Generic class - avoiding eraser class type
    static class SmartBox<T> {
        private final Class<T> clazz;

        public SmartBox(Class<T> clazz) {
            this.clazz = clazz; // saving type of class
        }

        public T createItem() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
            return clazz.getDeclaredConstructor().newInstance();
        }
    }
    static class Cat {

        public Cat(String name) {
            System.out.println("Cat is created!");
        }
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Text");
        System.out.println("Box contains: " + stringBox.getItem());

        SmartBox<Cat> catSmartBox = new SmartBox<>(Cat.class);
        Cat cat1 = catSmartBox.createItem();
        Cat cat2 = catSmartBox.createItem();

    }
}
