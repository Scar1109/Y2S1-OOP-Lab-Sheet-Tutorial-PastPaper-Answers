public class Pet {
    private String name;
    private String owner;
    private int age;

    public Pet(String n, String o, int a) {
        this.name = n;
        this.owner = o;
        this.age = a;
    }

    public Pet(String name, String owner) {
        super();
        this.name = name;
        this.owner = owner;
        this.age = 0;
    }

    public void showDetails() {
        System.out.println("I am a pet. My name is " + this.name + ". My owner is " + this.owner);
    }
}
