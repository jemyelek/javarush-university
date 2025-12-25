package com.javarush.personal.notification;

public interface Notification {

    void send(String message);

    default void sendUrgent(String message) {
        System.out.println("URGENT " + message.toUpperCase());
    }
}
