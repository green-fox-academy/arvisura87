import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  static Sum sum;

  @Before
  public void init() {
    sum = new Sum();
  }

  @Test
  public void sumOfIntList() {
    ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3));
    int result = sum.sumOfIntList(integerList);
    int expected = 6;

    assertEquals(expected, result);
  }
}