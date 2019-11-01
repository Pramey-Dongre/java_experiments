class Radius
{
double rad;
Radius(double r)
{
rad = r;
}
}
class Area extends Radius
{
Area(double radi)
{
super(radi) ;
}
double area()
{
return 4*Math.PI*rad*rad;
}
}
class Volume extends Area
{
Volume(double r)
{
super(r);
}
double volume()
{
    return area()*rad/3;
}
}
public class exp11 
{
    public static void main(String args[])
    {
    Area a = new Area(2);
    Volume v = new Volume(2);
    double ar = a.area();
    double vo = v.volume();
        System.out.println("" + ar +" "+vo);
    }
    
}
