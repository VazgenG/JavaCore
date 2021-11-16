package Homeworks.autor;

import static java.lang.Integer.parseInt;


public class AuthorStorage {
    private int[] Author = new int[getByIndex()];

    private int getByIndex() {
        return 0;
    }

    private int size = 0;

    public void add(Author author) {
        if (Author.length == size) {
            extend();
        }
        int value;
        value = parseInt(null);
        Author[size++] = value;
    }


    private void extend() {
        int[] arrayNew = new int[Author.length + 10];
        for (int i = 0; i < Author.length; i++) {
            arrayNew[i] = parseInt(String.valueOf(Author[i]));
        }
        Author = arrayNew;
    }


    public int getByIndex(int index) {
        if (Author[index] <= Author.length) {
            return index;
        } else {
            return -1;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(Author[i] + " ");
        }

    }

    public void println() {
        System.out.println();
    }

    private class Author {
    }
}