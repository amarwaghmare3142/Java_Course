
class myNewThread extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<20){
            System.out.println("Thank You!");


//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {           ----------for sleep
//                throw new RuntimeException(e);
//            }


            i++;
        }
    }
}

class myNewThread1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<20) {
            System.out.println("Welcome...");
            i++;
        }
    }
}

public class aw_75_thread_methods {
    public static void main(String[] args) {
        myNewThread T1 = new myNewThread();
        myNewThread1 T2 = new myNewThread1();

        T1.start();

        try {
            T1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        T2.start();
    }
}
