import java.util.*;

public class reservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Shatabdi Express");
        System.out.println("2. Rajdhani Train");
        System.out.println("3. Vandematram Train");
        System.out.println("4. Humsafar Train");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        String train = "";
        int seats = 5;

        switch(choice) {
            case 1:
                train = "Shatabdi Express";
                break;
            case 2:
                train = "Rajdhani Train";
                break;
            case 3:
                train = "Vandematram Train";
                break;
            case 4:
                train = "Humsafar Train";
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Selected Train: " + train);

        int booked = 0;
        int waiting = 0;

        do {
            System.out.print("Enter number of passengers: ");
            int n = sc.nextInt();

            for(int i=1; i<=n; i++) {
                if(booked < seats) {
                    booked++;
                    System.out.println("Seat booked for passenger " + i);
                } else {
                    waiting++;
                    System.out.println("Passenger " + i + " is in waiting list");
                }
            }

            System.out.println("Total booked = " + booked);
            System.out.println("Waiting = " + waiting);

            System.out.print("Do you want to book more?yes...no): ");
        } while(sc.next().equalsIgnoreCase("yes"));
    }
}
