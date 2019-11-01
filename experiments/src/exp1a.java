
import java.io.*;

public class exp1a 
{
    public static void main(String args[]) throws IOException
    {
    int n,s;
    String a;
    BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a number");
        a = str.readLine();
        n = Integer.parseInt(a);
        s=n>>3;
        System.out.println("Result = "+ s);
    }
    
}
