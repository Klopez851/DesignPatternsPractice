package kl.practice.Creational.Factory.NotificationService;

import kl.practice.Creational.Factory.Notification.Notification;
import kl.practice.Creational.Factory.Notification.PushNotification;

public class PushNotificationService extends NotificationService{

    @Override
    protected Notification createNotification() {
        return new PushNotification();
    }
}
