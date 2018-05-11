import java.util.Scanner;

public class DrawPyramid29 {
    // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
    public static void main(String[] args) {

        System.out.println("Please give me a number:");

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int var = num;
        String star= "*";
        String empty= " ";

        for (int i = 0; i <= num; i++) {

            for (int j = 1; j < var+1; j++) {
                System.out.print(empty);
            }

            var--;

            for (int j = 0; j < i*2-1; j++) {
                System.out.print(star);
            }

            System.out.println("");
        }
    }
}
