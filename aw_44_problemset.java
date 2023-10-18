// Craete a class cylinder and use getters and setters to calculate surface area and volume of cylinder

class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2*3.142*radius*radius+2*3.142*radius*height;
    }
}

public class aw_44_problemset {
    public static void main(String[] args) {
       Cylinder mycylinder = new Cylinder();
       mycylinder.setHeight(12);
       mycylinder.setRadius(9);
        System.out.print("Radius: ");
        System.out.println(mycylinder.getRadius());
        System.out.print("Height: ");
        System.out.println(mycylinder.getHeight());
        System.out.print("Surface Area: ");
        System.out.println(mycylinder.surfaceArea());
    }
}
