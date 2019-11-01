import java.util.Scanner;
import pramey.Product;
public class exp7
{
public static void main(String args[])
{
Product pr = new Product();
Scanner sc = new Scanner(System.in);
   String name ;
   System.out.println(" enter name:--");
    name= sc.nextLine();
    System.out.println("enter price");
    double p = sc.nextDouble();
    pr.getdata(p,name);
    pr.display();
}
}
