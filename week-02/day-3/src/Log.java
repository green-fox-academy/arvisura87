import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Log {
  // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
  public static void main(String[] args) {

    String filename = "log.txt";
    Path filePath = Paths.get(filename);
    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
    }

    System.out.println(unique(lines));

  }

  private static ArrayList<String> unique(List<String> lines) {

    String[] line = new String[lines.size()];
    ArrayList<String> unique = new ArrayList<>();

    for (int i = 0; i < lines.size(); i++) {
      line[i]=lines.get(i).split(" ")[8];
    }

    for (int i = 0; i < line.length; i++) {
      for (int j = 0; j < unique.size(); j++) {
        if (line[i]!=unique.get(j)){
          unique.add(line[i]);
        } else {
          continue;
        }
      }
    }
    return unique;
  }
}
