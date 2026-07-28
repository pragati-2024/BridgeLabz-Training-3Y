import java.util.*;

public class PerfectNumber {

    // Find sum of divisors (excluding number itself)
    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    // Check Perfect Number
    public static boolean isPerfect(int n) {
        return sumOfDivisors(n) == n;
    }

    // Check Abundant Number
    public static boolean isAbundant(int n) {
        return sumOfDivisors(n) > n;
    }

    // Check Deficient Number
    public static boolean isDeficient(int n) {
        return sumOfDivisors(n) < n;
    }

    // Check Strong Number
    public static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    // Factorial helper
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Perfect? " + isPerfect(num));
        System.out.println("Abundant? " + isAbundant(num));
        System.out.println("Deficient? " + isDeficient(num));
        System.out.println("Strong? " + isStrong(num));
    }
}
