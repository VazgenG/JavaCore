package Homeworks.ArrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        ArrayUtil arrayUtil2 = new ArrayUtil();
        ArrayUtil arrayUtil3 = new ArrayUtil();

        int[] numbers1 = {2, 9, 15, 28, 100};
        int maxOfnumbers1 = arrayUtil.max(numbers1);
        int[] numbers2 = {11, 22, 33, 44, 55, 66};
        int maxOfnumbers2 = arrayUtil.max(numbers2);
        if (maxOfnumbers1 > maxOfnumbers2) {
            System.out.println("Ամենամեծ թիվը առաջին մասիվի մեջ է - " + maxOfnumbers1);
        } else {
            System.out.println("Ամենամեծ թիվը երկրորդ մասիվի մեջ է - " + maxOfnumbers2);
        }

        int[] numbers3 = {2, 9, 15, 28, 100};
        int minOfnumbers1 = arrayUtil.min(numbers3);
        int[] numbers4 = {11, 22, 33, 44, 55, 66};
        int minOfnumbers2 = arrayUtil.min(numbers4);
        if (minOfnumbers1 > minOfnumbers2) {
            System.out.println("Ամենափոքր թիվը առաջին մասիվի մեջ է - " + minOfnumbers1);
        } else {
            System.out.println("Ամենափոքր թիվը երկրորդ մասիվի մեջ է - " + minOfnumbers2);
        }

        int[] numbers5 = {6, 8, 9, 11, 82, 56, 44, 45, 58, 60, 88};
        int evenNumbers = arrayUtil2.evenNumbers(numbers5);
        System.out.println("Կենտ թվերի քանակը հավասար է - " + evenNumbers);

        int[] numbers6 = {1, 8, 9, 11, 82, 56, 44, 15, 45, 8, 7, 11};
        int oddNumbers = arrayUtil2.oddNumbers(numbers6);
        System.out.println("Զույգ թվերի քանակը հավասար է - " + oddNumbers);

        int[] numbers = {maxOfnumbers1,  minOfnumbers2, evenNumbers, oddNumbers};
        int sum = arrayUtil2.sum(numbers);
        System.out.println( "Ստացված թվերի գումատը հավասար է - " + sum);
    }
}
