package BookExamples.OverLoad;

public class OverloadDemo {
    void test() {
        System.out.println("nothing");
    }

    void test(int a) {
        System.out.println("a:" + a);
    }

    void test(int a, int b) {
        System.out.println("a + b = " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a:" + a);
        return (a * a);
    }
}
class Overload{
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
       // double result;
        int i = 88;

        ob.test();
        //ob.test(10);
        ob.test(15,20);
        ob.test(i);
        //result = ob.test(123.25);
        ob.test(123.2);
        //System.out.println("Результат вызова ob.test(123.25): " + result);


    }
}
