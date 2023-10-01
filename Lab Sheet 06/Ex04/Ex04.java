package Ex04;

import java.util.HashMap;
import java.util.Scanner;

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
        return "\n\nStudent ID: " + studentID + ",\nName: " + name + ",\nGPA: " + gpa;
    }

    public String getStudentID() {
        return studentID;
    }
}

public class Ex04 {
    public static void main(String[] args) {

        // Create a HashMap to store students by student number
        HashMap<String, Student> studentMap = new HashMap<>();

        // Add students to the HashMap
        studentMap.put("IT101", new Student("IT101", "Kaveen Dinethma", 4));
        studentMap.put("IT102", new Student("IT102", "Sasindu Nadeeshan", 4));
        studentMap.put("IT103", new Student("IT103", "Erandi Amarasekara", 4));

        // Input a student number to access details
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a student number :");
        String studentNumberToAccess = scn.nextLine();

        // Retrieve and print the details of the student with the Entered student number
        Student student = studentMap.get(studentNumberToAccess);

        if (student != null) {
            System.out.println("Student Details for Student Number " + studentNumberToAccess + ":");
            System.out.println(student);
        } else {
            System.out.println("Student with Student Number " + studentNumberToAccess + " not found.");
        }
        scn.close();
    }
}
