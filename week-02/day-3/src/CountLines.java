import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
  // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String filename = scanner.nextLine();
    System.out.println(countLines(filename));

  }

  private static int countLines(String filename) {

    int count=0;

    try {
      Path filePath = Paths.get(filename);
      List<String> lines = Files.readAllLines(filePath);
      count = lines.size();
    } catch (IOException e) {
    }
    return count;
  }
}
