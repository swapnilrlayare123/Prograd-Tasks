import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        int x,y,power=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        x=sc.nextInt();
        System.out.println("Enter to the power you want to calculate");
        y=sc.nextInt();
        for(int i=1;i<=y;i++)
        {
            power=power*x;
        }
        System.out.println(x+" to the power "+y+" is "+power);
    }
}
