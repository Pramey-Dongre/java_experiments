import java.util.Scanner;
class Complex
{
double real,img;
Complex add(Complex c ,Complex d)
{
    this.real = c.real + d.real;
    this.img = c.img + d.img;
    return this;
}
}
public class exp5 
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    Complex c1 = new Complex();
    Complex c2 = new Complex();
    Complex c3 = new Complex();
        System.out.println("Enter first complex number");
        c1.real = sc.nextDouble();
        c1.img = sc.nextDouble();
               System.out.println("Enter second complex number");
        c2.real = sc.nextDouble();
        c2.img = sc.nextDouble();
        c3 = c3.add(c1,c2);
        System.out.println("the sum is:-"+ c3.real + "+i" + c3.img );
    
    }
   
    
}
