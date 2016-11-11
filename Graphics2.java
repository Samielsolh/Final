import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloGraphics extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    g.setColor(Color.BLUE);

    g.fillRect(20, 40, 150, 45);

    g.setColor(Color.WHITE);

    g.drawString("Hello, Graphics!", 55, 65);
  }

  public static void main(String[] args)
  {
<<<<<<< HEAD
    JFrame window = new JFrame("Graphics Demo");

    window.setBounds(300, 300, 200, 150);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    HelloGraphics panel = new HelloGraphics();
=======

    JFrame window = new JFrame("Siri");
    window.setBounds(300, 300, 200, 150);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Graphics panel = new Graphics();
>>>>>>> origin/master
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}
