public class aw_25_practice_set {
    public static void main(String[] args) {
    // Problem 1
        int n = 4;
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    // Problem 2

        int sum = 0;
        int m = 4;
        for(int i=0; i<m; i++){
            sum=sum+2*i;
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);

    // Problem 3

        int b = 5;
        for(int a=1; a<=10; a++){
            System.out.printf("%d X %d = %d\n",b , a, b*a);
        }

    // Problem 4

        System.out.println("Multiplication of 10 in reverse order");
        int c = 10;
        for(int d=10; d>=1; d--){
            System.out.printf("%d X %d = %d\n",c,d,c*d);
        }


    // Problem number 5





    }
}
