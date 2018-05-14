import java.util.Arrays;

public class AppendA {
  // - Create an array variable named `animals`
//   with the following content: `["kuty", "macsk", "cic"]`
// - Add all elements an `"a"` at the end
  public static void main(String[] args) {
    String[] animals={"kuty", "macsk", "cic"};

    System.out.println(Arrays.toString(appendA(animals)));
  }

  public static String[] appendA(String[] app){
    for (int i = 0; i < app.length; i++) {
      app[i]+="a";
    }
    return app;
  }
}
