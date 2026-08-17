package kl.practice.Creational.Factory.NotificationService;

import kl.practice.Creational.Factory.Notification.Notification;
import kl.practice.Creational.Factory.Notification.SMSNotification;

public class SMSNotificationService extends NotificationService{
    @Override
    protected Notification createNotification() {
        return new SMSNotification();
    }
}
