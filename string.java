
import java.util.Scanner;

public class string{
    public static void main(String[] args) {
        String name = new String("Amar");
        System.out.println(name);

        String st = "Amar Waghmare ";
        System.out.println(st);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String str = sc.nextLine();
        System.out.println(str);

    //printf statement

        int a = 5;
        float b = 5.64f;
        System.out.printf("The value of a is %d and value of b is %f",a ,b);
    }
}
