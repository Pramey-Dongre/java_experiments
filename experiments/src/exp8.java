import java.util.Scanner;
public class exp8 
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int a[][] = new int [10][10];
    int i,j,r,c;
        System.out.println("enter number of rows and columns:--");
        r = sc.nextInt();
        c = sc.nextInt();
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
            System.out.println("enter element");
            a[i][j] = sc.nextInt();
            }   
        }
        System.out.println("entered matrix is:--");
          for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
            System.out.printf("%d   ",a[i][j]);
            }
            System.out.printf("\n");
        }
          System.out.println("transpose of entered matrix is:--");
            for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
            System.out.printf("%d   ",a[j][i]);
            }
            System.out.printf("\n");
        }
    
    }
}
