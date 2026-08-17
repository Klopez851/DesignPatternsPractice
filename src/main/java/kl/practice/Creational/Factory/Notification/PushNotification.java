package kl.practice.Creational.Factory.Notification;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Push notification");
        System.out.println(message);
    }
}
