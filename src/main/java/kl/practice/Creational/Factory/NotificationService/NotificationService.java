package kl.practice.Creational.Factory.NotificationService;

import kl.practice.Creational.Factory.Notification.Notification;

/*
* an abstract class is a class that cannot be instantiated directly, it is meant to act as a blueprint for subclasses.
* it serves as a point of partial abstraction, since an abstract class can contain both abstract and concrete methods
* that get shared by all the subclasses
*/
public abstract class NotificationService {

    public void notifyUser(String message){
        Notification notification = createNotification();
        validateMessage(message);
        log("sending notif");
        notification.send(message);
        log("notif sent");
    }

    public void validateMessage(String message){
        System.out.println("validating message");
        System.out.println("the message: "+message+" is valid");
    }
    public void log(String log){
        System.out.println(log);
    }

    protected abstract Notification createNotification();
}
