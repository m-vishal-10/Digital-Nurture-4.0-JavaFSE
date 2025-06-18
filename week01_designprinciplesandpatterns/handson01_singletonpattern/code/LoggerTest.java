package week01_designprinciplesandpatterns.handson01_singletonpattern.code;

public class LoggerTest {
    public static void main(String[] args) {
        // Get singleton instance
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Use logger
        logger1.log("First message");
        logger2.log("Second message");

        // Validate singleton behavior
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton confirmed).");
        } else {
            System.out.println("Different instances found (Singleton failed).");
        }
    }
}
