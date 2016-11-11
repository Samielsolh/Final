import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics extends JPanel
{
  public void paintComponent1(Graphics g)
  {
    if(input.getString("h")){
    super.paintComponent(g);

    g.setColor(Color.BLUE);

    g.drawRect(20, 40, 150, 45);

    g.setColor(Color.WHITE);

    g.drawString("Who won the SuperBowl?", 55, 65);
  }
    else{
    super.paintComponent(g);

    g.setColor(Color.BLUE);

    g.drawRect(20, 40, 150, 45);

    g.setColor(Color.WHITE);

    g.drawString(general, 55, 65);
  }
  String[][] general={
		{"dsfokfnglksd", "sndjfng", "sogndkgd",
  "snjdslnf", "sndfkls", "dkfjsdn", "lksdnfsdknf"}
	};
  String[][] specific={
    {""}
 };
  public static void main(String[] args)
  {
    int i = 0;
    while(int i < 20){
    JFrame window = new JFrame("Siri");

    window.setBounds(300, 300, 200, 150);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Graphics panel = new Graphics();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}
}
