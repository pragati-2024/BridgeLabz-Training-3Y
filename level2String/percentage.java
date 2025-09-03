import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in 5 subjects: ");
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += sc.nextInt();
        }

        double percentage = (total / 500.0) * 100;
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage  = " + percentage + "%");

        sc.close();
    }
}
