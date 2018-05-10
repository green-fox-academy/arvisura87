import java.util.Scanner;

public class HelloUser14 {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Hello " + userInput + "!");
    }
}
