import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics extends JPanel
{


  public void paintComponent1(Graphics g)
  {
    super.paintComponent(g);

    g.setColor(Color.BLUE);

    g.drawRect(20, 40, 150, 45);

    g.setColor(Color.WHITE);

    g.drawString("Who won the SuperBowl?", 55, 65);

  }

  public static void main(String[] args)
  {

    JFrame window = new JFrame("Siri");
    window.setBounds(300, 300, 200, 150);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    window.setVisible(true);
  }

}
