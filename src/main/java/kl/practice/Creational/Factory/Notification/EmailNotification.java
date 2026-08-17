package kl.practice.Creational.Factory.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Email notification");
        System.out.println(message);
    }
}
