package homework.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();
        da.add(40);
        da.add(30);
        da.add(3);
        da.add(35);
        da.add(70);
        da.print();
      /*  da.delete(2);
        System.out.println();
        da.print();

        da.add(13, 3);
        System.out.println();
        da.print();*/

        int[] numbers = {11, 22, 33, 44, 55};
        da.add(numbers);
        da.print();

        System.out.println(da.isExist(2));
    }
}
