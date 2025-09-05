import java.util.Scanner;

public class FactorNumber {

    // Method to find factors and return in an array
    public static int[] getFactors(int num) {
        // First loop to count factors
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Initialize array with exact count
        int[] factors = new int[count];
        int index = 0;

        // Second loop to actually save factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to calculate sum of factors
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to calculate product of factors
    public static int productFactors(int[] factors) {
        int product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to calculate sum of squares of factors
    public static int sumOfSquaresFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        // Display factors
        System.out.print("Factors of " + num + " are: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Sum of factors: " + sumFactors(factors));
        System.out.println("Product of factors: " + productFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquaresFactors(factors));

        sc.close();
    }
}
