package com.javarush.personal.notification;

public class SMSNotifications implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }

    @Override
    public void sendUrgent(String message) {
        System.out.println("SMS SOS: " + message + "!");
    }
}
