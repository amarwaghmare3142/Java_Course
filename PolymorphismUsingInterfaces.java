class  pps{
    public  void turnon(){
        System.out.println("turnON");
    }
    public void turnOff(){
        System.out.println("turnOFF");
    }
}
interface Camera{
    void video();
    void photo();
    void snap();
}
interface Wifi{
    String [] connect();
    void disconnect();
    private void welcome(){
        System.out.println("Listing Networks...");
    }
    default void networks(){
        welcome();
        System.out.println("HI...");

    }
}
class smartPhone extends pps implements Wifi,Camera{
    public void video(){
        System.out.println("Recording videos...");
    }
    public void photo(){
        System.out.println("Clicking photos");
    }
    public void snap(){
        System.out.println("Snapping shots");
    }
    public String [] connect(){
        System.out.println("Connecting...");
        String [] wifis = {"A","B","C"};
        return wifis;
    }
    public void disconnect(){
        System.out.println("Disconnecting...");
    }

    public void turnon(){
        System.out.println("Turning ON...");
    }
    public void turnOff(){
        System.out.println("Turning OFF...");
    }
}


public class PolymorphismUsingInterfaces {
    public static void main(String[] args) {
        smartPhone s = new smartPhone();
        s.snap();
    }
}
