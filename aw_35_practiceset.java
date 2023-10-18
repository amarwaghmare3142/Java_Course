import java.security.spec.RSAOtherPrimeInfo;

public class aw_35_practiceset {

    // Problem no 1
    static void multiplication(int n){
        for(int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n",n,i,n*i );
        }
    }

    static void pattern(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();         // Also System.out.print("\n");
        }
    }

    // Problem no 3:

    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sumRec(n-1);
        }
    }

    // Problem no 4:
    static void pattern2(int n){
        for(int i=n; i>=0; i--){
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();         // Also System.out.print("\n");
        }
    }

    // Problem no 5:
    static int fib(int n){
        if(n==1){                    // in shorts
            return 0;                // if(n==1 || n==2){
        }                            // return n-1;  }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {

    // Problem  no 1:
        multiplication(5);

    // Problem no 2:
       pattern(4);

        System.out.println();

    // Problem no 3:
      int c = sumRec(4);
      System.out.println(c);

    // Problem no 4:
       pattern2(4);

    // Problem no 5:
        // Fibonacci series{0,1,1,2,3,5,8,13,21,34}
       int result = fib(15);
        System.out.println(result);
    }
}
