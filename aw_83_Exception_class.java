import java.util.Scanner;

class MyException extends Exception{

    @Override
    public String toString() {
        return "I am a toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class aw_83_Exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter any value of a: ");
        a = sc.nextInt();
        if(a<9) {
            try {
                throw new  MyException();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);

            }
        }

    }
}
