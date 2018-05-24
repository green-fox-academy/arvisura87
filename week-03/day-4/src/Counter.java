public class Counter {

  public static void main(String[] args) {

    // Write a recursive function that takes one parameter: n and counts down from n.

    countsDown(10);
  }

  private static void countsDown(int i) {
    if (i > 0){
      System.out.println(i);
      countsDown(i-1);
    } else {
      return;
    }

  }
}
