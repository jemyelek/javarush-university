package com.javarush.personal;

import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractList;
import java.util.ArrayList;

public class QuickDemo {

    public static void main(String[] args) {

        Thread thread = new Thread() {
            public void run() {
                System.out.println("Ananemous thread");
            }
        };
        thread.start();

        new Thread() {
            public void run() {
                System.out.println("Second ananimos thread");
            }
        }.start();
    }

    AbstractList<String> list = new ArrayList<>();
    Integer integer = 100;
    InputStream inputStream = new InputStream() {
        @Override
        public int read() throws IOException {
            return 0;
        }
    };
}
