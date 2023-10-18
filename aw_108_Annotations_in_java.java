@FunctionalInterface
interface MyInterface{
    void method1();
    //void method2();          //-------only one method in functional interface
}
class newPhone extends phone{
    @Override
    public void showTime(){
        System.out.println("Time is 11 am");
    }

    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class aw_108_Annotations_in_java {
    @SuppressWarnings( "deprecation")        //---------->> Spress warning for deprecation
    public static void main(String[] args) {
        newPhone phone = new newPhone();
        phone.showTime();
        phone.sum(5,6);
    }
}


