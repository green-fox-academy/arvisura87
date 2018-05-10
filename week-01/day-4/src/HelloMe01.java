import java.util.Scanner;

public class HelloMe01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Hello " + userInput + "!");
    }
}
