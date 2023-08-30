//Follow me on github for more https://github.com/Scar1109

package Ex02;

public class Main {

    public static void main(String[] args) {

        Feet feet1 = new Feet(5, 6);
        Feet feet2 = new Feet(3, 9);

        System.out.println("Initial values:");
        System.out.print("Feet 1: ");
        feet1.print();
        System.out.print("Feet 2: ");
        feet2.print();

        feet1.add(feet1, feet2);

        System.out.println("\nAfter adding feet1 and feet2:");
        System.out.print("Feet 1: ");
        feet1.print();
    }
}
