package structural.decorator;

public class NotifierEmail extends NotifierDecorator {
    public NotifierEmail(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String text) {
        super.send(text);
        sendEmail(text);
    }

    public void sendEmail(String text) {
        System.out.println("Sending email: " + text);
    }

}
