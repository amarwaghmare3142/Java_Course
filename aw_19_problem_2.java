
import java.util.Scanner;

public class aw_19_problem_2 {
    public static void main(String[] args) {
        System.out.println("Find out the student is pass or fail ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Maths marks: ");
        float m1 = sc.nextFloat();
        System.out.print("Enter your Physics marks: ");
        float m2 = sc.nextFloat();
        System.out.print("Enter your chemistry marks: ");
        float m3 = sc.nextFloat();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Overall percentage is: "+avg);

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations! You have passed");
        }
        else {
            System.out.println("Sorry,You have Failed");
        }

    }
}
