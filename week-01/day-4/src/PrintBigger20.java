import java.util.Scanner;

public class PrintBigger20 {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        System.out.println("Please give me two numbers:");

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1>num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
