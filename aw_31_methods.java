public class aw_31_methods {
    static int amar (int x , int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {

        int a=4;
        int b=5;
        int c;

        // Method inovation using object creation
        aw_31_methods obj = new aw_31_methods();
        c = obj.amar(a,b);
        //c=logic(a,b);

        int a1=6;
        int b1=2;
        int c1;
        // c1=obj.logic(a1,b1);
        c1=amar(a1,b1);


        System.out.println(c);
        System.out.println(c1);
    }

}
