//Follow me on github for more https://github.com/Scar1109
package Ex02;

import java.util.ArrayList;

class Student {
    private String studentID;
    private String name;
    private double gpa;

    public Student(String studentID, String name, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.gpa = gpa;
    }

    public String toString() {
        return "Student ID: " + studentID + ", Name: " + name + ", GPA: " + gpa;
    }
}

public class Ex02 {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("IT101", "Kaveen Dinethma", 4));
        studentList.add(new Student("IT102", "Sasindu Nadeeshan", 4));
        studentList.add(new Student("IT103", "Erandi Amarasekara", 4));

        System.out.println("Student Details:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
