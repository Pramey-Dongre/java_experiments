import java.util.*;
import java.io.*;
class data
{
String name;
int roll,age;
data()
{

}
data(String n , int r ,int a)
{
name = n;
roll = r;
age = a;
}
public void display()
{
    System.out.printf("\n The name is %s and roll and age are %d And %d respectively",name,roll,age);
}
}
class Vect
{
    Vector<data> vec = new Vector<>();
    public void add()
    {
    Scanner sc = new Scanner(System.in);
    String na;
    int ro,ag;
        System.out.println("Enter name roll and age");
        na = sc.nextLine();
        ro=sc.nextInt();
     ag=sc.nextInt();
     data d = new data(na,ro,ag);
     vec.addElement(d);
    }
    public void show()
    {
    for( data v: vec)
    {
        v.display();
    }
    }
}
public class exp10
{
public static void main(String args[])
{
 
       Scanner sc = new Scanner(System.in);
       Vect st = new Vect();
        while(true)
        {
            st.add();
            System.out.println("1.cont 2.exit");
            int ch = sc.nextInt();
            if(ch == 2)
            {
                st.show();
                break;
            }
        }
}
}