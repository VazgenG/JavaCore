package Homeworks.autor;

import javax.xml.namespace.QName;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(title)) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().contains(email)) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchcountBooksByAuthor(String email) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().contains(email)) {
                count++;
            }

        }
        System.out.println(count);
    }

    public Book getByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void delete(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index");
        }
        for (int i = index + 1; i < size; i++) {
            books[i - 1] = books[i];
        }
        size--;
    }

    public void deleteBook(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {

            }
            delete(i);
        }
    }

}