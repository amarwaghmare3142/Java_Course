
import java.util.Scanner;

public class aw_19_problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year%4==0){
            System.out.println("The year " + year + " is a leap year");
        }
        else{
            System.out.println("The year " + year + " is not a leap year");
        }
    }
}
