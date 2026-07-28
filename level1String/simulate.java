import java.util.*;
public class Simulate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("product menu:- ");
        System.out.println("1.mobile phone");
        System.out.println("2.tablet");
        System.out.println("3.printer");
        System.out.println("4.headphones");
        System.out.println("5.earphones");
        System.out.println("not in range -exit");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("selected product is mobile phone");
                break;
            case 2:
                System.out.println("selected product is tablet");
                break;
            case 3:
                System.out.println("selected product is printer");
                break;
            case 4:
                System.out.println("selected product is headphones");
                break;
            case 5:
                System.out.println("selected product is earphones");
                break;
            default:
                System.out.println("not in range -exit");
                break;
        }
        
    }
}
