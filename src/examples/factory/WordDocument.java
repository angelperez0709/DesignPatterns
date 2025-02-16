package examples.factory;

public class WordDocument implements Document {
    public WordDocument() {

    }

    @Override
    public void print() {
        System.out.println("Printing word document");
    }
}
