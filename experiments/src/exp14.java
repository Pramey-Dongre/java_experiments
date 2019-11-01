import java.util.Scanner;
class Myexception extends Exception
{
Myexception()
{
    System.out.println("enter even number!!!!!");
}
}
public class exp14
{
    public static void main(String args[])
    {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter even number");
     n=sc.nextInt();
     try
     {
     if(n%2 != 0)
     {
     Myexception m = new Myexception();
     throw m;
     }
     else
             System.out.printf("the square of %d is %d",n,n*n);
     }
     catch(Myexception e)
             {
                 System.out.println("exception caught");
             }
        finally
     {
         System.out.println("this will execute no  matter what");
     }
    }
}
