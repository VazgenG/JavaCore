package Lessons.Lesson10.calcpackage;

public class CalculatorTest {
    public static void main(String[] args) {
        Calckulator calckulator = new Calckulator();

        int a = 30;
        int b = 15;
        int result = calckulator.gumarum(a,b);
        System.out.println(result);

         result = calckulator.hanum(a,b);
        System.out.println(result);

        double result3 = calckulator.bajanum(a,b);
        System.out.println(result3);

        long result4 = calckulator.bazmapatkum(a,b);
        System.out.println(result4);
    }
}
