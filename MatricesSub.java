import java.util.Scanner;
public class MatricesSub {
    public static void main(String[] args) {
        byte s1,s2,s3,s4;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of first matrix..Type 2 enter na then 2 for 2X2");
        s1=sc.nextByte();
        s2=sc.nextByte();
        System.out.println("Enter the Size of second matrix..Type 2 enter na then 2 for 2X2");
        s3=sc.nextByte();
        s4=sc.nextByte();
        int m1[][]=new int[s1][s2];
        int m2[][]=new int[s3][s4];
        if(s1==s2&&s3==s4)
        {
            System.out.println("Enter the elements of first matrix");
            for(int i=0;i<s1;i++)
            {
                for(int j=0;j<s2;j++)
                {
                    m1[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the elements of first matrix");
            for(int i=0;i<s3;i++)
            {
                for(int j=0;j<s4;j++)
                {
                    m2[i][j]=sc.nextInt();
                }
            }
            System.out.println("first matrix is");
            for(int i=0;i<s1;i++)
            {
                for(int j=0;j<s2;j++)
                {
                    System.out.print(" "+m1[i][j]);
                }
                System.out.println();
            }
            System.out.println("second matrix is");
            for(int i=0;i<s3;i++)
            {
                for(int j=0;j<s4;j++)
                {
                    System.out.print(" "+m2[i][j]);
                }
                System.out.println();
            }
            System.out.println("substraction of matrix is");
            for(int i=0;i<s1;i++)
            {
                for(int j=0;j<s2;j++)
                {
                    System.out.print(" "+(m2[i][j]-m1[i][j]));
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Both Matrix sizes should be same cannot substract the two matrix");
        }
    }
}
