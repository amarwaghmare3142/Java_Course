import java.util.Scanner;

public class aw_82_nested_try_catch {
    public static void main(String[] args) {
        int [] Marks = new int[3];
        Marks[0] = 40;
        Marks[1] = 50;
        Marks[2] = 60;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int ind = sc.nextInt();

        try{
            System.out.println("Welcome to video no 82");

            try{
                System.out.println(Marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Error occured at level 2");
                //System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println("Some error occured at level 1");
            System.out.println(e);
        }
    }
}
