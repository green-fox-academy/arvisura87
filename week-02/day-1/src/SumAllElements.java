public class SumAllElements {
  // - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`

  public static void main(String[] args) {

    int[] ai = {3, 4, 5, 6, 7};

    System.out.println(sum(ai));
  }

  private static int sum(int[] ai) {

    int sum=0;

    for (int i = 0; i < ai.length; i++) {
      sum+=ai[i];
    }
    return sum;
  }
}
