class phone{
    public void showTime(){
        System.out.println("Time is 9am");
    }
    public void on(){
        System.out.println("Turning on phone....");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("playing music...");
    }
    public void on(){
        System.out.println("Turning on Smartphone......");
    }
}

public class aw_49_Dynmaic_method_dispatch {

    public static void main(String[] args) {
        //phone obj = new phone();
        // obj.name();

        phone obj = new smartphone();            // Allowed
                                                // But smartphone obj = new phone is not allowed
        obj.on();
        obj.showTime();
                                   //obj.music();          [[..Not allowed..]]

    }

}
