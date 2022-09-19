import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter 5 Integers");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Elements after adding 5 are");
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]=arr[i]+5);
        }
    }
}
