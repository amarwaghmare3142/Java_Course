class Employee{
    int id;
    String name;
    int getsalary;
    public void printDetails(){
        System.out.println("My id is: " + id);
        System.out.println("My name is: " + name);
    }
}

public class aw_38_custum_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee A1 = new Employee();
        Employee A2 = new Employee();

        // Setting attributes for A1
        A1.id= 50;
        A1.name= "Amar Waghmare";

        //Setting attributes for A2
        A2.id= 40;
        A2.name="Malhari Waghmare";

        //Print Details
        A1.printDetails();
        A2.printDetails();
    }
}
