package homework;



public class FigurePaint {

    public static void main(String[] args) {
        // homework 1
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();

        //homework 2
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }


        // homework 3

        for (int i = 3; i > -1; i--) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //homework 4
        for (int i = 4; i > -1; i--) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }


        //  homework 5
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print(" *");
            }
            System.out.println( );
        }
        for (int i = 3; i > 0 ; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i ; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}