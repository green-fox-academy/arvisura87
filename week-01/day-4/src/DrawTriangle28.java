import java.util.Scanner;

public class DrawTriangle28 {
    // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
    public static void main(String[] args) {

        System.out.println("Please give me a number:");

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        String triangle= "*";

        for (int i = 0; i < num; i++) {
            System.out.println(triangle);
            triangle+="*";
        }
    }
}
