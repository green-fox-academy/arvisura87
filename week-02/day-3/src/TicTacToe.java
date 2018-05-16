import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    System.out.println(ticTacResult("win-o.txt"));
    // should print O

    System.out.println(ticTacResult("win-x.txt"));
    // should print X

    System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }

  private static String ticTacResult(String s) {
    String result="dont know";
    Path filePath = Paths.get(s);
    try {
      List<String> lines = Files.readAllLines(filePath);
      if (lines.get(0).equalsIgnoreCase("o")){
        result="O";
      } else if (lines.get(0).equalsIgnoreCase("x")){
        result="X";
      } else if (lines.get(0).equalsIgnoreCase("draw")){
        result="draw";
      }
    } catch (IOException e) {
    }
    return result;
  }
}
