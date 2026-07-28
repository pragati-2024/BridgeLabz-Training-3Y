import java.util.Scanner;

class Bmi {
    public static String[][] calculateBMI(String[][] hw) {
        String[][] result = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            double height = Double.parseDouble(hw[i][0]) / 100.0; // cm → m
            double weight = Double.parseDouble(hw[i][1]);
            double bmi = weight / (height * height);
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";
            result[i][0] = hw[i][0];
            result[i][1] = hw[i][1];
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");
        for (String[] row : arr) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] hw = new String[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter height (cm) and weight (kg) for person " + (i + 1) + ": ");
            hw[i][0] = sc.next();
            hw[i][1] = sc.next();
        }
        String[][] result = calculateBMI(hw);
        display(result);
    }
}
