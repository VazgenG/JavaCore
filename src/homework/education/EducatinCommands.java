package homework.education;



public interface EducatinCommands extends UsersCommands {



     String EXIT = "0";
     String ADD_LESSON = "1";
     String ADD_STUDENT = "2";
     String PRINT_STUDENTS = "3";
     String PRINT_STUDENTS_BY_LESSON = "4";
     String PRINT_LESSONS = "5";
     String DELETE_LESSON_BY_NAME = "6";
     String DELETE_STUDENT_BY_EMAIL = "7";


     public static void printAdminCommands() {
          System.out.println("Please input " + EXIT + " for EXIT");
          System.out.println("Please input " + ADD_LESSON + " for add lesson");
          System.out.println("Please input " + ADD_STUDENT + " for add student");
          System.out.println("Please input " + PRINT_STUDENTS + " for print student");
          System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for print student by lesson");
          System.out.println("Please input " + PRINT_LESSONS + " for print lesson");
          System.out.println("Please input " + DELETE_LESSON_BY_NAME + " for delete lesson");
          System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " for delete student");
     }

    public static void printUserCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for add lesson");
        System.out.println("Please input " + ADD_STUDENT + " for add student");
        System.out.println("Please input " + PRINT_STUDENTS + " for print student");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for print student by lesson");
        System.out.println("Please input " + PRINT_LESSONS + " for print lesson");

    }

}


