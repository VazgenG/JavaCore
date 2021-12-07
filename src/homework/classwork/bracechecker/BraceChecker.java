package homework.classwork.bracechecker;

public class BraceChecker {

    int i;
    // սա հենց տեքստն է
    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վրեևի տեքստին
    //որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․

    public BraceChecker() {
        this.text = text;
    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք stack-ի հետ, թե վերևի տեղտ-ի
    public void check(String text) {
        Stack stack = new Stack();
        boolean isValid = true;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int pop;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println(" Error: Closed " + c +
                                " but opend nothing at " + i);
                    } else if (pop != '(') {
                        isValid = false;
                        System.err.println(" Error: Closed " + c +
                                " but opened " + (char) pop + " at " + i);
                    }
                    break;

                case '}':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println(" Error: Closed " + c +
                                " but opend nothing at " + i);
                    } else if (pop != '{') {
                        isValid = false;
                        System.err.println(" Error: Cloosed " + c +
                                " but oopened " + (char) pop + " at " + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println(" Error: Closed " + c +
                                " but opend nothing at " + i);
                    } else if (pop != '[') {
                        isValid = false;
                        System.err.println(" Error: Cloosed " + c +
                                " but oopened " + (char) pop + " at " + i);
                    }
                    break;
            }
        }
        if (isValid = true) {
            System.out.println(" Everything is OK ");
        }
    }
}
