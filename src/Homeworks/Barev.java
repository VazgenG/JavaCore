package Homeworks;

public class Barev {
    public static void main(String[] args) {


        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};


        for (int i = 0; i < text.length; i++) {
            for (int j = i-1; j < i; j++) {
                char a = (text[i]);
                if (a == ' ') {
                    break;


                } else {
                    System.out.print(a);
                }

            }


        }
    }
}