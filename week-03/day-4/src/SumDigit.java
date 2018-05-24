public class SumDigit {

  public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

    int sumDigits = sumOfDigits(1987, 0);
    System.out.println(sumDigits);
  }

  private static int sumOfDigits(int i, int sum) {
    if (i != 0){
      sum += i % 10;
      i /= 10;
      return sumOfDigits(i, sum);
    } else {
      return sum;
    }
  }
}
