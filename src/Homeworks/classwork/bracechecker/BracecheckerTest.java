package Homeworks.classwork.bracechecker;

public class BracecheckerTest {
    public static void main(String[] args) {
        String text = "Hello (from) [Java]";
        BraceChecker braceChecker = new BraceChecker();
        braceChecker.check(text);
        System.err.println("Error:opened [ but closed } at 20");

    }
}
