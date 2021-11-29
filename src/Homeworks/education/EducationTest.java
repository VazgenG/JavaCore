package Homeworks.education;

import java.util.Scanner;

public class EducationTest {

    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";


    public static void main(String[] args) {


        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_LESSONS:
                    printLessons();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessons();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudent();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }

    private static void deleteStudent() {

        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            studentStorage.delete(student);
        } else {
            System.err.println("Author does not exists");

        }
    }


    private static void deleteLessons() {
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            lessonStorage.delete(lesson);
        } else {
            System.err.println("Lesson does not found");

        }
    }


    private static void printLessons() {
        lessonStorage.print();
    }

    private static void printStudentsByLesson() {
        System.out.println("please input lesson name for show students");
        String name = scanner.nextLine();
        studentStorage.printByLesson(name);
    }

//    private static void printStudents() {
//        studentStorage.print();
//    }

    private static void addStudent() {
        System.out.println("Please input student's name");
        String name = scanner.nextLine();
        System.out.println("Please input student's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input student's email");
        String email = scanner.nextLine();
        System.out.println("Please input student's phone");
       int phone=Integer.parseInt(scanner.nextLine());
        System.out.println("Please input student's lesson");
        String lesson = scanner.nextLine();

        Student student = new Student(name, surname, age, email, phone, lesson);
       if (studentStorage.getByEmail(student.getEmail()) != null) {
            System.err.println("Invalid email. Student with this email already exists");
        } else {
            studentStorage.add(student);
            System.out.println("Thank you, student was added");
        }
    }

    private static void addLesson() {

        System.out.println("Please input lesson name");
        String name = scanner.nextLine();
        System.out.println("Please input lesson duration");
        double duration = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input lecturer name");
        String lecturerName = scanner.nextLine();
        System.out.println("Please input lesson price");
        double price = Integer.parseInt(scanner.nextLine());


        Lesson lesson = new Lesson(name, duration, lecturerName, price);
        if (lessonStorage.getByName(lesson.getName()) != null) {
            System.err.println("Invalid name. Lesson with this name already exists");
        } else {
            lessonStorage.add(lesson);
            System.out.println("Thank you, lesson was added");
        }
    }

    public static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for add lesson");
        System.out.println("Please input " + ADD_STUDENT + " for add student");
        System.out.println("Please input " + PRINT_STUDENTS + " for print student");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for print student by lesson");
        System.out.println("Please input " + PRINT_LESSONS + " for print lesson");
        System.out.println("Please input " + DELETE_LESSON_BY_NAME + " for delete lesson");
        System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " for delete student");
    }
}