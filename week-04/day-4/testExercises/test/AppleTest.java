import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppleTest {

  static Apple apple;

  @BeforeClass
  public static void init() {
    apple = new Apple();
  }

  @Test
  public void should_returnStringApple_when_noInput() {
    String expected = "apple";
    String result = apple.getApple();

    assertEquals(expected, result);
  }
}