import java.io.*;
import java.util.*;
class num
{
public static int a;
}
class input implements Runnable
{
  public void run()
  {
      num ob = new num();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number...");
      ob.a = sc.nextInt();
  }
}
class Square implements Runnable
{
public void run()
{
    num ob = new num();
    int n = ob.a;
    System.out.println("the sqaure is..." + n*n);
}
}
public class prac15
{
    public static void main(String args[])
    {
        input t1 = new input();
        Square t2 = new Square();
        Thread T1 = new Thread(t1);
        Thread T2 = new Thread(t2);
        t1.run();
        t2.run();
    }
}