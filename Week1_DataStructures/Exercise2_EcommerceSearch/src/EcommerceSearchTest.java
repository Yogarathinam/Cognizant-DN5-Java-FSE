import java.util.Arrays;

public class EcommerceSearchTest {
    public static void main(String[] args) {
        System.out.println("E-Commerce Platform Search\n");

        // 1. Setup an unsorted array of products
        Product[] inventory = {
                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Coffee Mug", "Kitchen"),
                new Product(109, "Desk Chair", "Furniture"),
                new Product(102, "Wireless Mouse", "Electronics"),
                new Product(107, "Notebook", "Stationery")
        };

        int target = 109; // Searching for Desk Chair

        // 2. Execute Linear Search
        System.out.println("--- Linear Search ---");
        Product foundLinear = SearchAlgorithms.linearSearch(inventory, target);
        System.out.println("Result: " + (foundLinear != null ? foundLinear : "Not found"));

        // 3. Execute Binary Search
        System.out.println("\n--- Binary Search ---");
        // Must sort before Binary Search
        Arrays.sort(inventory);
        System.out.println("(Inventory sorted successfully...)");

        Product foundBinary = SearchAlgorithms.binarySearch(inventory, target);
        System.out.println("Result: " + (foundBinary != null ? foundBinary : "Not found"));
    }
}