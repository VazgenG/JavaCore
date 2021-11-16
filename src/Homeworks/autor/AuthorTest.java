package Homeworks.autor;
/*Մի հատ էլ AuthorTest եք սարքում, որտեղ մեյնի մեջ ծրագիրը հենց միացնենք, հարցնելու է քանի հատ հեղինակ ունենք,
        մենք scanner-ով մուտքագրելու ենք ինչ որ թիվ, օրինակ 5, պետք է ֆոր ֆռռանք այդ թվի չափով,
        ու այդ ֆորի մեջ ուզենք հեղինակի տվյալները, հետո սարքենք հեղինակի օբյեկտը,
        ու պահենք նախքան ֆոր-ը սարքած AuthorStorage կլասսի օբյեկտի մեջ։
        դե ֆորը կֆռռա ենթադրենք 5 անգամ, ու նույն բանը կանի։
        ֆորից դուրս կտպենք authorStorage.print() ը, ու կտեսնենք որ մեր ավելացրած բոլոր հեղինակի տվյալները պահվել են AuthorStorage-ում։*/

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" How many authors are there? ");
        AuthorStorage authorStorage = new AuthorStorage();
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
        }
        authorStorage.println();

    }
}
