import java.util.*;

public class Calendar {

    // Month names
    static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Days in each month
    static int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

    // Check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Get number of days in month
    public static int getDaysInMonth(int month, int year) {
        if (month == 1 && isLeapYear(year)) return 29; // February
        return daysInMonth[month];
    }

    // Zeller’s congruence algorithm to get first day
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1;
        int m = month + 1;
        int y = year;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int k = y % 100;
        int j = y / 100;
        int h = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        int day = (h + 6) % 7; // Convert to 0=Sun,1=Mon...
        return day;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt() - 1;
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int firstDay = getFirstDayOfMonth(month, year);
        int days = getDaysInMonth(month, year);

        System.out.println("\n   " + months[month] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%4d", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
    }
}
