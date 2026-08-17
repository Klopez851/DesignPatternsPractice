package kl.practice.Creational.Factory;

/*
 * FACTORY METHOD EXERCISE: Notification System
 *
 * You are building a system that sends notifications.
 *
 * There are several notification types:
 *
 *     EmailNotification
 *     SMSNotification
 *     PushNotification
 *
 * All notifications implement:
 *
 *     Notification
 *
 *
 * ============================================================
 * GOAL
 * ============================================================
 *
 * The application has a common workflow for sending a
 * notification, but different subclasses should decide which
 * concrete Notification gets created.
 *
 *
 * ============================================================
 * REQUIREMENTS
 * ============================================================
 *
 * 1. Create a Notification interface with:
 *
 *        void send(String message);
 *
 *
 * 2. Create these implementations:
 *
 *        EmailNotification
 *        SMSNotification
 *        PushNotification
 *
 *    Each should implement Notification.
 *
 *
 * 3. Create an abstract NotificationService class.
 *
 *    It should have a method:
 *
 *        public void notifyUser(String message)
 *
 *    This method should:
 *
 *        a. Create a Notification
 *        b. Send the message using that Notification
 *
 *    However, NotificationService itself should NOT decide
 *    which concrete Notification gets created.
 *
 *
 * 4. Give NotificationService an abstract factory method:
 *
 *        protected abstract Notification createNotification();
 *
 *
 * 5. Create these concrete services:
 *
 *        EmailNotificationService
 *        SMSNotificationService
 *        PushNotificationService
 *
 *    Each subclass should decide which Notification it creates.
 *
 *
 * ============================================================
 * EXPECTED STRUCTURE
 * ============================================================
 *
 *
 *              NotificationService
 *                     |
 *          +----------+----------+
 *          |          |          |
 *       Email       SMS        Push
 *       Service     Service     Service
 *          |          |          |
 *          ↓          ↓          ↓
 *       Email       SMS        Push
 *     Notification Notification Notification
 *
 *
 * ============================================================
 * IMPORTANT
 * ============================================================
 *
 * NotificationService should contain the COMMON WORKFLOW.
 *
 * The subclasses should contain the CONCRETE CREATION DECISION.
 *
 * In other words:
 *
 *     Base class → "What do I do with the notification?"
 *
 *     Subclass   → "Which notification do I create?"
 *
 *
 * ============================================================
 * TEST
 * ============================================================
 *
 * Your client code should be able to do:
 *
 *     NotificationService service =
 *         new EmailNotificationService();
 *
 *     service.notifyUser("Your order shipped!");
 *
 *
 * And:
 *
 *     NotificationService service =
 *         new SMSNotificationService();
 *
 *     service.notifyUser("Your order shipped!");
 *
 *
 * The client should NOT need to directly create:
 *
 *     new EmailNotification()
 *     new SMSNotification()
 *     new PushNotification()
 *
 *
 * ============================================================
 * AFTER IMPLEMENTING
 * ============================================================
 *
 * Explain:
 *
 * 1. Why is createNotification() in the base class?
 *
 * 2. Why is its implementation provided by the subclasses?
 *
 * 3. What does NotificationService gain by not knowing the
 *    concrete Notification class?
 *
 * 4. Why is this different from having:
 *
 *       NotificationFactory.create("email")
 *
 *    with an if/else or switch?
 *
 * 5. What would happen if you added SlackNotification?
 */

/*
 * FACTORY METHOD FOLLOW-UP
 *
 * The notification workflow has become more complicated.
 *
 * Every notification now needs to go through this process:
 *
 *     1. Create the notification
 *     2. Validate the message
 *     3. Log that a notification is being sent
 *     4. Send the notification
 *     5. Log that the notification was sent
 *
 *
 * ============================================================
 * CHALLENGE 1
 * ============================================================
 *
 * Modify NotificationService so that notifyUser() performs
 * the entire workflow.
 *
 * The subclasses should ONLY determine which Notification
 * gets created.
 *
 *
 * Conceptually:
 *
 *
 *        NotificationService
 *               |
 *               | notifyUser()
 *               ↓
 *        +--------------+
 *        | common logic |
 *        +--------------+
 *               |
 *               ↓
 *       createNotification()
 *               |
 *               ↓
 *       subclass decides
 *               |
 *               ↓
 *       concrete Notification
 *
 *
 * ============================================================
 * CHALLENGE 2
 * ============================================================
 *
 * Now imagine someone proposes this:
 *
 *
 *     public void notifyUser(String type, String message) {
 *
 *         Notification notification;
 *
 *         if (type.equals("email"))
 *             notification = new EmailNotification();
 *
 *         else if (type.equals("sms"))
 *             notification = new SMSNotification();
 *
 *         else if (type.equals("push"))
 *             notification = new PushNotification();
 *
 *         ...
 *
 *         notification.send(message);
 *     }
 *
 *
 * Explain why this is structurally different from your
 * Factory Method implementation.
 *
 *
 * Specifically answer:
 *
 *     Who decides which concrete object gets created?
 *
 *     Where does that decision live?
 *
 *     What happens to the common workflow?
 *
 *
 * ============================================================
 * CHALLENGE 3 — THE REAL TEST
 * ============================================================
 *
 * Add:
 *
 *     SlackNotification
 *     SlackNotificationService
 *
 * WITHOUT modifying the implementation of:
 *
 *     NotificationService.notifyUser()
 *
 *
 * The base workflow should remain untouched.
 *
 *
 * ============================================================
 * CHALLENGE 4 — THINK LIKE AN ENGINEER
 * ============================================================
 *
 * Imagine the common workflow eventually grows to 50 lines.
 *
 * For example:
 *
 *     validate()
 *     rateLimit()
 *     log()
 *     authenticate()
 *     createNotification()
 *     send()
 *     recordMetrics()
 *     retry()
 *
 * Explain why it becomes valuable for the base class to own
 * this workflow while subclasses only decide what concrete
 * Notification to create.
 *
 *
 * ============================================================
 * FINAL QUESTION
 * ============================================================
 *
 * In your own words:
 *
 * What is Factory Method actually separating?
 *
 * Don't answer:
 *
 *     "It separates object creation."
 *
 * Be more specific.
 *
 * Think in terms of:
 *
 *     WHO decides what gets created?
 *
 *     WHO controls the overall workflow?
 *
 *     WHY is separating those responsibilities useful?
 */

import kl.practice.Creational.Factory.NotificationService.*;

public class Main {

    public static void main(String[] args) {

        NotificationService service = new EmailNotificationService();

        service.notifyUser("ur order shipped");

        service = new SMSNotificationService();

        service.notifyUser("Your order shipped!");

        service = new PushNotificationService();

        service.notifyUser("Your oder has shipped <3");

        service = new SlackNotificationService();

        service.notifyUser("Yet another order being set ur way");
    }
    
}
