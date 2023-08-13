import java.util.Scanner;
import java.text.DecimalFormat;

class Student {
    private String id, name;
    private int mark01, mark02, mark03;
    private double avg;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.mark01 = 0;
        this.mark02 = 0;
        this.mark03 = 0;
    }

    public void inputMarks() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        this.mark01 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        this.mark02 = scanner.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        this.mark03 = scanner.nextInt();

        scanner.close();
    }

    public void calcAvg() {
        this.avg = (this.mark01 + this.mark02 + this.mark03) / 3.0;
    }

    public void displayInfo() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Student ID: " + this.id);
        System.out.println("Student Name: " + this.name);
        System.out.println("Average Marks: " + df.format(this.avg));
    }

}

public class AvgCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        Student student = new Student(studentId, studentName);

        student.inputMarks();
        student.calcAvg();
        student.displayInfo();

        scanner.close();
    }
}
