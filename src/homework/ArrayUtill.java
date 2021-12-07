package homework;

public class ArrayUtill {

    public static void main(String[] args) {

        int[] array = {9, 15, 198, 34, 145, 226, 5, 981, 534, 21};
        // Տպել մասիվի բոլոր էլեմենտները
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
        //Զույգ թվերի քանակը
        int evennumbers = 0;
        for (int i = 0;  i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evennumbers++;
            }
        }
        System.out.println("even numbers " + evennumbers);
        // Կենտ թվերի քանակը
        int oddnumbers = 0;
        for (
                int i = 0;
                i < array.length; i++) {
            if (array[i] % 2 > 0) {
                oddnumbers++;
            }
        }
        System.out.println("oddnumbers " + oddnumbers);
        // միջին թվաբանականը
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            value = value + array[i];
        }
        System.out.println("sum " + value);
        double avarage = (double) value / array.length;
        System.out.println("avarage: " + avarage);

        //Մասիվի ամենափոքր թիվը
        int min_ivalue = array[0];
        for (
                int i = 0;
                i < array.length; i++) {
            if (array[i] < min_ivalue) {
                min_ivalue = array[i];
            }
        }
        System.out.println("minvalue " + min_ivalue);
        // Մասիվի ամենամեծ թիվը
        int max_value = array[0];
        for (
                int i = 0;
                i < array.length; i++) {
            if (array[i] > max_value) {
                max_value = array[i];
            }
        }
        System.out.println("maxvalue " + max_value);
        // Մասիվի զույգ թվերը
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(" " + array[i]);
            }
        }
        System.out.println();
        //Մասիվի կենտ թվերը
        for (
                int j = 0;
                j < array.length; j++) {
            if (array[j] % 2 > 0) {
                System.out.print(" " + array[j]);
            }
        }
    }
}