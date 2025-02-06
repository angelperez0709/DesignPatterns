package Creational;

interface Notification {
    void sendMessage(String text);
}

class NotificationEmail implements Notification {
    public void sendMessage(String text) {
        System.out.println(text);
    }
}

class NotificationSMS implements Notification {
    public void sendMessage(String text) {
        System.out.println(text);
    }
}

abstract class NotificationFactory {
    public abstract Notification createNotification();

    public void notify(String text) {
        Notification notification = createNotification();
        notification.sendMessage(text);
    }
}

class NotificationFactoryEmail extends NotificationFactory {
    public Notification createNotification() {
        return new NotificationEmail();
    }
}

class NotificationFactorySMS extends NotificationFactory {
    public Notification createNotification() {
        return new NotificationSMS();
    }
}


public class FactoryMethod {
    public static void main(String[] args) {
        //The factory method applies the polymorphism, which is mandatory
        NotificationFactory factory;

        //Notification by email
        factory = new NotificationFactoryEmail();
        factory.notify("Sending notification by email");

        //Notification by SMS
        factory = new NotificationFactorySMS();
        factory.notify("Sending notification by SMS");
    }
}
