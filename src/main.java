import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter String to Reverse: ");

        String input = inputObject.nextLine();
        reverser test = new reverser();
        String result = test.reverse(input);
        System.out.println("Reversed String: " + result);
    }
}