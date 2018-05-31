import java.util.ArrayList;

public class Sum {

    public int sumOfIntList(ArrayList<Integer> integerArrayList) {
      int result = 0;

      for (Integer integer : integerArrayList) {
        result += integer;
      }
      return result;
    }
}
