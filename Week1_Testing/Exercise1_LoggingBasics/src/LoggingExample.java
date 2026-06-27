import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    // LoggerFactory binds to the Logback implementation we added
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        // Logging levels in order of severity
        logger.error("This is an error message - Critical failure");
        logger.warn("This is a warning message - Potential issue detected");
        logger.info("This is an info message - System running normally");
    }
}
