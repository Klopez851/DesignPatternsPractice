package kl.practice.Creational.Factory.Notification;

public class SlackNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Slack notification");
        System.out.println(message);
    }
}
