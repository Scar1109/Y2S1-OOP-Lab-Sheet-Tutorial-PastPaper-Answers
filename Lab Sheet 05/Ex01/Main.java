//Follow me on github for more https://github.com/Scar1109

package Ex01;

//Lab Sheet on Abstract Classes
//Starter Code

abstract class Animal {
    private String name;

    public Animal() {
        this.name = " ";
        System.out.println("Animal constructor called");
    }

    public Animal(String name) {
        this.name = name;
    }

    abstract public String speak();

    public void display() {
        System.out.println("My name is " + this.name + ".  " + this.speak() + ".");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return "Bow Wow";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        System.out.println("Cat constructor called");
    }

    public String speak() {
        return "Meow Meow";
    }
}

class ToyCat extends Cat {
    String manufacturer;

    public ToyCat(String name, String manufacturer) {
        super(name);
        this.manufacturer = manufacturer;
    }

    public ToyCat() {
        this.manufacturer = " ";
        System.out.println("Toycat constructor called");
    }

    public void display() {
        super.display();
        System.out.println("I am from " + manufacturer + ".");
    }
}

class Main {
    public static void main(String[] args) {

        // Cat mycat = new Cat("Micky");
        // mycat.display();
        //
        // Dog mydog = new Dog("Rover");
        // mydog.display();
        //
        // ToyCat mytoy = new ToyCat("kittie", "Toysrus");
        // mytoy.display();

        // 1. Make the Animal class an abstract class
        // Make the speak method an abstract method
        // Modifiy the main function.
        // What needs to be removed and why?

        // 2. Add default constructors to each of the
        // classes. Display a message giving
        // details of the name of the constructor.
        // e.g.

        // public Animal() {
        // System.out.println
        // ("Animal constructor called");
        // }
        // Create an object of the ToyCat classes
        // call the default constructor
        // What will be the output?
        // Can you explain how why the output
        // appears as displayed?

        ToyCat mytoy1 = new ToyCat();

    }
}