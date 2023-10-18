public class aw_80_try_Catch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.print("The reason of the exception: ");
            System.out.println(e);
        }

        System.out.println("End Of The Program");
    }
}
