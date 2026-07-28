import java.util.*;
public class ScoreAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sizeeeeeeee");
        int n = sc.nextInt();
        System.out.println("input de ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Score(arr);

    }
    public static int Score(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                
            }
            if(arr[i] < min){
                min = arr[i];
                
            }

        }
        System.out.println("max score is:- "+max);
        System.out.println("min score is:- "+min);
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        int avg = sum/arr.length;
        System.out.println(avg);
        return avg;

    }
}
