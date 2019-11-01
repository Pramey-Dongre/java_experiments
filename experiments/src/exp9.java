import java.util.Scanner;
public class exp9 
{
    public static void  main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    String s;
        System.out.println("enter a string");
        s = sc.nextLine();
    StringBuffer abc = new StringBuffer(s);
    abc.reverse();
    String s2 = abc.toString();
    if(s.compareTo(s2) == 0)
    {
        System.out.println("YES");
    }
    else
            System.out.println("NO");
    }
}
