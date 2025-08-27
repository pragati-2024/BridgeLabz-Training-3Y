import java.util.*;

public class fitness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueRegistration = null;
        do {
            System.out.println("Welcome to the Fitness Center Membership Registration!");
            System.out.println("Select Membership Type:");
            System.out.println("1. Monthly ($50)");
            System.out.println("2. Quarterly ($135)");
            System.out.println("3. Yearly ($480)");
            int membershipType = scanner.nextInt();
            double fee = 0;

            switch (membershipType) {
                case 1:
                    fee = 50;
                    break;
                case 2:
                    fee = 135;
                    break;
                case 3:
                    fee = 480;
                    break;
                default:
                    System.out.println("Invalid membership type selected.");
                    continue;
            }

            System.out.println("Enter number of members to register:");
            int numberOfMembers = scanner.nextInt();

            for (int i = 0; i < numberOfMembers; i++) {
                System.out.println("Registering member " + (i + 1));
                System.out.println("Is the member a student or senior citizen? (yes/no)");
                String discountEligibility = scanner.next();

                if (discountEligibility.equalsIgnoreCase("yes")) {
                    fee *= 0.9;
                    System.out.println("A 10% discount has been applied.");
                }

                System.out.println("Total fee for member " + (i + 1) + ": $" + fee);
            }

            System.out.println("Do you want to register more members?yes..no");
            continueRegistration = scanner.next();
        } while (continueRegistration.equalsIgnoreCase("yes"));
        System.out.println("Thank you!");
        scanner.close();

    }
}