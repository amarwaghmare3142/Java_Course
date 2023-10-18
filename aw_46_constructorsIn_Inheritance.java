
class Base1{
    Base1() {
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am a overloaded base class constructorof X: " + x);
    }
    private int X;
}
class derived1 extends Base1{
    derived1(){
        System.out.println("I am a derived class constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("I am a derived overloaded class comnstructor of y: " + y);
    }
    private int Y;

}
class childOfDerived extends derived1{
    childOfDerived(){
        System.out.println("I am childOfDerived class constructor");
    }
    childOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am childOfDerived class constructor of Z: " + z);
    }
}

public class aw_46_constructorsIn_Inheritance {
    public static void main(String[] args) {
        System.out.println("Base class without overloading");
        Base1 b = new Base1();
        System.out.println(" ");      // only for drawing extra blank line

        System.out.println("Base class with overloading");
        Base1 b1 = new Base1(2);
        System.out.println(" ");

        System.out.println("Derived class without overloading");
        derived1 d = new derived1();
        System.out.println(" ");

        System.out.println("Derived class with overloading");
        derived1 d1 = new derived1(2,3);
        System.out.println(" ");

        System.out.println("childOfDerived class without overloading");
        childOfDerived cd = new childOfDerived();
        System.out.println(" ");

        System.out.println("childOfDerived class with overloading");
        childOfDerived cd1 = new childOfDerived(2,3,4);


    }
}
