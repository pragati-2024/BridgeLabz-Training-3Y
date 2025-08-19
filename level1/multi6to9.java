import java.util.*;
public class multi6to9{
    public static void main(String[] args){
        // Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
        // Hint => 
        // Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
        // Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
        // Finally, display the result from the array in the format number * 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want the multiplication table:");
        int num = sc.nextInt();
        int[] multiplicationResult = new int[7];
        for(int i=6; i<=9; i++){
            multiplicationResult[i-6] = num * i;
        }
        for(int i=0; i<multiplicationResult.length; i++){
            System.out.println(num + " x " + (i+6) + " = " + multiplicationResult[i]);
        }
        sc.close();
        
    }
}