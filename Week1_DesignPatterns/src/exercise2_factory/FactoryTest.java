package exercise2_factory;

public class FactoryTest {
    public static void main(String[] args) {
        System.out.println("Testing Factory Method Implementation\n");

        // 1. Create a Word Document via its specific factory
        DocumentFactory wordFactory = new WordFactory();
        wordFactory.createAndOpenDocument();
        System.out.println();

        // 2. Create a PDF Document via its specific factory
        DocumentFactory pdfFactory = new PdfFactory();
        pdfFactory.createAndOpenDocument();
        System.out.println();

        // 3. Create an Excel Document via its specific factory
        DocumentFactory excelFactory = new ExcelFactory();
        excelFactory.createAndOpenDocument();

        System.out.println("\nSUCCESS: All document types generated");
    }
}