package com.javarush.personal.notification;

public class NotifDemo {
    public static void main(String[] args) {
        Notification emailNotif = new EmailNotifications();
        Notification smsNotif = new SMSNotifications();

        emailNotif.send("jimy.jw@gmail.com");
        smsNotif.send("Emoji SMS");

        emailNotif.sendUrgent("Server is unavailable!");
        smsNotif.sendUrgent("SMS Provider is out of range");
    }
}
