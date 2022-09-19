import java.util.Scanner;
public class Totalamount {
    public static void main(String[] args) {
        double cpi,quantity,total_cost;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost per item");
        cpi=sc.nextDouble();
        System.out.println("Enter Quantity");
        quantity=sc.nextFloat();
        total_cost=cpi*quantity;
        if(quantity>=10)
        {
            total_cost=total_cost-(total_cost*0.1);
        }
        System.out.println("The total cost is "+total_cost);
    }
}
