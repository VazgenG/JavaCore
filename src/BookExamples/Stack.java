package BookExamples;

class Stack {
    private int stack[];
    private int tos;

    Stack(int size) {
        stack = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stack.length - 1)
            System.out.println(" stack-ը լիքն է ");
        else
            stack[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println(" stack-ը դատարկ է ");
            return 0;
        } else
            return stack[tos--];
    }
}

class TestStack2 {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);
        for (int i = 0; i < 5; i++)
            mystack1.push(i);
        for (int i = 0; i < 8; i++)
            mystack2.push(i);
        System.out.println("mystack 1 ");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());

        System.out.println("mystack 2 ");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());

    }

}