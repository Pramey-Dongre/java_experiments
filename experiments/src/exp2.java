import java.util.Scanner;
import java.lang.*;
public class exp2 {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    double a,b,c,marks;
        System.out.println("Enter the marks of a student");
        marks = sc.nextDouble();
        a = marks /10;
        if(a > 10)
        {
            System.out.println("Enter valid marks!!!!!!!");
            return;
        }
        else
        {
        switch((int)a)
        {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("FAIL");
                break;
            case 4:
                System.out.println("PASS");
                break;
            case 5:
                System.out.println("SECOND CLASS");
                break;
            case 6:
                System.out.println("FIRST CLASS");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("DISTINCTION");
                break;
        }
        }
        
    }
    
}
