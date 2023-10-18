class MyRunnableThread1 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(i<4){
            System.out.println("I am  thread 1 not threat");
            i++;
        }
    }
}class MyRunnableThread2 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(i<4){
            System.out.println("I am  thread 2 not threat");
            i++;
        }
    }
}

public class aw_71_multithreading_implementing_runnableInterface {
    public static void main(String[] args) {
        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        Thread Gun1 = new Thread(bullet1);

        MyRunnableThread2 bullet2 = new MyRunnableThread2();
        Thread Gun2 = new Thread(bullet2);

        Gun1.start();
        Gun2.start();

    }
}
