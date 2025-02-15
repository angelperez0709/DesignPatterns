package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new BaseNotifier();

        //Adding decorators
        Notifier notifierSMS = new NotifierSMS(notifier);
        Notifier notifierEmail = new NotifierEmail(notifierSMS);
        notifierEmail.send("Holaaa");
        notifierSMS.send("Holaa 2");
    }
}
