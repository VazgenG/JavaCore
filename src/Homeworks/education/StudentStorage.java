package Homeworks.education;

import Homeworks.autor.Author;

public class StudentStorage {
    private Student[] students = new Student[20];
    private int size;

    public void add(Student student) {
        if (students.length == size) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, students.length);
        students = tmp;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public  Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;

    }

    public void printByLesson(String name) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().equals(name)) {
                System.out.println(students[i]);
            }else {
                System.out.println("The lesson has not found");
            }
        }
    }

    public void delete(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student)) {
                ArrayUtil.deleteByIndex(students, i, size);
                break;
            }
        }
    }
}
