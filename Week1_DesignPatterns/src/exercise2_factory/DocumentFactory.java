package exercise2_factory;

public abstract class DocumentFactory {
    // This is the actual Factory Method
    public abstract Document createDocument();

    // Factories can also contain business logic that uses the created object!
    public void createAndOpenDocument() {
        Document doc = createDocument();
        doc.open();
    }
}