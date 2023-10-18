public class aw_32_methods_2 {

    static void change(int a){
        a=98;
    }

    static void change2(int[]arr){
        arr[2]=98;
    }
    static void telljoke(){
       System.out.println("I am great,\nI do great things!");
   }

   static void amar(){
       System.out.println("Good morning bro");
   }

   static void amar(String a, String b){
       System.out.println("Good morning "+ a +" bro");
       System.out.println("Good Morning " + b +" bro");
   }

    public static void main(String[] args) {
        //telljoke();

        int [] marks = {52,73,77,89,98,94};
        int x=45;
        change(x);
        System.out.println("The value of x after changing the value: "+x);

        //Case 2: Changing the array

        int [] marks2 = {52,73,77,89,98,94};
        change2(marks2);
        System.out.println("The value of [0] after running: "+marks2[2]);
        //System.out.println(marks2[2]);
        for (int element:marks2){
            System.out.print(element + " ");
        }
        System.out.println(" ");

        // Method overloading
        amar();
        amar("Amar","Malhari");
    }
}
