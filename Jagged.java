import java.util.Scanner;
public class Jagged {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int colum;
        System.out.println("Enter no. of colums");
        colum=sc.nextInt();
        int arr[] = new int[colum][];
        int temp;
        for(int i;i<colum;i++) {
            System.out.println("Enter no. of rows you want in column " + i);
            temp= sc.nextInt();
            int arr[]=new [temp];
            System.out.println("enter the elements for of rows in column "+i);
            for(int j;j<temp;j++)
            {
                arr[colum][temp]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the array");
        for(int k=0;k<arr.length;k++)
        {

        }


    }
}
