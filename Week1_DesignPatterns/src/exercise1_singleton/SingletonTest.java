package exercise1_singleton;

public class SingletonTest {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Testing functionality
        logger1.log("First log attempt.");
        logger2.log("Second log attempt.");


        if (logger1 == logger2) {
            System.out.println("SUCCESS: Only one instance exists.");
        } else {
            System.out.println("FAILURE: Multiple instances created.");
        }
    }
}