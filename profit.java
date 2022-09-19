import java.util.Scanner;
public class profit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float cost_p,sell_p;
        System.out.println("Enter the Cost price of object");
        cost_p=sc.nextFloat();
        System.out.println("Enter the Selling price of object");
        sell_p=sc.nextFloat();
        System.out.println("The profit obtain is "+(sell_p-cost_p));
    }
}
