/**
 * This is tags which are used in the method
 */

public class aw_107_method_tags {
    /**
     *
     * @param args This is parameter argument
     */

    public static void main(String[] args) {
        System.out.println("This is main method");
    }

    /**
     *
     * @param a This is first paramter
     * @param b This is second paramter
     * @return  this is addition of first ad second paramter
     * @throws Exception if a is 0
     * @deprecated This method is deprecated please use + operator
     */

        public int add(int a,int b) throws Exception{
            if(a==0){
                throw new Exception();
            }

        int c;
        c=a+b;
        return c;
        }
}

