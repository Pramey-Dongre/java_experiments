import java.util.*;
abstract class shape
{
protected double r,l,b,s,ar;
abstract void getdata(double a ,double b);
abstract void area();
abstract void display();
}
class circle extends shape
{
void getdata(double r ,double x)
{
this.r = r;
}
void area()
{
this.ar = Math.PI*r*r;
}
void display()
{
    System.out.println("area is = "+ ar);
}
}
class rectangle extends shape
{
void getdata(double l ,double b)
{
this.l = l;
this.b=b;
}
void area()
{
this.ar = l*b;
}
void display()
{
    System.out.println("area is = "+ ar);
}
}
class square extends shape
{
void getdata(double s ,double b)
{
this.s = s;
}
void area()
{
this.ar = s*s;
}
void display()
{
    System.out.println("area is = "+ ar);
}
}
public class exp12
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 circle c = new circle();
 rectangle r = new rectangle();
 square s = new square();
 double radius,area,length,breadth,side;
     System.out.println("enter radius");
     radius = sc.nextDouble();
     c.getdata(radius, 0);
     c.area();
     c.display();
     System.out.println("enter length and breadth");
     length = sc.nextDouble();
     breadth = sc.nextDouble();
     r.getdata(length, breadth);
     r.area();
     r.display();
     System.out.println("Enter side of Square");
     side = sc.nextDouble();
     s.getdata(side,0);
     s.area();
     s.display();
 }
}
