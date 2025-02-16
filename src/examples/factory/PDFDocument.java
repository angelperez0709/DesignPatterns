package examples.factory;

public class PDFDocument implements Document {
    public PDFDocument() {

    }

    @Override
    public void print() {
        System.out.println("Printing pdf document");
    }
}
