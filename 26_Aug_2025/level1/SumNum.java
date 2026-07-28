// File: SumNum.java
import java.util.Scanner;

public class SumNum {

    // Method to find sum of n natural numbers using loop
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;   // keep adding numbers 1 to n
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Call method
        int result = findSum(n);

        // Output
        System.out.println("Sum of first " + n + " natural numbers = " + result);

        sc.close();
    }
}
