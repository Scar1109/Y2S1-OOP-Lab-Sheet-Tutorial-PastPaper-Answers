class Student {
    String name;
    int ditno;
    String address;

    public Student(String name, int ditno, String address) {
        this.name = name;
        this.ditno = ditno;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("DIT No: " + ditno);
        System.out.println("Address: " + address);
    }
}

public class Ex02 {
    public static void main(String[] args) {

        Student student1 = new Student("Kaveen", 123, "123 Main St");
        Student student2 = new Student("Dinethma", 452, "456 Flower St");

        student1.display();
        student2.display();
    }
}
