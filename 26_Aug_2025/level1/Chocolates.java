// File: Chocolates.java
import java.util.Scanner;

public class Chocolates {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // Chocolates each child will get
        int remainder = number % divisor;  // Remaining chocolates
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        // Condition check
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero!");
        } else {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            System.out.println("Each child will get: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        sc.close();
    }
}
