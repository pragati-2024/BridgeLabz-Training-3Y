import java.util.*;
public class cart{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("product menu");

        System.out.println("women dress");
        System.out.println("men dress");
        System.out.println("skirts");
        System.out.println("jwellery");
        System.out.println("swim-suit");

        System.out.println("shoes");
        int choice= sc.nextInt();
        System.out.println("enter your choice");
        switch(choice){
            case 1:
                System.out.println("women dress");
                break;
            case 2:
                System.out.println("men dress");
                break;
            case 3:
                System.out.println("skirts");
                break;
            case 4:
                System.out.println("jwellery");
                break;
            case 5:
                System.out.println("jwellery");
                break;
            default:
                System.out.println("invalid choice");
        }
        int n =sc.nextInt();
    }
}