import java.util.Scanner;

public class ReturnC {

    // Method 1: Convert String to char[] without using toCharArray()
    public static char[] customToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    // Method 2: Compare two char arrays manually
    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // 1. Custom method
        char[] customArray = customToCharArray(text);
        System.out.print("Custom method characters: ");
        for (char c : customArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 2. Built-in method
        char[] builtinArray = text.toCharArray();
        System.out.print("Built-in toCharArray() characters: ");
        for (char c : builtinArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 3. Compare both arrays
        boolean result = compareCharArrays(customArray, builtinArray);
        System.out.println("Are both arrays equal? " + result);

        sc.close();
    }
}
