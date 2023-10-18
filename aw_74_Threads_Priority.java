import javax.lang.model.util.TypeKindVisitor14;

class myThr1 extends Thread{
    public myThr1(String name){
        super(name);
    }

    @Override
    public void run() {
        int i=0;
        while(i<10){
            System.out.println("My Name is: " + this.getName());
            i++;
        }

    }
}

public class aw_74_Threads_Priority {
    public static void main(String[] args) {
        myThr1 T1 = new myThr1("Amar1");
        myThr1 T2 = new myThr1("Amar2");
        myThr1 T3 = new myThr1("Amar3");
        myThr1 T4 = new myThr1("Amar4");
        myThr1 T5 = new myThr1("Amar5");
        T1.setPriority(Thread.MAX_PRIORITY);
        T2.setPriority(Thread.MIN_PRIORITY);
        T3.setPriority(Thread.NORM_PRIORITY);
        T1.start();
        T2.start();
        T3.start();
        T4.start();
        T5.start();

    }
}
