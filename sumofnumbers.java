import java.util.Scanner;
public class sumofnumbers {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of number is "+sum);
    }
}