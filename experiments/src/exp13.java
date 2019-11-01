import java.util.Scanner;
class student
{
int roll_no;
void getroll(int roll_no)
{
this.roll_no = roll_no;
}
void putroll()
{
    System.out.println("roll no is = "+ roll_no);
}
}
class Test extends student
{
double sem1,sem2;
void getmarks(double sem1,double sem2)
{
this.sem1=sem1;
this.sem2=sem2;
}         
void putmarks()
{
    System.out.printf("marks of sem1 and sem2 are "+sem1 + "  &  " +sem2 +" respectively\n");
}
}
interface Sports
{
public void getscore(double score);
public void display();
}
class Result extends Test implements Sports
{
double total,sco;
public void getscore(double sco)
{
this.sco = sco;
}
void calculate()
{
total = sem1+sem2+sco;
}
public void display()
{
    System.out.println("total marks are:--  " + total);
}
}
public class exp13 
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    Result r = new Result();
        System.out.println("enter roll number");
        int roll = sc.nextInt();
        r.roll_no = roll;
        r.getmarks(80, 90);
        r.getscore(75);
        r.calculate();
        r.putroll();
        r.putmarks();
        r.display();
    }
}
