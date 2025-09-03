import java.util.Scanner;

public class IllegalArg {
    public static void generateException(String text) {
        System.out.println("\n--- Generating IllegalArgumentException ---");
        System.out.println(text.substring(5, 2));
    }
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
        handleException(text);

        sc.close();
    }
}