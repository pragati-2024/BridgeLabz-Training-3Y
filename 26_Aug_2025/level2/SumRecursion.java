import java.util.Scanner;

public class SumRecursion {

    // Recursive method
    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    // Formula method
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (>0).");
        } else {
            int recursiveSum = sumRecursive(n);
            int formulaSum = sumFormula(n);

            System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);

            if (recursiveSum == formulaSum) {
                System.out.println("Both results match ✅");
            } else {
                System.out.println("Results do not match ❌");
            }
        }
        sc.close();
    }
}
