import java.util.Arrays;

public class SwapElements {
  // - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

  public static void main(String[] args) {

    String[] abc={"first", "second", "third"};
    System.out.println(Arrays.toString(swapFirstWithThird(abc)));
  }

  public static String[] swapFirstWithThird(String[] abc){
    String[] swapped=new String[abc.length];

    for (int i = 0; i < 3; i++) {
      swapped[i]=abc[2-i];
      }
  return swapped;
  }
}
