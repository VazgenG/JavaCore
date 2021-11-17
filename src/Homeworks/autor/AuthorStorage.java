package Homeworks.autor;

public class AuthorStorage {
    // սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private Authorclass[] array;
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա, կանչել -> extend() և ավելացնենք
     void add(Authorclass author) {
        if (array.length == size) {
            extend();
        }
        array[size++] = author;
    }

    private void extend() {
        Authorclass[] arrayNew = new Authorclass[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        array = arrayNew;
    }


    // եթե տրված ինդեքսը մեր ունեցած սահմաններում է, վերադարձնել
    //մասիվի index-երորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index < 0 || index > array.length+10) {
            return index;
        }
        return index;
    }


    public void println() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }

    }

}
