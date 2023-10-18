class Ekclass{
     int a;
    Ekclass(int a){
        this.a=a;
    }

    public int getA() {
        return a;
    }
}
class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}

public class aw_47_this_super {
    public static void main(String[] args) {
        Ekclass ek = new Ekclass(6665);
        System.out.println(ek.getA());
        Doclass D = new Doclass(55);




    }
}
