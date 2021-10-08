package com.company;

public class Main {

    public static void main(String[] args) {
       // homework 1
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //homework 2
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i ; j--) {
                System.out.print("  ");
            }
              for (int j = 0; j <= i; j++) {


                System.out.print(" *");
            }

            System.out.println();

        }
        System.out.println();

        // homework 3

        for (int i = 3; i > -1 ; i--) {
            for (int j = 0; j < i + 1; j++)
            {


                System.out.print("* ");
            }
            System.out.println();
        }
//homework 2
        for (int i = 3; i > -1; i--) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {


                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
