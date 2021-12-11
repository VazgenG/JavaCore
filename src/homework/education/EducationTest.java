package homework.education;

import homework.education.commands.EducatinCommands;
import homework.education.commands.UsersCommands;
import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.storage.LessonStorage;
import homework.education.storage.StudentStorage;
import homework.education.model.User;
import homework.education.storage.UserStorage;

import java.util.Scanner;


public class EducationTest implements EducatinCommands {

    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();
    static UserStorage userStorage = new UserStorage();


    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            UsersCommands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    insertLogin();
                    break;
                case REGISTER:
                    register();
                    break;
            }
        }
    }

    private static void typeAdmin() {
        boolean isRun = true;
        while (isRun) {
            EducatinCommands.printAdminCommands();
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


    private static void typeUser() {
        boolean isRun = true;
        while (isRun) {
            EducatinCommands.printUserCommands();
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
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }

    private static void insertLogin() {

        System.out.println(" Please input email ");
        String email = scanner.nextLine();
        System.out.println(" Please input password ");
        String password = scanner.nextLine();
        userStorage.getByEmail(email);
        userStorage.getByPassword(password);
        User user = userStorage.getByEmail(email);

        if (userStorage.getByEmail(email) == null
                && userStorage.getByPassword(password) == null) {
            System.err.println("Invalid email or password, please try again");
        } else if (user.getType().equals("user")) {
            typeUser();
        } else if (user.getType().equals("admin")) {
            typeAdmin();
        }
    }


    private static void register() {
        System.out.println("Please input user's name");
        String name = scanner.nextLine();
        System.out.println("Please input user's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input user's email");
        String email = scanner.nextLine();
        System.out.println("Please input user's password");
        String password = scanner.nextLine();
        System.out.println("Please input user's type");
        String type = scanner.nextLine();

        User user = new User(name, surname, email, password, type);
        if (userStorage.getByEmail(user.getEmail()) != null) {
            System.err.println("User with this email already exists");
        } else {
            userStorage.add(user);
            System.out.println("User was added");
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
        int phone = Integer.parseInt(scanner.nextLine());
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
}