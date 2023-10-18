
interface Mycamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning friends....");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording 4K video....");
    }
}

interface Mywifi{
    String [] getNetworks();
    void connetToNetwork(String network);
}

class myCellphone{
    void callNumber(int phoneNumber){
        System.out.println("Calling.." + phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting..");
    }

}
class mySmartPhone extends myCellphone implements Mywifi,Mycamera{
    public void takeSnap(){
        System.out.println("Taking Snap....");
    }
    public void recordVideo(){
        System.out.println("Recording video...");
    }
    public String [] getNetworks(){
        System.out.println("Getting list of networks...");
        String [] networkList = {"Amar" , "Malhari" , "Swapnil"};
        return networkList;
    }
    public void connetToNetwork(String network){
        System.out.println("connecting to..." + network);
    }
//    public void record4KVideo(){
//        System.out.println("Rcording 4K video in camera");       ------> Override
//    }
}
public class aw_57_defeult_methods {
    public static void main(String[] args) {
        mySmartPhone MS = new mySmartPhone();
        MS.record4KVideo();
        String[] ar = MS.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
        //MS.greet(); ------> Shows an error because greet is private method
    }
}
