// File: SpringSeason.java
import java.util.Scanner;

public class SpringSeason {

    // Method to check if given month and day falls in Spring Season
    public static boolean isSpring(int month, int day) {
        // Spring is from March 20 (3/20) to June 20 (6/20)
        if ((month == 3 && day >= 20 && day <= 31) ||   // March 20 - 31
            (month == 4 && day >= 1 && day <= 30) ||    // April full
            (month == 5 && day >= 1 && day <= 31) ||    // May full
            (month == 6 && day >= 1 && day <= 20)) {    // June 1 - 20
            return true;
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input month and day
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        // Check spring or not
        if (isSpring(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        sc.close();
    }
}
