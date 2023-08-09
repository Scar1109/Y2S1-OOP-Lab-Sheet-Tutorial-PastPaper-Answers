import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int fact = 1;

        System.out.print("Enter a value :");
        int number = scn.nextInt();

        if (number <= 0) {
            System.out.print("Please enter a positive number.");
        } else {
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }

            System.out.print("Factorial of given number is " + fact);
        }

        scn.close();

    }
}