class Student {
    String name = "kaveen";
    int ditno = 123;
    String address = "123 Flower st";

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("DIT No: " + ditno);
        System.out.println("Address: " + address);
    }
}

public class Ex01 {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.display();
    }
}
