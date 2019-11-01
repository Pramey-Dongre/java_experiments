import java.applet.*;
import java.awt.*;
public class prac17 extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.BLUE);
g.drawLine(50,50,150,500);
g.setColor(Color.RED);
g.drawOval(70,50,150,30);
g.setColor(Color.GREEN);
g.drawRect(300,50,150,300);
}
}