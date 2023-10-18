
import java.util.Scanner;

public class Amar_5_TakingInput {
    public static void main(String[] args) {
       System.out.println("Taking input from the user");
       Scanner Amar=new Scanner(System.in);
        System.out.println("Enter number1:");
        int a= Amar.nextInt();
        System.out.println("Enter number2: ");
        int b= Amar.nextInt();
        int sum=a+b;
        System.out.println(sum);
        System.out.println("Enter the Number1");
        float c=Amar.nextFloat();
        System.out.println("Enter the number2");
        float d= Amar.nextFloat();
        System.out.print("Enter Boolean value: ");
        boolean f= Amar.hasNextInt();
        System.out.println(f);
        String h=Amar.nextLine();
        System.out.println(h);
   }
}
