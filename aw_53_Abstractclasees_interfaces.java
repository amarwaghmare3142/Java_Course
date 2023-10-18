
abstract class parent2{
    public parent2(){
        System.out.println("MAi Parent2 ka constructor hu");
    }
    public void sayHello(){
        System.out.println("Hello...");
    }
    abstract public void greet();
    abstract public void greet2();
}

class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class child3 extends parent2{
    public void th(){
        System.out.println("I am Good");
    }
}
public class aw_53_Abstractclasees_interfaces {
    public static void main(String[] args) {

    }
}
