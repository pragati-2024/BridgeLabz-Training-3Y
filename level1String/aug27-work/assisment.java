import java.util.Scanner;

public class assisment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean moreStudents = true;

        while (moreStudents) {
            System.out.print("Enter student name: ");
            String studentName = sc.next();

            System.out.print("Enter number of books borrowed: ");
            int numBooks = sc.nextInt();
            int totalFine = 0;

            for (int i = 1; i <= numBooks; i++) {
                String category;
                int finePerDay = 0;

                System.out.println("Book " + i);
                System.out.print("Enter book category (Regular/Reference/Magazine): ");
                category = sc.next();

                switch (category.toLowerCase()) {
                    case "regular":
                        System.out.println("-- Regular selected --");
                        break;
                    case "reference":
                        System.out.println("-- Reference selected --");
                        break;
                    case "magazine":
                        System.out.println("-- Magazine selected --");
                        break;
                    default:
                        System.out.println("Invalid category. Defaulting to 'Regular'");
                        category = "regular";
                        break;
                }

                System.out.print("Enter days late: ");
                int daysLate = sc.nextInt();
                int fineForBook = 0;

                do {
                    if (daysLate >= 1 && daysLate <= 5) {
                        finePerDay = 10;
                    } else if (daysLate >= 6 && daysLate <= 10) {
                        finePerDay = 20;
                    } else if (daysLate > 10) {
                        finePerDay = 50;
                    } else {
                        finePerDay = 0;
                    }
                    fineForBook = finePerDay * daysLate;
                    break;
                } while (false);

                System.out.println("Fine for book " + i + ": ₹" + fineForBook);
                totalFine += fineForBook;
            }

            System.out.println("Total fine for " + studentName + ": ₹" + totalFine);

            System.out.print("Check fine for another student? (yes/no): ");
            String resp = sc.next();
            moreStudents = resp.equalsIgnoreCase("yes");
        }
        sc.close();
    }
}