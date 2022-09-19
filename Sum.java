import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the three digit number");
        num=sc.nextInt();
        int arr[]=new int[3];
        arr[0]=num%10;
        num=num/10;
        arr[1]=num%10;
        num=num/10;
        arr[2]=num%10;
        num=num/10;
        System.out.println(arr[0]+arr[1]+arr[2]);
    }
}
