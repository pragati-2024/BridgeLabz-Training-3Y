import java.util.Scanner;

public class LowerCase {

    // Method 1: Convert string to lowercase using charAt() and ASCII logic
    public static String customToLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert uppercase to lowercase
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

        // Convert to lowercase using custom method
        String customLower = customToLowerCase(text);
        System.out.println("Custom lowercase: " + customLower);

        // Convert to lowercase using built-in method
        String builtInLower = text.toLowerCase();
        System.out.println("Built-in lowercase: " + builtInLower);

        // Compare both results
        boolean isEqual = compareStrings(customLower, builtInLower);
        System.out.println("Do both methods produce the same result? " + isEqual);

        sc.close();
    }
}
