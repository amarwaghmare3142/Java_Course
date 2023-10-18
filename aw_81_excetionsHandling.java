import java.util.Scanner;

public class aw_81_excetionsHandling {
    public static void main(String[] args) {
        int [] Marks = new int[3];
        Marks[0] = 40;
        Marks[1] = 50;
        Marks[2] = 60;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int ind = sc.nextInt();

        System.out.print("Enter the number you want to divide the value with: ");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index entered is: " + Marks[ind]);
            System.out.println("The value array-index/the number: " + Marks[ind] / number);
        }
        catch(ArithmeticException e){
            System.out.println("Some ArithmeticException occured");
            System.out.println(e);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Some ArrayIndexOutOfBoundException occured");
            System.out.println(e);
        }

        catch(Exception e){
            System.out.println("Some Exception occured");
            System.out.println(e);
        }



    }
}
