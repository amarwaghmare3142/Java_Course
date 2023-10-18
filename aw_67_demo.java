


// Demo of lecture 66
// about showing private class


class c1{
public int a=10;
protected int b=20;
        int c=30;
private int d=40;
public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        }
        }

public class aw_67_demo {
    public static void main(String[] args) {
        c1 c = new c1();
        c.meth1();
//        System.out.println(c.a);
//        System.out.println(c.b);
//        System.out.println(c.c);
//        System.out.println(c.d); ---------//Error in this situation
    }
}
