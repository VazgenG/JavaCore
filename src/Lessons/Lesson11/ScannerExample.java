package Lessons.Lesson11;

import Lessons.Lesson10.calcpackage.Calckulator;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a");
        int a = scanner.nextInt();
        System.out.println("please input b");
        int b = scanner.nextInt();

        Calckulator calculator = new Calckulator();

        System.out.println("please input operation (+,-,/,*,)");
        String c = scanner.next();
        System.out.println(c);
        switch (c) {
            case "+":
                System.out.println(calculator.gumarum(a,b));
                break;
            case "-":
                System.out.println(calculator.hanum(a,b));
                break;
            case "*":
                System.out.println(calculator.bazmapatkum(a,b));
                break;
            case "/":
                System.out.println(calculator.bajanum(a,b));
                break;
            default:
                System.out.println("Invalid Operation");
        }


        // System.out.println("sum:" + (a + b));

        // ընդունել c String-ը սիմվոլը, որը կարող է լինել հետևյալը +, -, *, /
        // կախված սիմվոլից կանչել Calculator կլասսի համապատասխան մեթոդը

    }
}
