import java.io.*;
class number
{
boolean isprime(int n)
{
int i,count = 0;
for(i=1;i<=n;i++)
{
if(n%i == 0)
{
count = count +1;
}
}
if(count == 2)
return true;
else
return false;
}
}
public class exp3 
{
    public static void main(String args[])
    {
    number n = new number();
    for(int i = 1;i<=1000;i++)
    {
    if(n.isprime(i))
    {
        System.out.println(i+" is prime ");
    }
    }
    }
}
