package BookExamples.exception;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 40 / d;
            System.err.println("Invalid");

        } catch (ArithmeticException e){
            System.out.println("divide by 0");
        }
    }
}
