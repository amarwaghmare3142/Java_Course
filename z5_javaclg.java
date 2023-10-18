import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class z5_javaclg {
    String name;
    int os,java;
    Scanner sc=new Scanner(System.in);
    void setData(){
        System.out.println("Enter the name of student: ");
        name=sc.next();
        System.out.println("Enter the marks of os: ");
        os=sc.nextInt();
        System.out.println("Enter the marks of java: ");
        java=sc.nextInt();
    }
    void getData() {
        System.out.println("Enter the name of student: " + name);
//        name = sc.next();
        System.out.println("Enter the marks of os: " + os);
//        os = sc.nextInt();
        System.out.println("Enter the marks of java: " + java);
//        java = sc.nextInt();
    }

    }

