package Homeworks.autor;

public class AuthorStorage {

    private Author[] authors = new Author[10];
    private int size = 0;


    public void add(Author author) {
        if (authors.length == size) {
            extend();
        }
        authors[size++] = author;
    }

    private void extend() {
        Author[] arrayNew = new Author[authors.length + 10];
        for (int i = 0; i < size; i++) {
            arrayNew[i] = authors[i];
        }
        authors = arrayNew;
    }

  /*  public int getByIndex(int index) {
        if (index < 0 || index > authors.length+10) {
            return index;
        }
        return index;
    } */

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i] + " ");
        }

    }

    public void searchAuthor(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) ||
                    authors[i].getSurname().contains(keyword)) {
                System.out.println(authors[i]);
            }
        }
    }

    public void searchAuthorByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() >= minAge &&
                    authors[i].getAge() <= maxAge) {

                System.out.println(authors[i]);
            }
        }

    }
}
