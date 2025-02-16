package examples.factory;

public class PlainTextDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PlainTextDocument();
    }
}
