package Lessons.Lesson12;

public class Student {

    private String name;
    private String surname;
    private String phoneNumber;
    private int age;
    private String lessonName;

    public Student(String name, String surname, String phoneNumber, int age, String lessonName) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.lessonName = lessonName;

    }
    public String getName(){
        return  name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getLessonName() {
        return lessonName;
    }
}
