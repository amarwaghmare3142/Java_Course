public class aw_33_varargs {
    static int sum(int...arr){
        int result=0;
        for(int a:arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Vararg Tutorial");
        System.out.println("The sum value of 4 and 5 are: " + sum(4,5));
        System.out.println("The sum value of 4,5,6 are: " + sum(4,5,6));
        System.out.println("The sum value of 4,5,6,9 are: " + sum(4,5,6,9));




    }
}
