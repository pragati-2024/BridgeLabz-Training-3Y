import java.util.Scanner;

public class Sio {
    public static void generateException(String text) {
        System.out.println("\n--- Generating StringIndexOutOfBoundsException ---");
        System.out.println("Character at index 10: " + text.charAt(10));
    }
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
        handleException(text);
        
        sc.close();
    }
}
