package com.javarush.personal.notification;

public class SmsService implements NotificationService {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending sms to " + recipient);
    }
}
