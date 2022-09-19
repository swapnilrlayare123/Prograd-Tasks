import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of rows");
        int N,temp=1;
        N=sc.nextInt();
       int  k = 1;

        for(int i=1; i<=N; i++)
        {
            // Logic to print numbers
            for(int j=1; j<=i; j++, k++)
            {
                System.out.print(" "+k);
            }
            System.out.println();

        }
    }
}
