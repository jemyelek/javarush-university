package com.javarush.personal.notification;

// Module for recipients
public class OrderProcessor {
    private NotificationService notification;

    public OrderProcessor(NotificationService notification) {
        this.notification = notification;
    }

    public void processor(String ID, String customer) {
        notification.send(ID, customer);
    }
}
