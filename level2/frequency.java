import java.util.*;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;

        int[] freq = new int[10];

        if (temp == 0) {
            freq[0] = 1;
        } else {
            if (temp < 0) temp = -temp;
            while (temp > 0) {
                int digit = temp % 10;
                freq[digit]++;
                temp /= 10;
            }
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
        }

        sc.close();
    }
}
