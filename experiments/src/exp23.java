import java.util.*;
class Shop
{
final double pr=100;
double quan,dis,tot;
void getquan(double quan)
{
this.quan = quan;
}
double calculate()
{
    tot= pr*quan;
    if(tot >1000)
    {
        dis = tot*0.1;
        tot = tot - dis;
        return tot;
    }
else
return tot;
}

}
public class exp23
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    Shop s = new Shop();
        System.out.println("Enter quantity");
        double quantity = sc.nextDouble();
        s.getquan(quantity);
        double cost = s.calculate();
        System.out.println("Cost is " + cost);
    }
}
