import java.util.Scanner;

public class cpm {
    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {
        // First check length
        if (s1.length() != s2.length()) {
            return false;
        }
        // Compare each character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare manually using charAt()
        boolean manualResult = compareUsingCharAt(str1, str2);
        System.out.println("Manual comparison using charAt(): " + manualResult);

        // Compare using built-in equals()
        boolean builtInResult = str1.equals(str2);
        System.out.println("Built-in equals() comparison: " + builtInResult);

        // Check if both results match
        if (manualResult == builtInResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results differ (should not happen unless bug).");
        }

        sc.close();
    }
}
