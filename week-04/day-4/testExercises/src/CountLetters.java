import java.util.HashMap;

public class CountLetters {

  public HashMap<Character, Integer> countLettersOccurrenceInString(String word1) {
    HashMap<Character, Integer> map = new HashMap<>();

    if (word1 == null) {
      return map;
    }
    String word = word1.toLowerCase();

    for (int i = 0; i < word.length(); i++) {
      int counter = 0;

      for (int j = 0; j < word.length(); j++) {

        if (word.charAt(i) == word.charAt(j)) {
          counter++;
        }
        map.put(word.charAt(i), counter);
      }
    }
    return map;
  }
}
