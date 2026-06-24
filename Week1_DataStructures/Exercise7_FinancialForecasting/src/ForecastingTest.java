public class ForecastingTest {
    public static void main(String[] args) {
        double startAmount = 10000.0;
        double growth = 0.05; // 5 percent growth
        int years = 10;

        System.out.println("Starting amount: $" + startAmount);

        // test normal recursion
        double val1 = FinancialForecasting.calculateFutureValue(startAmount, growth, years);
        System.out.printf("Normal recursion: $%.2f\n", val1);

        // test optimized version
        double val2 = FinancialForecasting.calculateFutureValueOptimized(startAmount, growth, years);
        System.out.printf("Optimized version: $%.2f\n", val2);
    }
}