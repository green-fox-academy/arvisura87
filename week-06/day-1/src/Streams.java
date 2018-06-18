import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

  public static void main(String[] args) {

    ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(getEvenNumbers(numbers1));
    System.out.println(getAverageOfOddNumbers(numbers1));
    System.out.println(getSquaredPositiveNumbers(numbers1));

    ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    System.out.println(getSquaredNumbersTwentyAbove(numbers2));
  }

  private static List getSquaredNumbersTwentyAbove(ArrayList<Integer> numbers2) {

    return numbers2.stream()
        .map(n -> n * n)
        .filter(n -> n > 20)
        .collect(Collectors.toList());
  }

  private static List getSquaredPositiveNumbers(ArrayList<Integer> numbers) {

    return numbers.stream()
        .filter(x -> x >= 0)
        .map(n -> n * n)
        .collect(Collectors.toList());
  }

  private static double getAverageOfOddNumbers(ArrayList<Integer> numbers) {

    return numbers.stream()
        .filter(x -> x % 2 != 0)
        .mapToInt(x -> x)
        .average()
        .getAsDouble();
  }

  private static List getEvenNumbers(ArrayList<Integer> numbers) {

    return numbers.stream()
        .filter(x -> x % 2 == 0)
        .collect(Collectors.toList());
  }
}
