
import java.util.Scanner;
public class Z2_package {
            int id;
            String name;
            int roll;
            String subject;
            int marks;
            Scanner sc=new Scanner(System.in);

            void setData(){
                System.out.println("Enter the student id: ");
                id = sc.nextInt();
                System.out.println("Enter the student name: ");
                name = sc.nextLine();
                System.out.println("Enter the student subject: ");
                subject = sc.nextLine();
                System.out.println("Enter the student marks: ");
                marks = sc.nextInt();
            }
            void getData(){
                System.out.println("Enter the student id: " + id);
                System.out.println("Enter the student name: " + name);
                System.out.println("Enter the student subject: " + subject);
                System.out.println("Enter the student marks: " + marks);
            }
        }

