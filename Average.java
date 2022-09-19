import java.util.Scanner;
public class Average {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter marks of english");
        a=sc.nextInt();
        System.out.println("enter marks of Maths");
        b=sc.nextInt();
        System.out.println("enter marks of Science");
        c=sc.nextInt();
        System.out.println("Average marks are "+((a+b+c)/(float)3));
    }
}
