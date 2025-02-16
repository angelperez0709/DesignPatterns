package examples.factory;

abstract class DocumentFactory {
    public abstract Document createDocument();

    public void print() {
        Document document = createDocument();
        document.print();
    }
}
