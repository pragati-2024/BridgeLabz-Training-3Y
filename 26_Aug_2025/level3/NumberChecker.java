import java.util.Scanner;
import java.util.Arrays;

class NumberCheckerUtil { // Renamed utility class

    // Method to count digits in a number
    public static int countDigits(int num) {
        if (num == 0) return 1;
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Method to store digits of a number in an array
    public static int[] getDigitsArray(int num) {
        int n = countDigits(num);
        int[] digits = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to reverse a digits array
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    // Method to compare two arrays
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is a palindrome using digits
    public static boolean isPalindrome(int num) {
        int[] digits = getDigitsArray(num);
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuck(int num) {
        int[] digits = getDigitsArray(num);
        for (int digit : digits) {
            if (digit != 0) return true; // At least one non-zero digit
        }
        return false; // Only zeros
    }
}

public class NumberChecker{ // Main class with main() method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Count of digits: " + NumberCheckerUtil.countDigits(number));

        int[] digitsArray = NumberCheckerUtil.getDigitsArray(number);
        System.out.print("Digits array: ");
        System.out.println(Arrays.toString(digitsArray));

        int[] reversedArray = NumberCheckerUtil.reverseArray(digitsArray);
        System.out.print("Reversed digits array: ");
        System.out.println(Arrays.toString(reversedArray));

        System.out.println("Is Palindrome? " + NumberCheckerUtil.isPalindrome(number));
        System.out.println("Is Duck Number? " + NumberCheckerUtil.isDuck(number));

        sc.close();
    }
}
