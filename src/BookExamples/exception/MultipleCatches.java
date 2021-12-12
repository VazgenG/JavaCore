package BookExamples.exception;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int а = args.length;

            System.out.println("a = " + а);
            int Ь = 42 / а;
            int с[] = {1};
            с[42] = 99;
        }
        catch (ArithmeticException e){
            System.out.println("divide by 0");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" Index error " + e);
        }
    }
}