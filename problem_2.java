
import java.sql.SQLOutput;
import java.util.Scanner;
public class problem_2 {

    //    write a progam to sum their numbers in java and taking input from keyboard
    public static void main(String[] args) {
        System.out.println("Sum of numbers in java and taking input from keyboard");
        Scanner Sum = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = Sum.nextInt();
        System.out.println("Enter number 2");
        int b = Sum.nextInt();
        System.out.print("Then sum is: ");
        int c = a + b;
        System.out.println(c);
    }
}
