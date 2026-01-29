package com.javarush.personal;

public class Config {

    private static String apiKey = "secret-key-123";

    public static class Database {
        public static void connect() {
            System.out.println("Connecting with API-Key: " + apiKey);
        }
    }

    public static void main(String[] args) {
        Database.connect();
        App app = new App();
        app.start();
    }
}

class App {
    void start() {
        Config.Database.connect();
    }
}