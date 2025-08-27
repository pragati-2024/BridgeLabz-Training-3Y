import java.util.*;
public class transaction{
    
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
        sc.close();
    }

    public static int balance(int[] arr){
        int amt=0;
        for(int i=0; i<arr.length; i++){
            
            if(arr[i] > 0){   
                amt += arr[i];
                System.out.println("Deposit of "+arr[i]+" and balance = "+amt);
            }
            else{             
                amt += arr[i];
                System.out.println("Withdrawal of "+(arr[i])+" and balance = "+amt);
            }

            if(amt < 0){
                System.out.println("Bro overdraft hogyaaaa");
            }
        }
        return amt;
    }
}
