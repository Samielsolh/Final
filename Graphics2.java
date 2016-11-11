import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloGraphics extends JPanel
{
<<<<<<< HEAD
  public void paintComponent(Graphics g)
=======


  public void paintComponent1(Graphics g)
>>>>>>> origin/master
  {
    super.paintComponent(g);

    g.setColor(Color.BLUE);

<<<<<<< HEAD
    g.fillRect(20, 40, 150, 45);

    g.setColor(Color.WHITE);

    g.drawString("Hello, Graphics!", 55, 65);
=======
    g.drawRect(20, 40, 150, 45);

    g.setColor(Color.WHITE);

    g.drawString("Who won the SuperBowl?", 55, 65);

>>>>>>> origin/master
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
<<<<<<< HEAD
    Graphics panel = new Graphics();
>>>>>>> origin/master
=======
>>>>>>> origin/master
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    window.setVisible(true);
  }
<<<<<<< HEAD
=======

>>>>>>> origin/master
}
