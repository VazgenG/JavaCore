package Homeworks.PracticeHomework;

public class PracticeHomeworkTest {

    public static void main(String[] args) {

        PracticeHomework ph = new PracticeHomework();

        System.out.println(ph.convert(5));
        System.out.println(ph.calcAge(2));
        System.out.println(ph.nextNumber(187));
        System.out.println(ph.isSameNum(4, 5));
        System.out.println(ph.lessThanOrEqualToZero(0));
        System.out.println(ph.reverseBool(true));
        int[] array1 = {1};
        int[] array2 = {1, 5, 88, 7};
        System.out.println(ph.maxLength(array1, array2));
    }
}