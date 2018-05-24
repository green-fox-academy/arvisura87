public class NumberAdder {

  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

    int sum = addingNumbers(1, 20, 0);
    System.out.println(sum);
  }

  private static int addingNumbers(int counter, int i, int sum) {
    if (counter<=i){
      sum += counter;
      counter++;
      return addingNumbers(counter, i, sum);
    } else {
      return sum;
    }
  }
}
