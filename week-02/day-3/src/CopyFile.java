import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  // Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

  public static void main(String[] args) {

    String filename="name.txt";
    System.out.println(copyFile(filename));
  }

  private static boolean copyFile(String filename) {
    String copy="copy.txt";
    Path filePath = Paths.get(filename);
    Path copyPath = Paths.get(copy);
    try {
      List<String> lines = Files.readAllLines(filePath);
      Files.write(copyPath, lines);
      return true;
    } catch (IOException e) {
      return false;
    }
  }
}
