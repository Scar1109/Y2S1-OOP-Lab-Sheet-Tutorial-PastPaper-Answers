//Follow me on github for more https://github.com/Scar1109

package Ex03;

import java.util.*;

public class Ex03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> heights = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a height: ");
            int num = scanner.nextInt();
            heights.add(num);
        }

        for (Integer num : heights) {
            System.out.println(num);
        }

        scanner.close();
    }

}
