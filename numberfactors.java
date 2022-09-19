import java.util.Scanner;
public class numberfactors {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        num=sc.nextInt();
        System.out.println("Factors of given numbers are ");
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
