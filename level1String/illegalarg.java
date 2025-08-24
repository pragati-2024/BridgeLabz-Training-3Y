import java.util.Scanner;

public class illegalarg {

    // Method 1: Generate IllegalArgumentException without handling
    public static void generateException(String text) {
        System.out.println("\n--- Generating IllegalArgumentException ---");
        // start index greater than end index
        System.out.println(text.substring(5, 2));
    }

    // Method 2: Handle IllegalArgumentException using try-catch
    public static void handleException(String text) {
        System.out.println("\n--- Handling IllegalArgumentException ---");
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
        System.out.println("Program continues after handling exception...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // 1. Call method that throws exception (program abruptly stops if uncommented)
        // generateException(text);

        // 2. Call method that handles exception (safe execution)
        handleException(text);

        sc.close();
    }
}