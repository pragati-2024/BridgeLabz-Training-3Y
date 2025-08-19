import java.util.*;
public class height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create a program to find the mean height of players present in a football team.
        // Hint => 
        // The formula to calculate the mean is: mean = sum of all elements / number of elements
        // Create a double array named heights of size 11 and get input values from the user.
        // Find the sum of all the elements present in the array.
        // Divide the sum by 11 to find the mean height and print the mean height of the football team
        double[] heights = new double[11];
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Enter the height of player " + (i + 1) + ":");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.println("The mean height of the football team is: " + mean);
        sc.close();


    }
}
