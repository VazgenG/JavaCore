package homework.ArrayUtil;

public class ArrayUtil {


    // 1
    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //2
    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //3
    int evenNumbers(int[] array) {
        int evenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers++;
            }

        }
        return evenNumbers;
    }

    //4
    int oddNumbers(int[] array) {
        int oddNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 > 0) {
                oddNumbers++;
            }
        }
        return oddNumbers;
    }

    //5
    int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;

    }


    void print(int[] array) {
        for (int x : array) {
            System.out.println(x);
        }
    }
}