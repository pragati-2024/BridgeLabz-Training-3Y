import java.util.*;
public class bmi {
    public static void main(String[] args) {
        // An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
// Hint => 
// Take input for a number of persons
// Create arrays to store the weight, height, BMI, and weight status of the persons
// Take input for the weight and height of the persons
// Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
// Display the height, weight, BMI, and weight status of each person
// Use the table to determine the weight status of the person

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] weightStatus = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight of person " + (i + 1));
            weight[i] = sc.nextDouble();
            System.out.println("Enter height of person " + (i + 1));
            height[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } 
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } 
            else if(bmi[i] >= 2){
                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
            System.out.println("Weight: " + weight[i]);
            System.out.println("Height: " + height[i]);
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
            sc.close();
            }
    }
}
