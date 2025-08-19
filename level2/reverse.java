import java.util.*;
public class reverse {
    public static void main(String[] args) {
        // Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
// Hint => 
// Take user input for a number. 
// Find the count of digits in the number. 
// Find the digits in the number and save them in an array
// Create an array to store the elements of the digits array in reverse order
// Finally, display the elements of the array in reverse order 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        int[] digits = new int[count];
        number = sc.nextInt();
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        sc.close();

        

    }
}
