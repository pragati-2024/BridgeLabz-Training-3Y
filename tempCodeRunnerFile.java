import java.util.*;

public class transaction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bro size dalo:- ");
        int n = sc.nextInt();
        System.out.println("ab chl input de- ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        balance(arr);

    }

    public static int balance(int[] arr) {
        int amt = 0;

        for (int i = 0; i < arr.length; i++) {
            amt += arr[i];
        }
        if (amt < 0) {
            System.out.println("game over");
        }
        return amt;
    }
}