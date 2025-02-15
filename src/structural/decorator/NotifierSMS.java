package structural.decorator;

public class NotifierSMS extends NotifierDecorator {
    public NotifierSMS(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String text) {
        super.send(text);
        sendSMS(text);
    }

    public void sendSMS(String text) {
        System.out.println("Sending SMS: " + text);
    }
}
