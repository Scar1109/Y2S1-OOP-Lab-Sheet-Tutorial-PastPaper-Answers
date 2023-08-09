import java.io.*;

public class Ex04 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the height: ");
        float height = Float.parseFloat(reader.readLine());
        System.out.print("Enter the width: ");
        float width = Float.parseFloat(reader.readLine());
        System.out.print("Enter the length: ");
        float length = Float.parseFloat(reader.readLine());

        System.out.println("Cube volume is: " + (length * width * height));
    }
}
