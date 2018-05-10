import java.util.Scanner;

public class AnimalsAndLegs16 {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me two numbers:\n");
        Integer chickenLegs = scanner.nextInt();
        Integer pigLegs = scanner.nextInt();

        System.out.println(((chickenLegs*2)+(pigLegs*4)) + " legs all the animals have");
    }
}
