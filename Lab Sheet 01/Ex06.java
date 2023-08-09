public class Ex06 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {

            int j = 1;
            while (j <= 5) {
                System.out.print("*");
                j++;
            }

            System.out.print("   ");

            int k = 1;
            while (k <= 5 - i) {
                System.out.print(" ");
                k++;
            }

            int m = 1;
            while (m <= i) {
                System.out.print("* ");
                m++;
            }

            System.out.println();
            i++;
        }
    }

}
