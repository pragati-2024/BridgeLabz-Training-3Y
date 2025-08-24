public class NullPointerDemo {

    // Method 1: Generate NullPointerException without handling
    public static void generateException() {
        System.out.println("\n--- Generating NullPointerException ---");
        String text = null;              
        // This line will throw NullPointerException
        System.out.println(text.length()); 
    }

    // Method 2: Handle NullPointerException using try-catch
    public static void handleException() {
        System.out.println("\n--- Handling NullPointerException ---");
        String text = null;  
        try {
            System.out.println(text.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
        System.out.println("Program continues after handling exception...");
    }

    public static void main(String[] args) {
        // 1. Call method that throws exception without handling
        // Uncomment below line to see program crash
        // generateException();

        // 2. Call method that handles exception safely
        handleException();
    }
}
