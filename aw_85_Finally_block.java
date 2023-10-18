public class aw_85_Finally_block {

    public static int greet(){
        try {
            int a = 50;
            int b = 0;
            int c = a / b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally program is run");
        }
        return 0;
    }

    public static void main(String[] args) {
       // greet();

       int k = greet();
        System.out.println(k);

        int a=7;
        int b=9;
        while (true) {
            try {
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am Finally for the value b: " + b);
            }
            b--;

        }
    }
}
