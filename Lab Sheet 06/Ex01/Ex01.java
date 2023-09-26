package Ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        if (numbers.isEmpty()) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList is not empty.");
        }
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            numbers.add(num);
        }
        int total = 0;
        for (Integer num : numbers) {

            System.out.println(num);
            total += num;
        }

        System.out.println("Total is " + total);

    }
}