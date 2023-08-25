public class Main {

    public static void main(String[] args) {
        Pet p = new Pet("Lissie", "Smith", 3);
        p.showDetails();
        Cat c = new Cat("Kyan", "Silva", 4, 4);
        c.showDetails();
        Pet p2 = new Pet("Maggie", "Praveen");
        p2.showDetails();
        Cat c2 = new Cat("Rayan", "Kane");
        c2.showDetails();
        Dog d = new Dog("Cooper", "Pasindu");
        d.showDetails();

        Pet p3 = c;
        p3.showDetails();
    }

}