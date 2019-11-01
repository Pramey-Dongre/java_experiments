import java.awt.*;
import java.applet.*;
public class Exp17 extends Applet {

    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g)
    {
    g.setColor(Color.MAGENTA);
    g.drawLine(30,300,200,10);
    g.setColor(Color.blue);
    g.drawOval(250, 50, 50, 100);
    g.setColor(Color.red);
    g.drawRect(400,50,200,100);
    }
}
