import java.util.*;
public class fizzbuzz {
    public static void main(String[] args) {
        // Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
        // Hint => 
        // Create a String Array to save the results and 
        // Finally, loop again to show the results of the array based on the index position
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        String[] array = new String[num + 1];
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                array[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                array[i] = "Fizz";
            } else if (i % 5 == 0) {
                array[i] = "Buzz";
            } else {
                array[i] = Integer.toString(i);
            }
        }
        for (int i = 1; i <= num; i++) {
            System.out.println("Position " + i + " = " + array[i]);
        }
        sc.close();
        

    }
}
