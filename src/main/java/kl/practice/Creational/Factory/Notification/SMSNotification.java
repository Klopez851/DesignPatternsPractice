package kl.practice.Creational.Factory.Notification;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS Notification");
        System.out.println(message);
    }
}
