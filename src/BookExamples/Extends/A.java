package BookExamples.Extends;

public class A {
    int i, j;

    void showij (){

    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println(i + j + k);
    }
}

class SimpleInheritence {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        subOb.j = 20;


    }
    
}