import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {
    @Test
    public void testExternalApi() {
        // 1. Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // 2. Stub the method to return "Mock Data"
        when(mockApi.getData()).thenReturn("Mock Data");

        // 3. Write the test case using the mock
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
}