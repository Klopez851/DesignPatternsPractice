package kl.practice.Creational.Factory.NotificationService;

import kl.practice.Creational.Factory.Notification.Notification;
import kl.practice.Creational.Factory.Notification.SlackNotification;

public class SlackNotificationService extends NotificationService{
    @Override
    protected Notification createNotification() {
        return new SlackNotification();
    }
}
