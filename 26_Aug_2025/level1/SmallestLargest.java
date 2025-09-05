// File: SmallestLargest.java
import java.util.Scanner;

public class SmallestLargest {

    // Method to find smallest and largest of 3 numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        // Smallest check
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        // Largest check
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();

        // Calling method
        int[] result = findSmallestAndLargest(n1, n2, n3);

        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);

        sc.close();
    }
}
