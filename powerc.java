import java.util.*;

class powerc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(result);
        sc.close();
    }
}
