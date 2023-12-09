public class Ex02 {

    public static void main(String[] args) {

        print("Age is : ", 23);
        print("Name is : ", "Mike");
        print("Price is :", 12.0);

    }

    public static <E> void print(String message, E val) {
        System.out.println(message + " : " + val);
    }

}
