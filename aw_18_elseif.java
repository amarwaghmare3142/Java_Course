
import java.util.Scanner;

public class aw_18_elseif {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();

       if (age>56) {
           System.out.println("You are experienced");
       }
       else if(age>46){
           System.out.println("Yor are semi experiencede");
       }
       else if (age>36){
           System.out.println("Yor are semi-semi experienced");
       }
       else{
           System.out.println("You are not experienced");
       }
       if (age>2){
           System.out.println("You are out off syallabus");
       }

    }
}
