import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  static Sum sum;
  static ArrayList<Integer> integerList;


  @Before
  public void init() {
    sum = new Sum();
  }

  @BeforeClass
  public static void initClass() {
    integerList = new ArrayList<>();
  }

  @Test
  public void should_return6_with_input1_2_3() {
    integerList = new ArrayList<>(Arrays.asList(1, 2, 3));
    int result = sum.sumOfIntList(integerList);
    int expected = 6;

    assertEquals(expected, result);
  }

  @Test
  public void should_return0_with_inputEmptyList() {
    int result = sum.sumOfIntList(integerList);
    int expected = 0;

    assertEquals(expected, result);
  }

  @Test
  public void should_returnTheOneIntIn_with_inputOneInt() {
    integerList = new ArrayList<>(Arrays.asList(3));
    int result = sum.sumOfIntList(integerList);
    int expected = 3;

    assertEquals(expected, result);
  }
}