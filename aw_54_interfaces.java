
interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface blowHorn{
    void blowHornPeep();
    void blowHornPee();
}
class Avoncycle implements Bicycle,blowHorn{            // {{ek se jyada implementations ho skte hai}}
    void blowHorn(){
        System.out.println("Pee Peep.....");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Accelerate speed...");
    }
    public void blowHornPeep(){
        System.out.println("Tuze dekha to Peep peep....");
    }
    public void blowHornPee(){
        System.out.println("Mai hoon hero tera Pee pee....");
    }
}

public class aw_54_interfaces {
    public static void main(String[] args) {
        Avoncycle Amar = new Avoncycle();
        Amar.applyBrake(1);
        System.out.println(Amar.a);
        Amar.blowHorn();
        Amar.blowHornPee();
        Amar.blowHornPeep();
       }
    }

