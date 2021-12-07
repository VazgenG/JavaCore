package homework;

public class Bolola {

    public static void main(String[] args) {

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};

        // 1) գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        {
            int count = 0;
            for (int i = 0; i < bolola.length; i++) {
                if (bolola[i] == 'o') {
                    count++;
                }
            }
            System.out.println("count = " + count);
            System.out.println("_____________");
        }

        // 2) գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները
        {
            int a = bolola.length;
            char c = (bolola[a / 2]);
            char c1 = (bolola[a / 2 + 1]);
            for (int i = 0; i < bolola.length; i++) {
            }
            System.out.print(c1 + " ");
            System.out.println(c);
            System.out.println("_____________");
        }

        // 3) պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

        {
            boolean a = false;
            for (int i = 0; i < bolola.length; i++) {
                int c = bolola.length;
                if (bolola[c - 1] == 'y' && bolola[c - 2] == 'l') {
                    a = true;
                }
            }
            System.out.println(a);
            System.out.println("_____________");
        }

        // 4) Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        boolean a = false;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == 'b' && bolola[i + 2] == 'b') {
                a = true;
                break;
            }
        }
        System.out.println(a);
        System.out.println("_____________");
    }

}