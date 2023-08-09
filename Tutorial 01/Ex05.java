import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to count: ");
        char targetCharacter = scanner.next().charAt(0);

        int occurrenceCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetCharacter) {
                occurrenceCount++;
            }
        }

        System.out.println(
                "The character '" + targetCharacter + "' appears " + occurrenceCount + " times in the string.");

        scanner.close();
    }
}
