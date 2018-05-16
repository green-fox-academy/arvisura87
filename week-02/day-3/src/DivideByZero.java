import java.util.Scanner;

public class DivideByZero {
  // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    divideByZero(num);
  }

  private static void divideByZero(int i) {

    try {
      System.out.println(10/i);
    } catch (ArithmeticException e){
      System.out.println("Fail");
    }
  }
}
