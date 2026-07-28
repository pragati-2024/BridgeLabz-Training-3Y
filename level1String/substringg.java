import java.util.Scanner;

public class Substringg {

    // Method 1: Create substring manually using charAt()
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i); // Add each character manually
        }
        return result;
    }

    // Method 2: Compare two strings manually using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {
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

        // Take user input
        System.out.print("Enter the main string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Using custom method to create substring
        String manualSub = customSubstring(text, start, end);
        System.out.println("Custom substring using charAt(): " + manualSub);

        // Using built-in substring method
        String builtInSub = text.substring(start, end);
        System.out.println("Built-in substring(): " + builtInSub);

        // Compare the two substrings manually and using equals
        boolean manualCompare = compareUsingCharAt(manualSub, builtInSub);
        boolean builtInCompare = manualSub.equals(builtInSub);

        System.out.println("Manual compare using charAt(): " + manualCompare);
        System.out.println("Built-in equals() compare: " + builtInCompare);

        if (manualCompare && builtInCompare) {
            System.out.println("Both methods confirm substrings are equal.");
        } else {
            System.out.println("There is a mismatch (should not happen unless bug).");
        }

        sc.close();
    }
}
