public class Ex01 {
	public static void main(String[] args) {
		int miles = 26, yards = 385;
		double kilometers;

		kilometers = (double) (miles + yards / 1760.0) * 1.609;

		System.out.print("kilometers = " + kilometers);
	}
}