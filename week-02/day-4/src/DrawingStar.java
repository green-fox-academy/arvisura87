import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingStar {
  public static void mainDraw(Graphics graphics) {
    drawStar(graphics);
  }

  private static void drawStar(Graphics graphics) {
    graphics.setColor(Color.red);
    int x2= WIDTH/2;
    int y2= HEIGHT/2;
    int x0=0;
    int y0=0;
    int temp=20;
    for (int i = 0; i < 10; i++) {
      graphics.drawLine(x2, y0 + i*temp, x2 - (i+1)*temp, y2);
    }
    for (int i = 0; i < 10; i++) {
      graphics.drawLine(x0 + i*temp, y2, x2, y2 - (i*temp));
    }

  }

  // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
      JFrame jFrame = new JFrame("Star");
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
