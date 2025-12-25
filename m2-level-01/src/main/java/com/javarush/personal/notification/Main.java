package com.javarush.personal.notification;

public class Main {
    public static void main(String[] args) {
        NotificationService serviceEmail = new EmailService();
        NotificationService serviceSMS = new SmsService();

        OrderProcessor processorEmail = new OrderProcessor(serviceEmail);
        OrderProcessor processorSMS = new OrderProcessor(serviceSMS);

        processorSMS.processor("BD-111", "Alex");
        processorEmail.processor("CM-098", "Sam");
    }
}
