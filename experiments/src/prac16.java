import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class prac16 extends Applet implements ActionListener
{
TextField t1,t2;
Label  l,m,n;
Button b;
public void init()
{
    b= new Button("Print");
    l = new Label("Enter Name and roll");
t1 = new TextField(10);
t2 = new TextField(10);
add(l);
add(t1);
add(t2);
add(b);
}
public void paint(Graphics g)
{
String s1 = t1.getText();
String s2 = t2.getText();
g.drawString("Name:-" + s1 , 100,100);
g.drawString("Roll:-" + s2 , 100,200);
}
public void actionPerformed(ActionEvent ae)
{
    String s4 = t1.getText();
    String s5 = t2.getText();
    m = new Label(s4); 
}
}