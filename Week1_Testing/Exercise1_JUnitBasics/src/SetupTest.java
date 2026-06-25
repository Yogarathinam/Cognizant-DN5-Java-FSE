import org.junit.Test;
import static org.junit.Assert.*;

public class SetupTest {

    @Test
    public void testJUnitSetup() {
        // verifying that the test engine works
        int initialVal = 10;
        int targetVal = 10;

        assertEquals("The setup should process matches correctly", initialVal, targetVal);
    }
}