import java.util.Scanner;

public class sio {

    // Method 1: Generate StringIndexOutOfBoundsException without handling
    public static void generateException(String text) {
        System.out.println("\n--- Generating StringIndexOutOfBoundsException ---");
        // Access invalid index intentionally
        System.out.println("Character at index 10: " + text.charAt(10));
    }

    // Method 2: Handle StringIndexOutOfBoundsException with try-catch
    public static void handleException(String text) {
        System.out.println("\n--- Handling StringIndexOutOfBoundsException ---");
        try {
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
        System.out.println("Program continues after handling exception...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        
        // 1. Call method that throws exception (crash karega)
        // generateException(text);
        
        // 2. Call method that handles exception (safe execution)
        handleException(text);
        
        sc.close();
    }
}
