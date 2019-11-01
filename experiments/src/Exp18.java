import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Exp18 extends Applet implements ActionListener
{

    Label l,Name ,Age;
    Label s,add,dep,con,dob;
    TextField tName,tAge,ts,tadd,tdep,tcon,tdob;
    TextArea fin;
    Button b ;
    public void init() {
        b = new Button("Print");
        l = new Label("Student Information");
        Name = new Label("Name");
        Age = new Label("Age");
        s = new Label("SEX(M/F)");
        add = new Label("Addresss");
        dep = new Label("Department");
        con = new Label("Contact No:--");
        dob = new Label("Date of birth:-");
        fin = new TextArea("");
        setLayout(null);
        add(fin);
        add(l);
        add(Name);
        add(Age);
        add(s);
        add(add);
        add(dep);
        add(con);
        add(dob);
        fin.setBounds(200,100,100,100);
        l.setBounds(100, 10, 200,10);
        Name.setBounds(0,50,100,10);
        Age.setBounds(0,100,100,10);
        s.setBounds(0,150,100,10);
        add.setBounds(0,200,100,10);
        dep.setBounds(0,250,100,10);
        con.setBounds(0,300,100,10);
        dob.setBounds(0,350,100,10);
        tName = new TextField();
        tAge = new TextField();
        ts = new TextField();
        tadd = new TextField();
        tdep = new TextField();
        tcon = new TextField();
        tdob = new TextField();
        add(tName);
        add(tAge);
        add(ts);
        add(tadd);
        add(tdep);
        add(tcon);
        add(tdob);
        tName.setBounds(105,50,100,20);
        tAge.setBounds(105,100,100,20);
        ts.setBounds(105,150,100,20);
        tadd.setBounds(105,200,100,20);
        tdep.setBounds(105,250,100,20);
        tcon.setBounds(105,300,100,20);
        tdob.setBounds(105,350,100,20);
        add(b);
        b.addActionListener(this);
         b.setBounds(300,400,100,20);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b)
        {
    String name = tName.getText();
    String age = tAge.getText();
    String sex = ts.getText();
    String address = tadd.getText();
    String con = tcon.getText();
    String dob = tdob.getText();
    fin.setText(name);
        }
    }


    // TODO overwrite start(), stop() and destroy() methods
}
