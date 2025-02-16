package examples.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create general factory
        DocumentFactory factory;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option: 1-PDF 2-Word 3-Plain text");
        String result = scanner.nextLine();
        //Creating the concrete factory dynamically
        //The plain text document is the default document to simplify the code and checks
        factory = switch (result) {
            case "1" -> new PDFDocumentFactory();
            case "2" -> new WordDocumentFactory();
            default -> new PlainTextDocumentFactory();
        };
        //Executing the concrete object thanks to the previos concrete factory
        factory.print();
    }
}
