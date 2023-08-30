//Follow me on github for more https://github.com/Scar1109

package Ex02;

//Interface Lab Sheet

interface ICompute {
    void calculate();

    void display();
}

class Person implements ICompute {
    private String name;
    private double basicSal;
    private double otRate;
    private double otHrs;
    private double netSal;

    public Person(String name, double basicSal, double otRate, double otHrs) {
        this.name = name;
        this.basicSal = basicSal;
        this.otRate = otRate;
        this.otHrs = otHrs;
    }

    @Override
    public void calculate() {
        this.netSal = this.basicSal + this.otRate * this.otHrs;
    }

    @Override
    public void display() {
        System.out.println("Net salary is " + this.netSal);
    }

}

class Box implements ICompute {

    private int length, width, height;
    private int volume;

    public Box(int length, int width, int height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculate() {
        this.volume = this.height * this.length * this.width;
    }

    @Override
    public void display() {
        System.out.println("Volume is " + this.volume);
    }
}

public class Main {
    public static void main(String[] args) {
        ICompute obj1 = new Person("Danushka", 40000, 1000, 5);
        obj1.calculate();
        obj1.display();

        ICompute obj2 = new Box(10, 20, 30);
        obj2.calculate();
        obj2.display();

        // 1. Implement the Person Class
        // making use of the ICompute
        // interface
        // a) Write a constructor
        // b) implements the methods
        // in ICompute
        // In compute() calculate
        // netSal

        // 2. Implement the Box Class
        // making use of the ICompute
        // interface
        // a) Write a constructor
        // b) implements the methods
        // in ICompute
        // In compute() calculate
        // volume

        // 3. Create variables of Box
        // and Person Type and
        // create objects
        // calculate and display
        // values

        // 4.Describe any advantage
        // you see in using interface
        // type variables seen in
        // the original main function code
        // variables obj1, obj2
        // as opposed to using object type
        // variables

    }
}