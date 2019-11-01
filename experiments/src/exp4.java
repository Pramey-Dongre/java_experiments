import java.io.*;
import java.util.Scanner;
class Circle
{
    double r;
    void getradius(double ra)
    {
    r = ra;
    }
void area()
{
    System.out.println("The area is " + 3.1457*r*r);
}
void circumference()
{
    System.out.println("The circumference is " + 2*3.1457*r);
}
}
public class exp4 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    Circle c =new Circle();
    double rad;
        System.out.println("Enter radius of the circle");
        rad = sc.nextDouble();
        c.getradius(rad);
        c.area();
        c.circumference();
    }
    
}
