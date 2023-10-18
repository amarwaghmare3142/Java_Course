
class myThr extends Thread{
  public myThr(String name){
      super(name);
  }

    @Override
    public void run() {
        System.out.println("I am Amar Waghmare");
    }
}
public class aw_73_constructors_in_Threads {
    public static void main(String[] args) {
        myThr T = new myThr("Amar");
        T.start();
        System.out.println("The id of the Thread is :- " + T.getId());
        System.out.println("The id of the Thread is :- " + T.getName());


    }
}
