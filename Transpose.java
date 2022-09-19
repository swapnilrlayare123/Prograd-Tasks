import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        System.out.println("Enter size of matrix...put 2 press enter and 2 for 2X2");
        Scanner sc=new Scanner(System.in);
        int s1,s2;
        s1=sc.nextInt();
        s2=sc.nextInt();
        System.out.println("Enter elements of matrix");
        int m[][]=new int[s1][s2];
        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix before transpose is ");
        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
                System.out.print(" "+m[i][j]);
            }
            System.out.println();
        }
        System.out.println("After transpose matrix is");
        int mt[]=new int[s1+s2];
        for(int k=0;k<(s1+s2);k++)
        {
        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
                mt[k]=m[i][j];
            }
        }
        }
        int m2[][]=new int[s2][s1];
        for(int k=0;k<(s1+s2);k++) {
            for (int i = 0; i < s1; i++) {
                for (int j = 0; j < s2; j++) {
                   mt[k]=m[i][j];
                }
            }
        }
        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
                System.out.print(" "+m[i][j]);
            }
            System.out.println();
        }
    }
}
