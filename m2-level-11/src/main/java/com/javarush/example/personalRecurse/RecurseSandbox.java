package com.javarush.example.personalRecurse;

import java.io.File;

public class RecurseSandbox {
    public static void main(String[] args) {
        String tab = "";
        printAll(new File("V:\\Program Files"), tab);
    }

    private static void printAll(File files, String tab) {
        for (File file : files.listFiles()) {
            if (file.isDirectory()) {
                System.out.println(tab + file.getName() + "\\...");
                printAll(file, tab + "\t|");
            } else
                System.out.println(tab + "-" + file.getName());
        }
    }
}
