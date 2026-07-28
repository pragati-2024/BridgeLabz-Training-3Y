import java.util.Scanner;

public class Nfe{

    // Method 1: Generate NumberFormatException without handling
    public static void generateException(String text) {
        System.out.println("\n--- Generating NumberFormatException ---");
        int num = Integer.parseInt(text); // Agar text numeric nahi hai → exception
        System.out.println("Parsed number: " + num);
    }

    // Method 2: Handle NumberFormatException using try-catch
    public static void handleException(String text) {
        System.out.println("\n--- Handling NumberFormatException ---");
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
        System.out.println("Program continues after handling exception...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to parse as integer: ");
        String text = sc.next();

        // 1. Call method that throws exception (crash karega agar uncommented)
        // generateException(text);

        // 2. Call method that handles exception (safe execution)
        handleException(text);

        sc.close();
    }
}
