package pramey;//for 7th exp
public class Product 
{
    double price;
    String name;
    public void getdata(double p ,String s)
    {
    price = p;
    name = s;
    }
    public void display()
    {
        System.out.println(name + " costs " + price + "$");
    }
}
