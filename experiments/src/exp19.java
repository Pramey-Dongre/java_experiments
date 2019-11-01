import java.util.Scanner;
class Attendance
{
double ch,ca,per;
void getch(double c)
{
ch=c;
}
void getca(double a)
{
ca =a ;
}
double display()
{
per = ca/ch *100;
    System.out.println("percentage of attendance is......." + per);
    return per;
}
}
public class exp19 
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    Attendance a = new Attendance();
    double held ,attended,percentage;
        System.out.println("enter classes held");
        held = sc.nextDouble();
        a.getch(held);
        System.out.println("enter classes attended");
        attended = sc.nextDouble();
        a.getca(attended);
       percentage = a.display();
       if(percentage <50)
            System.out.println("you have to repeat semester!!!!!!");
       else if(percentage < 75)
            System.out.println("you are not allowed to sit");
       else
            System.out.println("do nothing");
    }
}
