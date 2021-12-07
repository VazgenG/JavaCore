package homework.education.commands;

public interface UsersCommands  {


    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";

    public static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + LOGIN + " for log in ");
        System.out.println("Please input " + REGISTER + " for add user");

    }

}
