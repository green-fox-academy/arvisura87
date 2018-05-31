import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CountLettersTest {

  static CountLetters countLetters;
  HashMap<Character, Integer> expectedMap;
  HashMap<Character, Integer> resultMap;


  @Before
  public void init() {
    countLetters = new CountLetters();
    expectedMap = new HashMap<>();
    resultMap = new HashMap<>();
  }

  @Test
  public void should_returnTrue_with_sameHashmapInput() {
    String input = "Alma";
    resultMap = countLetters.countLettersOccurrenceInString(input);

    expectedMap.put('a', 2);
    expectedMap.put('l', 1);
    expectedMap.put('m', 1);

    assertTrue(expectedMap.equals(resultMap));
  }

  @Test
  public void should_returnFalse_with_nullInput() {
    String input = null;
    resultMap = countLetters.countLettersOccurrenceInString(input);

    expectedMap.put('a', 2);
    expectedMap.put('l', 1);
    expectedMap.put('m', 1);

    assertFalse(expectedMap.equals(resultMap));
  }

}