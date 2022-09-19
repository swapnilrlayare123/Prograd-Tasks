import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        int i, j, N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows ");
        N=sc.nextInt();

        for(i=1; i<=N; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(" "+i);
            }

            System.out.println();;
        }
    }
}
