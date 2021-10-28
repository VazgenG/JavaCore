package Lessons.lesson8;

public class CharArray {

    public static void main(String[] args) {
        int[] array = {7, 4, 0, 2, 6, 37, 88, 12, 5};
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[j - 1]) {
                   // int tmp
                }
            }
        }


// տպել с փոփոխականի ինդեքսը
        //   char[] charArray = {'b', 'o', 'l', 'o', 'l', 'a',};

      /*  { char c = 'o';
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                System.out.println(i); */
        //       }
//  տպել с փոփոխականի քանակը
        //  }
           /* char c = 'b';
            int count = 0;
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == c) {
                    count++;
                }
            }
            System.out.println("count of" + c + "=" + count);*/
        //     }


//if(charArray[charArray.lenght-2] == 'l' &&
        //      charArray[charArray.lenght-1]);

    }
}
