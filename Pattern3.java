import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        int i, j, N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows ");
        N=sc.nextInt();

        for(i=N; i>=1; i--)
        {
            // Logic to print numbers
            for(j=i; j>=1; j--)
            {
                System.out.print(" "+j);
            }

            System.out.println();
        }
    }
}