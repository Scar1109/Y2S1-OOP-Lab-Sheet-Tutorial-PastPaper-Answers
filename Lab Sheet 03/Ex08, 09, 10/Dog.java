public class Dog extends Pet {
    private int noOfMasters;

    public Dog(String n, String o, int a, int m) {
        super(n, o, a);
        this.noOfMasters = m;
    }

    public Dog(String n, String o) {
        super(n, o, 0);
        this.noOfMasters = 1;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("I am a dog. I have " + this.noOfMasters + " masters at home.");
    }

}
