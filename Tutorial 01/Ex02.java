import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int number;

        System.out.println("Enter numbers :");

        while (true) {
            number = scn.nextInt();

            if (number < 0) {
                break;
            }

            sum += number;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("The average of the entered numbers is: " + average);

        scn.close();
    }
}
