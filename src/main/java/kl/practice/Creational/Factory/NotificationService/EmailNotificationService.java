package kl.practice.Creational.Factory.NotificationService;

import kl.practice.Creational.Factory.Notification.EmailNotification;
import kl.practice.Creational.Factory.Notification.Notification;

public class EmailNotificationService extends NotificationService{
    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
}
