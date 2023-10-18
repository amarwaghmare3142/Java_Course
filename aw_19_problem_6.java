
import java.util.Scanner;

public class aw_19_problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("find type of variable from the url: ");
        String website = sc.next();
        if (website.endsWith(".com")){
            System.out.println("This is an Commercial Website");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is an Oragnizational Website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian Website");
        }
        else{
            System.out.println("Content does not match");
        }
    }
}
