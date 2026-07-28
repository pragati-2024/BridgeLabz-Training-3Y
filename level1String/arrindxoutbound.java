import java.util.Scanner;

public class ArrindxoutBound {
    // Method 1: Exception generate karna (without handling)
    public static void generateException(String[] names) {
        System.out.println("\n--- Generating ArrayIndexOutOfBoundsException ---");
        // Yahan index intentionally galat le rahe hain
        System.out.println(names[10]);  // Array length se bada index access
    }

    // Method 2: Exception handle karna (with try-catch)
    public static void handleException(String[] names) {
        System.out.println("\n--- Handling ArrayIndexOutOfBoundsException ---");
        try {
            System.out.println(names[10]);  // Again galat index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
        System.out.println("Program continues after handling exception...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // 1. Call method that throws exception without handling
        // (Iske baad program ruk jayega agar run karoge)
        // generateException(names);

        // 2. Call method that handles exception
        handleException(names);

        sc.close();
    }
}
