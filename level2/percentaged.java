import java.util.*;

public class percentaged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                int m = sc.nextInt();
                if (m < 0) {
                    System.out.println("Marks cannot be negative. Re-enter Student " + (i + 1));
                    i--;
                    break;
                }
                marks[i][j] = m;
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;
            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 50)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }

        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    ": Physics=" + marks[i][0] +
                    ", Chemistry=" + marks[i][1] +
                    ", Maths=" + marks[i][2] +
                    " | Percentage=" + percentage[i] +
                    "% | Grade=" + grade[i]);
        }

        sc.close();
    }
}
