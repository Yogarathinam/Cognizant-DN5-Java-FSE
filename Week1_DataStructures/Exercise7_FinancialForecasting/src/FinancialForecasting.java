import java.util.HashMap;
import java.util.Map;

public class FinancialForecasting {

    // basic recursion approach
    public static double calculateFutureValue(double currentVal, double rate, int years) {
        if (years == 0) return currentVal;
        return calculateFutureValue(currentVal * (1 + rate), rate, years - 1);
    }

    // using memoization to speed things up and prevent stack issues
    private static Map<Integer, Double> cache = new HashMap<>();

    public static double calculateFutureValueOptimized(double currentVal, double rate, int years) {
        if (years == 0) return currentVal;

        // return cached value if we already calculated this year
        if (cache.containsKey(years)) {
            return cache.get(years);
        }

        double prev = calculateFutureValueOptimized(currentVal, rate, years - 1);
        double result = prev * (1 + rate);

        cache.put(years, result);
        return result;
    }
}