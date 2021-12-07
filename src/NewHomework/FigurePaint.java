package NewHomework;

public class FigurePaint {
    public static void main(String[] args) {





        // homework 1

        //      *
        //      * *
        //      * * *
        //      * * * *


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // homework 2

        //           *
        //         * *
        //       * * *
        //     * * * *


        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();

        // homework 3

        //    * * * * *
        //    * * * *
        //    * * *
        //    * *
        //    *

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");

            }
            System.out.println(" ");
        }

        // homework 4

        //    * * * *
        //      * * *
        //        * *
        //          *

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < 5; j++) {
                System.out.print(" *");
            }
            System.out.println();



        }
    }
}
