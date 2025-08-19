import java.util.*;
public class npositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                System.out.println(arr[i] +"  is positive");
                if(arr[i] % 2 == 0){
                    System.out.println(arr[i] +"  is even");
                }
                else{
                    System.out.println(arr[i] +"  is odd");
                }
            }
            else{
                System.out.println(arr[i] +"  is negative");
            }
        }

    }
}
