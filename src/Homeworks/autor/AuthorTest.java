package Homeworks.autor;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" How many authors are there? ");
        AuthorStorage authorStorage = new AuthorStorage();


        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {

            Author author = new Author();
            authorStorage.add(author);
            author.setAge(20);
            author.setName(" Poxos " );
            author.setSurname(" Petrosyan " );
            author.setGender("male");
            author.setEmail("@gmail.com");

        }
        authorStorage.println();

    }
}
