package minitennis;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Game2 extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.fillOval(0, 0, 30, 30);
        g2d.drawOval(0, 50, 30, 30);
        g2d.fillRect(50, 0, 30, 30);
        g2d.drawRect(50, 50, 30, 30);

        g2d.draw(new Ellipse2D.Double(100, 100, 30, 30));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mini Tennis");
        frame.add(new Game2());
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
