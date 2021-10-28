package Lessons.lesson8;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {7, 5, 4, 0, 8, 2, 6, 5, 2};

        // գտնել մասիվի կրկնվող էլեմենտները
        // result:

        // 5-ը կրկնվում է
        // 2-ը կրկնվում է


     /*  for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {

                    System.out.println(array[i] + " - ը կրկնվում է");
                    break;

                }
            } */

        boolean isEven = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] % 2 != 0) ;
                isEven = false;
                break;
            }
        }
        System.out.println(isEven);
    }
}