
import java.util.Scanner;
import java.util.Random;

public class aw_20_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 = Rock");
        System.out.println("Enter 2 = Paper");
        System.out.println("Enter 3 =n Scissor");
        System.out.print("Please enter your choice number: ");

        int number = sc.nextInt();

        Random rnum = new Random(3);
        int random = rnum.nextInt();

        switch(number){
            case 1 -> System.out.println("A select Rock");
            case 2 -> System.out.println("A select Paper");
            case 3 -> System.out.println("A select Scissor");
        }
        switch(random){
            case 1 -> System.out.println("B select Rock");
            case 2 -> System.out.println("B select Paper");
            case 3 -> System.out.println("B select Scissor");
        }

    }
    }

