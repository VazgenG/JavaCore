package Homeworks.classwork.bracechecker;

public class BraceChecker {

    int i;
    // սա հենց տեքստն է
    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վրեևի տեքստին
    //որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․

    public BraceChecker() {
        String text = new String();
    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք stack-ի հետ, թե վերևի տեղտ-ի
    public void check(String text) {
        Stack stack = new Stack();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
                continue;
            }

            char check;
            switch (c) {
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        //   System.out.println("opened {  and closed }");
                        break;

                case ')':
                    check = stack.pop();
                    if (check == '}' || check == ']')
                        //  System.out.println("opened (  and closed )");
                        break;

                case ']':
                    check = stack.pop();
                    if (check == '}' || check == ')')
                        //      System.out.println("opened [  and closed ]");
                        break;
                default:
                     System.err.println();
            }
        }
    }
}
