
import java.util.Scanner;

public class aw_18_switchcases {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age) {
            case 18:
                ;
                System.out.println("You are going to become adult");
                break;
            case 23:
                ;
                System.out.println("You are now going to join job");
                break;
            case 60:
                ;
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy Your life");
        }
    }
}
