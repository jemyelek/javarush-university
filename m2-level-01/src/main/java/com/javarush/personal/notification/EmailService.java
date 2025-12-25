package com.javarush.personal.notification;

public class EmailService implements NotificationService{
    @Override
    public void send(String message, String recipient) {
        System.out.println("Send email to " + recipient);
    }
}
