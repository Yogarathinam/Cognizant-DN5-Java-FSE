package exercise2_factory;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Spreadsheet... Initializing cell matrices and formula engines.");
    }

    @Override
    public void close() {
        System.out.println("Recalculating charts and closing Spreadsheet.");
    }
}