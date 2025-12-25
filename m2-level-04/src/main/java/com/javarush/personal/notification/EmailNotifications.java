package com.javarush.personal.notification;

public class EmailNotifications implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
