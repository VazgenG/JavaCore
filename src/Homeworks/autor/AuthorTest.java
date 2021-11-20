package Homeworks.autor;

import java.util.Scanner;

public class AuthorTest {

    private static Scanner scanner = new Scanner(System.in);
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String SEARCH_AUTHOR = "2";
    private static final String SEARCH_AUTHOR_BY_AGE = "3";
    private static final String PRINT_AUTHORS = "4";
    private static final String ADD_BOOK = "5";
    private static final String PRINT_BOOKS = "6";
    private static final String SEARCH_BOOK_BY_TITLE = "7";

    public static void main(String[] args) {

        authorStorage.add(new Author("poxos", "poxosyan", "poxos@mail.com", 22, "male"));
        authorStorage.add(new Author("petros", "petrosyan", "petros@mail.com", 33, "male"));
        authorStorage.add(new Author("martiros", "martirosyan", "martiros@mail.com", 44, "male"));
        bookStorage.add(new Book("The Hobbit, or There and Back Again", "fantasy", 15.6, 150));

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case SEARCH_AUTHOR:
                    searchAuthor();
                    break;
                case SEARCH_AUTHOR_BY_AGE:
                    searchAuthorByAge();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case ADD_BOOK:
                    addBOOK();
                case SEARCH_BOOK_BY_TITLE:
                    searchBook();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                default:
                    System.out.println("invalid command!");
            }

        }
    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_AUTHOR + " for ADD_AUTHOR");
        System.out.println("Please input " + SEARCH_AUTHOR + " for SEARCH_AUTHOR");
        System.out.println("Please input " + SEARCH_AUTHOR_BY_AGE + " for SEARCH_AUTHOR_BY_AGE");
        System.out.println("Please input " + PRINT_AUTHORS + " for PRINT_AUTHORS");
        System.out.println("Please input " + ADD_BOOK + " for ADD_BOOK ");
        System.out.println("Please input " + PRINT_BOOKS + " for PRINT_BOOK ");
        System.out.println("Please input " + SEARCH_BOOK_BY_TITLE + " for SEARCH_BOOK_BY_TITLE ");
    }

    private static void searchAuthorByAge() {
        System.out.println("Please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchAuthorByAge(minAge, maxAge);
    }

    private static void searchAuthor() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchAuthor(keyword);

    }

    private static void searchBook() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchBook(keyword);

    }

    private static void addAuthor() {
        System.out.println("please input author's name");
        String name = scanner.nextLine();

        System.out.println("please input author's surname");
        String surname = scanner.nextLine();

        System.out.println("please input author's email");
        String email = scanner.nextLine();

        System.out.println("please input author's gender");
        String gender = scanner.nextLine();

        System.out.println("please input author's age");
        int age = Integer.parseInt(scanner.nextLine());

        Author author = new Author(name, surname, email, age, gender);
        authorStorage.add(author);
        System.out.println("Thank you! Author was added");

    }

    private static void addBOOK() {

        System.out.println("please input book title");
        String title = scanner.nextLine();

        System.out.println("please input book description");
        String description = scanner.nextLine();

        System.out.println("please input book price");
        Double price = Double.valueOf(scanner.nextLine());

        System.out.println("please input book count");
        int count = Integer.parseInt(scanner.nextLine());


        Book book = new Book(title, description, price, count);
        bookStorage.add(book);
        System.out.println("Thank you! Author was added");
    }


//        Author author = new Author();
//        author.setName(name);
//        author.setSurname(surname);
//        author.setAge(age);
//        author.setEmail(email);
//        author.setGender(gender);


}