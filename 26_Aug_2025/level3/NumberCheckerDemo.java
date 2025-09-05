import java.util.Scanner;

class NumberChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is neon
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int num) {
        int sum = 0, product = 1, n = num;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is automorphic
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return Integer.toString(square).endsWith(Integer.toString(num));
    }

    // Method to check if a number is buzz
    public static boolean isBuzz(int num) {
        return (num % 7 == 0) || (num % 10 == 7);
    }
}

public class NumberCheckerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();

        System.out.println("Prime Number? " + NumberChecker.isPrime(number));
        System.out.println("Neon Number? " + NumberChecker.isNeon(number));
        System.out.println("Spy Number? " + NumberChecker.isSpy(number));
        System.out.println("Automorphic Number? " + NumberChecker.isAutomorphic(number));
        System.out.println("Buzz Number? " + NumberChecker.isBuzz(number));

        sc.close();
    }
}
