import java.util.*;
public class oevenarray {
    public static void main(String[] args) {
        // Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
        // Hint => 
        // Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
        // Create an integer array for even and odd numbers with size = number / 2 + 1
        // Create index variables for odd and even numbers and initialize them to zero
        // Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
        // Finally, print the odd and even numbers array using the odd and even index
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Invalid input. Please enter a natural number.");
            return;
        }
        int[] odd = new int[num / 2 + 1];
        int[] even = new int[num / 2 + 1];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.println(odd[i]);
        }
        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.println(even[i]);
        }
        sc.close();

    }
}
