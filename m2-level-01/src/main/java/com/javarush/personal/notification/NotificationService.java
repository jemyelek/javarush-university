package com.javarush.personal.notification;

public interface NotificationService {
    void send(String message, String recipient);
}
