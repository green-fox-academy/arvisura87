import jdk.nashorn.api.tree.ForInLoopTree;

import java.util.Scanner;

public class ParametricAverage34 {
  // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
  public static void main(String[] args) {

    System.out.println("Please give me a number:");

    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    int num = scanner.nextInt();
    int count = 0;
    double result = 0.0;

    System.out.println("Give me " + num + " integers:");

    for (int i = 0; i < num; i++) {
      int num2 = scanner.nextInt();
      result+=num2;
      count++;
    }

    System.out.println("Sum: " + result + ", Average: " + result/count);
  }
}
