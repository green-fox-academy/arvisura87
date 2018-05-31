import java.util.ArrayList;

public class Sum {

  public int sumOfIntList(ArrayList<Integer> integerArrayList) {
    int result = 0;

    if (integerArrayList == null) { return result; }
    else {
      for (Integer integer : integerArrayList) {
        result += integer;
      }
    }
    return result;
  }
}
