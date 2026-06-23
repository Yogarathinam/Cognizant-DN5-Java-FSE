package exercise1_singleton;

public class Logger {


    private static volatile Logger instance;

    // Private constructor so no other class can do 'new Logger()'
    private Logger() {

        if (instance != null) {
            throw new IllegalStateException("Use getInstance() to create the instance.");
        }
    }

    // Public method to provide global access to the instance
    public static Logger getInstance() {
        // First check: if instance exists, return it immediately
        if (instance == null) {
            // Second check: Synchronize only if instance is null to ensure thread-safety
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}