import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void mainDraw(Graphics graphics) {
    // Create a function that takes 1 parameter:
    // An array of {x, y} points
    // and connects them with green lines.
    // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}

    int[][] array1 = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
    int[][] array2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

    connectTheDots(array1, graphics);
    connectTheDots(array2, graphics);

  }

  private static void connectTheDots(int[][] array, Graphics graphics) {

    int temp = 0;
    for (int i = 0; i < array.length; i++) {

      graphics.setColor(Color.green);
      if (i==array.length-1){
        graphics.drawLine(array[i][temp], array[i][temp+1], array[temp][temp], array[temp][temp+1]);
      } else {
        graphics.drawLine(array[i][temp], array[i][temp+1], array[i+1][temp], array[i+1][temp+1]);
      }
    }
  }

  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 323;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}


// create a 300x300 canvas.