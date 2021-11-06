package Homeworks.dynamicArray;

public class DynamicArray {


    // սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա, կանչել -> extend() և ավելացնենք
    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    //1․ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․քցել հին մասիվի էլեմենտները նորի մեջ
    //3․հին մասիվի հղումը կապել նոր մասիվի հղման հետ։

    private void extend() {
        int[] arrayNew = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        array = arrayNew;
    }


    // եթե տրված ինդեքսը մեր ունեցած սահմաններում է, վերադարձնել
    //մասիվի index-երորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (array[index] <= array.length) {
            return index;
        } else {
            return -1;
        }

    }


    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }

    }

}
