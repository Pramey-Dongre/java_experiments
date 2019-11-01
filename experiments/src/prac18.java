import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class prac18 extends Applet implements ActionListener
{
Label na,age,add,con;
TextField tna,tage,tadd,tcon;
TextArea fin;
Button b;
public void init()
{
    
    fin = new TextArea();
    add(fin);
    fin.setBounds(300,10,300,300);
    setLayout(null);
na = new Label("Enter your name");
age = new Label("Enter your age");
add = new Label("Enter your address");
con = new Label("Enter contact number");
add(na);
add(age);
add(add);
add(con);
na.setBounds(0,10,100,30);
age.setBounds(0,50,100,30);
add.setBounds(0,90,100,30);
con.setBounds(0,130,100,30);
tna = new TextField(10);
tage = new TextField(10);
tadd = new TextField(10);
tcon = new TextField(10);
add(tna);
add(tage);
add(tadd);
add(tcon);
tna.setBounds(105,10,100,30);
tage.setBounds(105,50,100,30);
tadd.setBounds(105,90,100,30);
tcon.setBounds(105,130,100,30);
b = new Button("Print");
add(b);
b.setBounds(50,170,50,50);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String s1,s2,s3,s4;
s1 = tna.getText();
s2 = tage.getText();
s3 = tadd.getText();
s4 = tcon.getText();
fin.setText("The details are as follows \n\n Name:- "+ s1 +"\n Age:--" + s2 + "\n Address-" + s3 + "\n Contact no:-" + s4);
}
}