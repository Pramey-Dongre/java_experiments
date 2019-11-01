import java.util.Scanner;
class Shape
{
void area(double rad)
{
    System.out.println("area is = "+  Math.PI*rad*rad);
}
void area(double l ,double b)
{
    System.out.println("area of rectangle is=" + l*b);
}
int area(int s)
{
return s*s;
}
}
public class exp6
{
 public static void main(String args[])
 {
 Shape s = new Shape();
 Scanner sc = new Scanner(System.in);
 System.out.println("enter radius of circle");
  double r = sc.nextDouble();
  s.area(r);
 System.out.println("enter length and breadth of rectangle.....");
 double len = sc.nextDouble();
 double bre = sc.nextDouble();
 s.area(len, bre);
 System.out.println("enter side of square");
 int side = sc.nextInt();
 int area = s.area(side);
     System.out.println("the area of square is:-"+ area);
 }
}
