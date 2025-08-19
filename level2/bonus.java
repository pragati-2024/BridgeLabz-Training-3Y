import java.util.*;
public class bonus {
    public static void main(String[] args) {
        // Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
// Hint => 
// Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
// Define a double array to save salary and years of service for each of the 10 employees
// Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
// Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
// Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
// Print the total bonus payout as well as the total old and new salary of all the employees
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary of employee " + (i + 1));
            salary[i] = sc.nextDouble();
            System.out.println("Enter years of service of employee " + (i + 1));
            yearsOfService[i] = sc.nextDouble();
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
        sc.close();
        

    }

}
