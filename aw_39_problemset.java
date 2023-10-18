// Problem 1 class
class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
// Problem 2 class

class cellphone{
    public void ring(){
        System.out.println("Ringing.....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
    public void callFriend(){
        System.out.println("calling Malhari...");
    }
    public void reject(){
        System.out.println("Call rejected..");
    }
}

public class aw_39_problemset {
    public static void main(String[] args) {

        //Problem 1
        Employee1 amar = new Employee1();
        amar.setName("Coding class is start");
        System.out.println(amar.getName());

        amar.salary=50000;
        System.out.println(amar.getSalary());

    // Problem 2
        cellphone mi = new cellphone();
        mi.callFriend();
        mi.ring();
        mi.vibrate();
        mi.reject();
    }
}
