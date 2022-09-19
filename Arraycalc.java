import java.util.Scanner;
public class Arraycalc {
    public static void main(String[] args) {
        int n;
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
            System.out.println("Square of "+arr[i]+" is "+arr[i]*arr[i]+" And Cube is "+arr[i]*arr[i]*arr[i]);
        }
    }
}
