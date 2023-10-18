
import jdk.jfr.Percentage;

import java.util.Scanner;

public class Example1_6 {
    public static void main(String[] args) {
//        Write a program to calculate percentage of a given student in CBSE board exam.
//        His marks from 5 subjects must be taken as input from the keyboard.(marks are out of 100)

        System.out.println("Percentage of a student in CBSE board exam:");
        Scanner marks=new Scanner(System.in);

        System.out.println("enter marathi marks:");
        float a=marks.nextFloat();

        System.out.println("Enter hindi marks:");
        float b=marks.nextFloat();

        System.out.println("Enter english marks:");
        float c= marks.nextFloat();

        System.out.println("Enter maths marks: ");
        float d=marks.nextFloat();

        System.out.println("Enter science marks: ");
        float e=marks.nextFloat();

        float sum=a+b+c+d+e;
        System.out.println(sum);

        float average=(sum/5);
        System.out.println(average);

        float percentage=((sum/500)*100);
        System.out.println(percentage);


    }
}
