import java.util.Scanner;
class Num
{
public static int a;
}
class Takeinput implements Runnable
{
public void run()
{
    Num ob = new Num();
Scanner sc = new Scanner(System.in);
    System.out.println("enter a number to calculate its square");
ob.a = sc.nextInt();
}
}
class Givesquare implements Runnable
{
public void run()
{
Num ob = new Num();
int num = ob.a;
    System.out.println("The square of number is  " + num*num);
}
}
        
public class exp15 
{
public static void main(String args[])
{
int no;
Takeinput t1 =new Takeinput();
Thread T1 = new Thread(t1);
Givesquare t2 = new Givesquare();
Thread T2 = new Thread(t2);
T1.run();
T2.run();
}
}
