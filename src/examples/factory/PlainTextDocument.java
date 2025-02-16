package examples.factory;

public class PlainTextDocument implements Document {

    public PlainTextDocument() {

    }

    @Override
    public void print() {
        System.out.println("Printing plain text document");
    }
}
