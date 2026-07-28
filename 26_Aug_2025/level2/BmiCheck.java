import java.util.Scanner;

public class BmiCheck {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // convert to meters
        return weight / (heightM * heightM);
    }

    // Method to get BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] members = new double[10][3]; // [weight, height, BMI]
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            members[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            members[i][1] = sc.nextDouble();

            members[i][2] = calculateBMI(members[i][0], members[i][1]);
            status[i] = getBMIStatus(members[i][2]);
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + " -> Weight: " + members[i][0] +
                               " kg, Height: " + members[i][1] + " cm, BMI: " +
                               String.format("%.2f", members[i][2]) +
                               ", Status: " + status[i]);
        }

        sc.close();
    }
}
