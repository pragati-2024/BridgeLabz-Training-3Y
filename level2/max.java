import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        // Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number 
        // Hint => 
        // In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements. 
        // To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
        // Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        while (number != 0) {
            int digit = number % 10;
            digits[index] = digit;
            index++;
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            number /= 10;
        }
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        sc.close();

    }
}
