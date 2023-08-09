import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("Enter the height : ");
		float height = scn.nextFloat();
		System.out.print("Enter the width : ");
		float width = scn.nextFloat();
		System.out.print("Enter the length : ");
		float length = scn.nextFloat();

		System.out.println("Cube is : " + length * width * height);
		scn.close();
	}
}