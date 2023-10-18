import static java.lang.StrictMath.PI;

class negativeRadiusException extends Exception{

    @Override
    public String toString() {
        return "Radius cannot be Negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be Negative";
    }
}

public class aw_84_throw_Throws {

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static double area(int r) throws negativeRadiusException {
        if (r < 0) {
            throw new negativeRadiusException();
        }
        double area = Math.PI * r * r;
        return area;
    }

    public static void main(String[] args) {
        try {
            int result = divide(6, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception Occured in divide ");

            try {
                double area = area(-6);
                System.out.println(area);
            }
            catch (Exception e1) {
                System.out.println("Exception Occured in area");
            }

        }
    }
}
