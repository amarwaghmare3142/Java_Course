public class z3_javaclg{
    public static void main(String[] args) {
        int num = 565667;
        int sum = 0;
        while(num!=0){
            int ren=num%10;
            sum=sum+ren;
            num=num/10;
        }
        System.out.println("sum of the digit is: " + sum);
    }
}

