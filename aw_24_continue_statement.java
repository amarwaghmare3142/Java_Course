public class aw_24_continue_statement {
    public static void main(String[] args) {
//        for (int i=1; i<10; i++){
//            if(i==4){
//                System.out.println("Ending the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is great");
//        }

    // for while loop
        int j=0;
        while(j<=10){
            System.out.println(j);
            j++;
            System.out.println("Java is great");

            if (j == 5) {
                System.out.println("Ending the loop");
                continue;
            }

        }
    }
}
