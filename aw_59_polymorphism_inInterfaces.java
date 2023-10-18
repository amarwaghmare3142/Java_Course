
interface Mycamera2{
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

interface Mywifi2{
    String [] getNetworks();
    void connetToNetwork(String network);
}

class myCellphone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling.." + phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting..");
    }

}
class mySmartPhone2 extends myCellphone2 implements Mywifi2,Mycamera2 {
    public void takeSnap() {
        System.out.println("Taking Snap....");
    }

    public void recordVideo() {
        System.out.println("Recording video...");
    }

    public String[] getNetworks() {
        System.out.println("Getting list of networks...");
        String[] networkList = {"Amar", "Malhari", "Swapnil"};
        return networkList;
    }

    public void connetToNetwork(String network) {
        System.out.println("connecting to..." + network);
    }
//    public void record4KVideo(){
//        System.out.println("Rcording 4K video in camera");       ------> Override
//    }
}

    public class aw_59_polymorphism_inInterfaces {
        public static void main(String[] args) {
            Mycamera2 Cam1 = new mySmartPhone2();  //----->>{{{This is samrtphone but please it is ud=se only for camera}}}
//            Cam1.getNetworks();   ------------->>>Not allowed
            Cam1.recordVideo();
            Cam1.record4KVideo();

            Mywifi2 Wifi = new mySmartPhone2();
            Wifi.getNetworks();
            Wifi.connetToNetwork("Airtel");
        }
    }

