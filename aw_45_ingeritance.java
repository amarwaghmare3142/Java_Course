
class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.print("I am in base and setting X now:- ");
        this.x = x;
    }
}
class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class aw_45_ingeritance {
    public static void main(String[] args) {

    // creating an object of base class
        base a = new base();
        a.setX(5);
        System.out.println(a.getX());

    // Creating an object of derived class
        derived d = new derived();
        d.setX(43);
        System.out.println(d.getX());

    }
}
