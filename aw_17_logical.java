public class aw_17_logical {
    public static void main(String[] args) {
        //Logicall operators
        System.out.println("For logical AND operators ");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a && b && c){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    //for logical OR operators
        System.out.println("For logical OR operators");
        boolean d = true;
        boolean e = false;
        boolean f = true;
        if (d || e || f){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    // For logical NOT operators
        System.out.println("For logical NOT operators");
        System.out.println(!a);

    //For AND , OR operators
        System.out.println("For AND, OR operators ");
        if (a && b || d || a && f){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }




    }
}
