
class Thread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<400){
            System.out.println("I am eating chicken");
            System.out.println("I am very Happy!");
            i++;
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<400){
        System.out.println("I am Driving Tractor");
        System.out.println("I am so lucky");
        i++;
        }
    }
}

public class aw_70_multithreading_extending_thread_class {
    public static void main(String[] args) {
        Thread1 T1 = new Thread1();
        Thread2 T2 = new Thread2();
        T1.start();
        T2.start();

    }
}
