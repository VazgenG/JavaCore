package Homeworks.autor;

import java.net.BindException;
import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" How many authors are there? ");
        AuthorStorage authorStorage = new AuthorStorage();
        Authorclass author = new Authorclass();
        authorStorage.add(author);
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
           // authorStorage.add();
         //   Authorclass author = new Authorclass();
            author.setAge(20);
            author.setName(" Poxos ");
            author.setSurname(" Petrosyan ");
            author.setGender("male");
            author.setEmail("@gmail.com");

        }
        authorStorage.println();

    }
}
