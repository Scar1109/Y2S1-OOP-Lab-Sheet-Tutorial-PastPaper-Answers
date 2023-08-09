import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number, range;

        System.out.print("Enter a number :");
        number = scn.nextInt();

        System.out.print("Enter a  range :");
        range = scn.nextInt();

        for (int i = 1; i <= range; i++) {
            System.out.println(i + " x " + number + " = " + i * number);
        }

        scn.close();
    }
}