import java.util.*;
class Employee
{
protected int ser;
protected double sal,b;
void getsalser(double sal,int ser)
{
this.sal = sal;
this.ser = ser;
}
double bonus()
        {
          if(ser > 5)
              b = 0.05*sal;
          else
              b=0;
        return b;
        }
}
public class exp22 
{
    public static void main(String args[])
    {
    Scanner sc= new Scanner(System.in);
    Employee e = new Employee();
        System.out.println("Enter salary and service");
    double salary = sc.nextDouble();
    int service = sc.nextInt();
    e.getsalser(salary, service);
    double bon = e.bonus();
    double total = salary + bon;
        System.out.println("Total Salary is  " + total);
    }
}
