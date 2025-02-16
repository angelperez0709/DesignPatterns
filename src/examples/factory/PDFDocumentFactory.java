package examples.factory;

public class PDFDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
