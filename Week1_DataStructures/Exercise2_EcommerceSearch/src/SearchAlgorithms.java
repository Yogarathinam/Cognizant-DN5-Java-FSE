public class SearchAlgorithms {

    // Linear Search: O(N) Time Complexity
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.getProductId() == targetId) {
                return p; // Founded
            }
        }
        return null;
    }

    // Binary Search: O(log N) Time Complexity
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].getProductId() == targetId) {
                return products[mid]; // Founded
            }
            if (products[mid].getProductId() < targetId) {
                left = mid + 1; // Discard left half
            } else {
                right = mid - 1; // Discard right half
            }
        }
        return null;
    }
}