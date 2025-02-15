package structural.decorator;

public class BaseNotifier implements Notifier {
    @Override
    public void send(String text) {
        System.out.println("Sending notification: " + text);

    }
}
