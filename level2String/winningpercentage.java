import java.util.Scanner;

public class WinningPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total matches played: ");
        int total = sc.nextInt();

        System.out.print("Enter matches won: ");
        int won = sc.nextInt();

        double winPercentage = (won / (double) total) * 100;

        System.out.println("Total Matches: " + total);
        System.out.println("Matches Won  : " + won);
        System.out.println("Winning %    : " + winPercentage + "%");

        sc.close();
    }
}
