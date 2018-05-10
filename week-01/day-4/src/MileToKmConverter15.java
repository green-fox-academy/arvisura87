import java.util.Scanner;

public class MileToKmConverter15 {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me an integer that is a distance in kilometers:");

        Integer userInput = Integer.parseInt(scanner.nextLine());

        double douUserInt = userInput;
        douUserInt = douUserInt*0.621371192;

        System.out.println(douUserInt);
    }
}
