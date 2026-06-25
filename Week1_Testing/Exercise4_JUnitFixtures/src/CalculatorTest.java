import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    // Setup: runs before every test to initialize the object
    @Before
    public void setUp() {
        calc = new Calculator();
    }

    // Teardown: runs after every test to clean up
    @After
    public void tearDown() {
        calc = null;
    }

    @Test
    public void testAdd() {
        // AAA Pattern:
        // 1. Arrange: Define your inputs
        int x = 10;
        int y = 20;

        // 2. Act: Call the method
        int result = calc.add(x, y);

        // 3. Assert: Verify the outcome
        assertEquals(30, result);
    }
}