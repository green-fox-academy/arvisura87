import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  static Anagram anagram;

  @Before
  public void init() {
    anagram = new Anagram();
  }

  @Test
  public void should_returnTrue_with_differentWordWithCharsInDifferentPlaces() {
    String input1 = "alma";
    String input2 = "mlaa";

    assertEquals(true, anagram.areAnagrams(input1, input2));
  }

  @Test
  public void should_returnFalse_with_differentWords() {
    String input1 = "alma";
    String input2 = "fghj";

    assertEquals(false, anagram.areAnagrams(input1, input2));
  }

}