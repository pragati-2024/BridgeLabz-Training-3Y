import java.util.Scanner;

public class UpperCase {

    // Method 1: Convert string to uppercase using charAt() and ASCII logic
    public static String customToUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert lowercase to uppercase
            }
            result += ch;
        }
        return result;
    }

    // Method 2: Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input (complete line)
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Convert to uppercase using custom method
        String customUpper = customToUpperCase(text);
        System.out.println("Custom uppercase: " + customUpper);

        // Convert to uppercase using built-in method
        String builtInUpper = text.toUpperCase();
        System.out.println("Built-in uppercase: " + builtInUpper);

        // Compare both results
        boolean isEqual = compareStrings(customUpper, builtInUpper);
        System.out.println("Do both methods produce the same result? " + isEqual);

        sc.close();
    }
}
