import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] seat = new String[5][10];
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 10; col++) {
                seat[row][col] = "A"; 
            }
        }

        System.out.print("Kitne log ek sath seat chahte ho? : ");
        int group = sc.nextInt();

        boolean booked = false;

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col <= 10 - group; col++) {
                boolean free = true;
                for (int k = 0; k < group; k++) {
                    if (!seat[row][col + k].equals("A")) {
                        free = false;
                        break;
                    }
                }
                if (free) {
                    for (int k = 0; k < group; k++) {
                        seat[row][col + k] = "B";
                    }
                    booked = true;
                    System.out.println(group + " log ke liye seat book ho gayi: Row " + (row + 1) + ", Seat " + (col + 1));
                    break;
                }
            }
            if (booked) break;
        }

        if (!booked) {
            System.out.println("Sorry, seat available nahi hai!");
        }

        System.out.println("\nHall ka layout (A=Available, B=Booked):");
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.print(seat[row][col] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
