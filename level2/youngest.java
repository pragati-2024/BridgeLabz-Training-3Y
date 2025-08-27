import java.util.*;
public class youngest {
    public static void main(String[] args) {
        // Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
        // Hint => 
        // Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
        // Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
        // Finally display the youngest and tallest of the 3 friends
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of friend " + (i + 1));
            age[i] = sc.nextInt();
            System.out.println("Enter height of friend " + (i + 1));
            height[i] = sc.nextDouble();
        }
        int minAge = age[0];
        int minIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < minAge) {
                minAge = age[i];
                minIndex = i;
            }
        }
        
        double maxHeight = height[0];
        int maxIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > maxHeight) {
                maxHeight = height[i];
                maxIndex = i;
            }
            
        }
        System.out.println("Youngest friend is friend " + (minIndex + 1));
        System.out.println("Tallest friend is friend " + (maxIndex + 1));
        sc.close();
        


    }
}
