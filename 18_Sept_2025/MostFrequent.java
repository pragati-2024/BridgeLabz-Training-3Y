import java.util.Scanner;

public class MostFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        char mostFreq = ' ';
        int max = -1;
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                mostFreq = c;
            }
        }
        System.out.println("Most Frequent Character: '" + mostFreq + "'");
    }
}
