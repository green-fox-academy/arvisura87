import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Anagram {

  public boolean areAnagrams (String word1, String word2) {
    return charsFromStringToList(word1).containsAll(charsFromStringToList(word2));
  }

  public List<Character> charsFromStringToList (String word) {
    List<Character> resultList = new ArrayList<>();

    for (int i = 0; i < word.length(); i++) {
      resultList.add(word.charAt(i));
    }
    return resultList;
  }
}
