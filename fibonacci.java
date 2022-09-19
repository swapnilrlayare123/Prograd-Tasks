import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int num,n3=0,n2=1,n1=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        System.out.println(+n1+"\n"+n3);
        for(int i=0;i<=num;i++)
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }

    }
}