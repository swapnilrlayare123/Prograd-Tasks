import java.util.Scanner;
public class LargeAndSmall {
    public static void main(String[] args) {
        int n,large=0,small=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;i++)
            {
                if(arr[i]>arr[j])
                {
                    large=arr[i];
                }
                else
                {
                    large=arr[j];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;i++)
            {
                if(arr[i]<arr[j])
                {
                    small=arr[i];
                }
                else
                {
                    small=arr[j];
                }
            }
        }
        System.out.println("The largest number is "+large+" and smallest number is "+small);
    }
}