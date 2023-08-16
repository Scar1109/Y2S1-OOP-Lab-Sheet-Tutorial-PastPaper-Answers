class Student {
    String name;
    String ditno;
    String address;

    public Student(String name, String ditno, String address) {
        this.name = name;
        this.ditno = ditno;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("DIT No: " + ditno);
        System.out.println("Address: " + address);
    }

    void setName(String name){
        this.name = name;
    }

    void setAddress(String address){
        this.address = address;
    }

    void setDit(String ditno){
        this.ditno = ditno;
    }

    String getName(){
        return this.name;
    }

    String getAddress(){
        return this.address;
    }

    String getDit(){
        return this.ditno;
    }

    String getDetails(){
        return "I am Student.\nMy name is " + name + ".\nI am from " + address + ".\nMy dit no is " + ditno + ".";
    }
}

public class Ex04 {
    public static void main(String[] args) {

        Student student1 = new Student("Kaveen", "123", "123 Main St");
        Student student2 = new Student("Dinethma", "452", "456 Flower St");

        student1.setAddress("422 Flower road");
        student2.setName("Kaveen");
        student2.setDit("3242");

        System.out.println(student1.getName());

        System.out.println(student1.getDetails());
    }
}
