import java.util.*;

public class Bonus {

    // Generate salary (5-digit) and years of service
    public static int[][] generateEmployees(int n) {
        int[][] employees = new int[n][2];
        for (int i = 0; i < n; i++) {
            employees[i][0] = 10000 + (int)(Math.random() * 90000); // salary
            employees[i][1] = 1 + (int)(Math.random() * 15); // years
        }
        return employees;
    }

    // Calculate new salary and bonus
    public static double[][] calculateBonus(int[][] employees) {
        double[][] result = new double[employees.length][2];
        for (int i = 0; i < employees.length; i++) {
            int salary = employees[i][0];
            int years = employees[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] employees = generateEmployees(n);
        double[][] result = calculateBonus(employees);

        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("Salary\tYears\tNewSalary\tBonus");
        for (int i = 0; i < n; i++) {
            int salary = employees[i][0];
            int years = employees[i][1];
            double newSalary = result[i][0];
            double bonus = result[i][1];

            totalOld += salary;
            totalNew += newSalary;
            totalBonus += bonus;

            System.out.println(salary + "\t" + years + "\t" + newSalary + "\t" + bonus);
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
        System.out.println("Total Bonus Paid: " + totalBonus);
    }
}
